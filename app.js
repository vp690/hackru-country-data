/**
 * Paris Compass — Frontend (vanilla JS + Leaflet)
 *
 * Expected backend endpoints (Java on IntelliJ):
 *   GET /api/countries
 *      -> GeoJSON FeatureCollection of countries with properties.iso_a3 and properties.admin
 *   GET /api/index?topic=<topic>
 *      -> { topic, lastUpdated, data: [ { iso_a3, index (0..1), summary, sources[] } ] }
 *      topics: emissions | energy | eco_footprint
 */

// ================== Fetch layer (timeout + retries + cache) ==================
const BASE_URL = ""; // same-origin; set e.g. to "http://localhost:8080" if your API runs elsewhere
const DEFAULT_TIMEOUT_MS = 12000;
const MAX_RETRIES = 2; // total attempts = 1 + MAX_RETRIES
const __cache = new Map(); // GET cache per page-load

function withTimeout(promise, ms) {
  const controller = new AbortController();
  const t = setTimeout(() => controller.abort(), ms);
  const wrapped = (async () => {
    try {
      const res = await promise(controller.signal);
      return res;
    } finally {
      clearTimeout(t);
    }
  })();
  wrapped.abortController = controller;
  return wrapped;
}

async function fetchJSON(url, options = {}, timeoutMs = DEFAULT_TIMEOUT_MS) {
  const isGET = !options.method || options.method.toUpperCase() === "GET";
  const absolute = `${BASE_URL}${url}`;
  const key = isGET ? `GET ${absolute}` : null;
  if (key && __cache.has(key)) return __cache.get(key);

  let lastErr;
  for (let attempt = 0; attempt <= MAX_RETRIES; attempt++) {
    try {
      const res = await withTimeout(
        (signal) => fetch(absolute, { ...options, signal }),
        timeoutMs
      );

      if (!res.ok) {
        const txt = (await res.text().catch(() => "")).slice(0, 600);
        const err = new Error(`HTTP ${res.status} on ${absolute}${txt ? ` – ${txt}` : ""}`);
        err.status = res.status;
        throw err;
      }

      const data = await res.json();
      if (key) __cache.set(key, data);
      return data;
    } catch (err) {
      lastErr = err;
      const isAbort = err?.name === "AbortError";
      const is5xx = err?.status >= 500 && err?.status <= 599;
      if (attempt < MAX_RETRIES && (isAbort || is5xx)) {
        const backoff = 150 * (attempt + 1) * (attempt + 1);
        await new Promise((r) => setTimeout(r, backoff));
        continue;
      }
      const hint = isAbort
        ? "The request timed out. Please check your connection and try again."
        : "Failed to load data. Please try again.";
      const wrapped = new Error(`${hint} (${err?.message || err})`);
      wrapped.cause = err;
      throw wrapped;
    }
  }
  throw lastErr || new Error("Unknown fetch error");
}

function clearApiCache(){ __cache.clear(); }

// API wrappers
async function apiFetchCountries(){
  return fetchJSON(`/api/countries`);
}
async function apiFetchTopicIndex(topic){
  validateTopic(topic);
  return fetchJSON(`/api/index?topic=${encodeURIComponent(topic)}`);
}
function validateTopic(topic){
  const allowed = ["emissions","energy","eco_footprint"]; // keep in sync with UI
  if(!allowed.includes(topic)) throw new Error(`Invalid topic: ${topic}`);
}

// ---------- Simple utilities ----------
const el = (id) => document.getElementById(id);
const $  = (sel, root=document) => root.querySelector(sel);
const $$ = (sel, root=document) => Array.from(root.querySelectorAll(sel));

// Red (bad) to blue (good) color for 0..1
function colorScale(t){
  const clamp = Math.max(0, Math.min(1, t ?? 0));
  const r0=239,g0=68,b0=68;   // red
  const r1=59,g1=130,b1=246;  // blue
  const r = Math.round(r0 + (r1 - r0) * clamp);
  const g = Math.round(g0 + (g1 - g0) * clamp);
  const b = Math.round(b0 + (b1 - b0) * clamp);
  return `rgb(${r},${g},${b})`;
}

// Format an index number for display
const fmt = (v) => (v===null || v===undefined || Number.isNaN(v)) ? '—' : Number(v).toFixed(2);

// Topic labels & sources (for badges)
const TOPIC_META = {
  emissions:     { label: 'Emissions',            source: 'OWID (CO₂) / UNFCCC' },
  energy:        { label: 'Energy Usage',         source: 'OWID (Renewables) / IRENA' },
  eco_footprint: { label: 'Ecological Footprint', source: 'Global Footprint Network' }
};

// ---------- Screen bootstrap ----------
let map, countryLayer;
let countryIndexByISO = new Map(); // iso_a3 -> { index, summary, sources }

function startApp(){
  // Hide welcome, show gauge
  $('#welcome').style.display = 'none';
  $('#gauge').style.display   = 'block';
  initMap();
}

// Bind start button after DOM is ready
document.addEventListener('DOMContentLoaded', () => {
  const startBtn = el('startBtn');
  if (startBtn) startBtn.addEventListener('click', startApp);
});

function initMap(){
  map = L.map('map', {
    worldCopyJump: true,
    minZoom: 1.5,
    maxZoom: 8,
    zoomSnap: 0.25,
    zoomDelta: 0.5
  }).setView([20, 0], 2.1);

  L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
    attribution: '&copy; OpenStreetMap contributors'
  }).addTo(map);

  // Load countries, then default topic
  loadCountries()
    .then(() => loadTopic('emissions'))
    .catch((err) => {
      console.error('Initialization error', err);
      buildCountryLayer(window.__DEMO_GEOJSON);
      applyTopicData('emissions', window.__DEMO_INDEX.emissions);
    });

  // Topic tab clicks
  $$('.tab').forEach(btn => {
    btn.addEventListener('click', async (ev) => {
      ev.preventDefault();
      const topic = btn.dataset.topic;
      $$('.tab').forEach(b => b.setAttribute('aria-pressed', 'false'));
      btn.setAttribute('aria-pressed', 'true');
      if (map) map.closePopup();
      await loadTopic(topic);
    });
  });
}

async function loadCountries(){
  try{
    const geojson = await apiFetchCountries();
    buildCountryLayer(geojson);
  }catch(e){
    console.warn('Falling back to demo countries', e);
    buildCountryLayer(window.__DEMO_GEOJSON);
  }
}

function buildCountryLayer(geojson){
  if(countryLayer){ countryLayer.remove(); }
  countryLayer = L.geoJSON(geojson, {
    style: () => ({
      color: 'rgba(255,255,255,.25)',
      weight: 0.8,
      fillOpacity: 0.9,
      fillColor: '#2b2f42'
    }),
    onEachFeature: (feature, layer) => {
      layer.on({
        mouseover: (e) => e.target.setStyle({ weight: 2.0 }),
        mouseout:  (e) => e.target.setStyle({ weight: 0.8 }),
        click: () => openPopup(feature, layer)
      });
    }
  }).addTo(map);
}

async function loadTopic(topic){
  const meta = TOPIC_META[topic] || { label: topic, source: '' };
  el('topicLabel').textContent = meta.label;
  el('sourceLabel').textContent = meta.source;

  try{
    const payload = await apiFetchTopicIndex(topic);
    const { lastUpdated, data } = payload;
    el('lastUpdated').textContent = lastUpdated || '—';
    applyTopicData(topic, data);
  }catch(e){
    console.warn('Falling back to demo topic data', e);
    el('lastUpdated').textContent = 'Demo';
    applyTopicData(topic, window.__DEMO_INDEX[topic]);
  }
}

function applyTopicData(topic, rows){
  countryIndexByISO.clear();
  (rows || []).forEach(r => {
    countryIndexByISO.set((r.iso_a3||'').toUpperCase(), {
      index: typeof r.index === 'number' ? Math.max(0, Math.min(1, r.index)) : null,
      summary: r.summary || null,
      sources: Array.isArray(r.sources) ? r.sources : []
    });
  });

  if (!countryLayer) return;

  countryLayer.eachLayer(layer => {
    const f = layer.feature;
    const iso = (f.properties.iso_a3 || f.properties.ISO_A3 || '').toUpperCase();
    const d = countryIndexByISO.get(iso);
    const fill = d && typeof d.index === 'number' ? colorScale(d.index) : '#2b2f42';
    layer.setStyle({ fillColor: fill });
  });
}

function openPopup(feature, layer){
  const props = feature.properties || {};
  const iso = (props.iso_a3 || props.ISO_A3 || '').toUpperCase();
  const name = props.admin || props.name || 'Unknown';
  const d = countryIndexByISO.get(iso) || {};

  const srcHtml = (d.sources || []).slice(0,4).map(s => {
    const safe = (''+s).replace(/"/g,'&quot;');
    return `<li><a href="${safe}" target="_blank" rel="noopener">${safe}</a></li>`;
  }).join('');

  const html = `
    <div>
      <div class="popup-title">${name} <span style="opacity:.7;font-weight:600">(${iso||'—'})</span></div>
      <div class="popup-index">Index score: <strong>${fmt(d.index)}</strong> (0–1)</div>
      <div class="popup-summary">${d.summary ? d.summary : 'No summary available yet.'}</div>
      ${srcHtml ? `<div class="popup-sources"><strong>Sources</strong><ul>${srcHtml}</ul></div>` : ''}
    </div>
  `;

  layer.bindPopup(html, { maxWidth: 320 }).openPopup();
}

/* ---------- Demo fallbacks (remove when backend is live) ---------- */
window.__DEMO_GEOJSON = {
  type: 'FeatureCollection',
  features: [
    { type:'Feature', properties:{ admin:'United States', iso_a3:'USA' }, geometry:{ type:'Polygon', coordinates:[ [ [-125,25],[-67,25],[-67,49],[-125,49],[-125,25] ] ] } },
    { type:'Feature', properties:{ admin:'Germany', iso_a3:'DEU' }, geometry:{ type:'Polygon', coordinates:[ [ [5,47],[15,47],[15,55],[5,55],[5,47] ] ] } },
    { type:'Feature', properties:{ admin:'India', iso_a3:'IND' }, geometry:{ type:'Polygon', coordinates:[ [ [68,8],[97,8],[97,35],[68,35],[68,8] ] ] } },
    { type:'Feature', properties:{ admin:'Brazil', iso_a3:'BRA' }, geometry:{ type:'Polygon', coordinates:[ [ [-75,-35],[-34,-35],[-34,5],[-75,5],[-75,-35] ] ] } }
  ]
};

window.__DEMO_INDEX = {
  emissions: [
    { iso_a3:'USA', index: 0.32, summary:'High per-capita emissions with gradual decline; further cuts needed to align with 1.5 °C.', sources:['https://ourworldindata.org/co2-emissions'] },
    { iso_a3:'DEU', index: 0.71, summary:'Strong decarbonization of power sector; coal phase-out underway.', sources:['https://climateactiontracker.org'] },
    { iso_a3:'IND', index: 0.48, summary:'Per-capita emissions relatively low; total emissions rising with growth.', sources:['https://ourworldindata.org/co2-emissions'] },
    { iso_a3:'BRA', index: 0.62, summary:'Power largely low-carbon; land-use emissions remain a challenge.', sources:['https://climatewatchdata.org'] }
  ],
  energy: [
    { iso_a3:'USA', index: 0.45, summary:'Rapid wind/solar buildout; grid & permitting are key bottlenecks.', sources:['https://ourworldindata.org/renewable-energy'] },
    { iso_a3:'DEU', index: 0.78, summary:'High renewable penetration; continued transmission expansion.', sources:['https://irena.org'] },
    { iso_a3:'IND', index: 0.54, summary:'Accelerating solar; ambitious 2030 capacity targets.', sources:['https://ourworldindata.org/renewable-energy'] },
    { iso_a3:'BRA', index: 0.81, summary:'Hydro + growing wind/solar yield high renewable share.', sources:['https://ourworldindata.org/renewable-energy'] }
  ],
  eco_footprint: [
    { iso_a3:'USA', index: 0.20, summary:'Large ecological footprint per capita; far above biocapacity.', sources:['https://data.footprintnetwork.org/'] },
    { iso_a3:'DEU', index: 0.62, summary:'Footprint remains above sustainable threshold but trending down.', sources:['https://data.footprintnetwork.org/'] },
    { iso_a3:'IND', index: 0.74, summary:'Lower per-capita footprint; biocapacity constraints vary regionally.', sources:['https://data.footprintnetwork.org/'] },
    { iso_a3:'BRA', index: 0.68, summary:'Significant biocapacity but pressures from land-use & agriculture.', sources:['https://data.footprintnetwork.org/'] }
  ]
};