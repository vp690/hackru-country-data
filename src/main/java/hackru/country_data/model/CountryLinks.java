package hackru.country_data.model;

import lombok.Getter;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CountryLinks {
    // Declare a static HashMap
    private static final Map<String, List<String>> articlesMap = new HashMap<>();

    // Initialize the static HashMap (can be done in a static block or directly)
    static {
        // ---- A ----
        articlesMap.put("Afghanistan", List.of(
                "https://data.footprintnetwork.org/?countries=AFG",
                "https://ourworldindata.org/co2/country/afghanistan",
                "https://ourworldindata.org/energy/country/afghanistan",
                "https://www.climatewatchdata.org/ndcs/country/AFG/full"
        ));
        articlesMap.put("Albania", List.of(
                "https://data.footprintnetwork.org/?countries=ALB",
                "https://ourworldindata.org/co2/country/albania",
                "https://ourworldindata.org/energy/country/albania",
                "https://www.climatewatchdata.org/ndcs/country/ALB/full"
        ));
        articlesMap.put("Algeria", List.of(
                "https://data.footprintnetwork.org/?countries=DZA",
                "https://ourworldindata.org/co2/country/algeria",
                "https://ourworldindata.org/energy/country/algeria",
                "https://www.climatewatchdata.org/ndcs/country/DZA/full"
        ));
        articlesMap.put("Andorra", List.of(
                "https://data.footprintnetwork.org/?countries=AND",
                "https://ourworldindata.org/co2/country/andorra",
                "https://ourworldindata.org/energy/country/andorra",
                "https://www.climatewatchdata.org/ndcs/country/AND/full"
        ));
        articlesMap.put("Angola", List.of(
                "https://data.footprintnetwork.org/?countries=AGO",
                "https://ourworldindata.org/co2/country/angola",
                "https://ourworldindata.org/energy/country/angola",
                "https://www.climatewatchdata.org/ndcs/country/AGO/full"
        ));
        articlesMap.put("Antigua and Barbuda", List.of(
                "https://data.footprintnetwork.org/?countries=ATG",
                "https://ourworldindata.org/co2/country/antigua-and-barbuda",
                "https://ourworldindata.org/energy/country/antigua-and-barbuda",
                "https://www.climatewatchdata.org/ndcs/country/ATG/full"
        ));
        articlesMap.put("Argentina", List.of(
                "https://data.footprintnetwork.org/?countries=ARG",
                "https://ourworldindata.org/co2/country/argentina",
                "https://ourworldindata.org/energy/country/argentina",
                "https://climateactiontracker.org/countries/argentina/",
                "https://www.climatewatchdata.org/ndcs/country/ARG/full"
        ));
        articlesMap.put("Armenia", List.of(
                "https://data.footprintnetwork.org/?countries=ARM",
                "https://ourworldindata.org/co2/country/armenia",
                "https://ourworldindata.org/energy/country/armenia",
                "https://www.climatewatchdata.org/ndcs/country/ARM/full"
        ));
        articlesMap.put("Australia", List.of(
                "https://data.footprintnetwork.org/?countries=AUS",
                "https://ourworldindata.org/co2/country/australia",
                "https://ourworldindata.org/energy/country/australia",
                "https://climateactiontracker.org/countries/australia/",
                "https://www.climatewatchdata.org/ndcs/country/AUS/full"
        ));
        articlesMap.put("Austria", List.of(
                "https://data.footprintnetwork.org/?countries=AUT",
                "https://ourworldindata.org/co2/country/austria",
                "https://ourworldindata.org/energy/country/austria",
                "https://climateactiontracker.org/countries/austria/",
                "https://www.climatewatchdata.org/ndcs/country/AUT/full"
        ));
        articlesMap.put("Azerbaijan", List.of(
                "https://data.footprintnetwork.org/?countries=AZE",
                "https://ourworldindata.org/co2/country/azerbaijan",
                "https://ourworldindata.org/energy/country/azerbaijan",
                "https://www.climatewatchdata.org/ndcs/country/AZE/full"
        ));

        // ---- B ----
        articlesMap.put("Bahamas", List.of(
                "https://data.footprintnetwork.org/?countries=BHS",
                "https://ourworldindata.org/co2/country/bahamas",
                "https://ourworldindata.org/energy/country/bahamas",
                "https://www.climatewatchdata.org/ndcs/country/BHS/full"
        ));
        articlesMap.put("Bahrain", List.of(
                "https://data.footprintnetwork.org/?countries=BHR",
                "https://ourworldindata.org/co2/country/bahrain",
                "https://ourworldindata.org/energy/country/bahrain",
                "https://www.climatewatchdata.org/ndcs/country/BHR/full"
        ));
        articlesMap.put("Bangladesh", List.of(
                "https://data.footprintnetwork.org/?countries=BGD",
                "https://ourworldindata.org/co2/country/bangladesh",
                "https://ourworldindata.org/energy/country/bangladesh",
                "https://climateactiontracker.org/countries/bangladesh/",
                "https://www.climatewatchdata.org/ndcs/country/BGD/full"
        ));
        articlesMap.put("Barbados", List.of(
                "https://data.footprintnetwork.org/?countries=BRB",
                "https://ourworldindata.org/co2/country/barbados",
                "https://ourworldindata.org/energy/country/barbados",
                "https://www.climatewatchdata.org/ndcs/country/BRB/full"
        ));
        articlesMap.put("Belarus", List.of(
                "https://data.footprintnetwork.org/?countries=BLR",
                "https://ourworldindata.org/co2/country/belarus",
                "https://ourworldindata.org/energy/country/belarus",
                "https://www.climatewatchdata.org/ndcs/country/BLR/full"
        ));
        articlesMap.put("Belgium", List.of(
                "https://data.footprintnetwork.org/?countries=BEL",
                "https://ourworldindata.org/co2/country/belgium",
                "https://ourworldindata.org/energy/country/belgium",
                "https://climateactiontracker.org/countries/belgium/",
                "https://www.climatewatchdata.org/ndcs/country/BEL/full"
        ));
        articlesMap.put("Belize", List.of(
                "https://data.footprintnetwork.org/?countries=BLZ",
                "https://ourworldindata.org/co2/country/belize",
                "https://ourworldindata.org/energy/country/belize",
                "https://www.climatewatchdata.org/ndcs/country/BLZ/full"
        ));
        articlesMap.put("Benin", List.of(
                "https://data.footprintnetwork.org/?countries=BEN",
                "https://ourworldindata.org/co2/country/benin",
                "https://ourworldindata.org/energy/country/benin",
                "https://www.climatewatchdata.org/ndcs/country/BEN/full"
        ));
        articlesMap.put("Bhutan", List.of(
                "https://data.footprintnetwork.org/?countries=BTN",
                "https://ourworldindata.org/co2/country/bhutan",
                "https://ourworldindata.org/energy/country/bhutan",
                "https://www.climatewatchdata.org/ndcs/country/BTN/full"
        ));
        articlesMap.put("Bolivia", List.of(
                "https://data.footprintnetwork.org/?countries=BOL",
                "https://ourworldindata.org/co2/country/bolivia",
                "https://ourworldindata.org/energy/country/bolivia",
                "https://www.climatewatchdata.org/ndcs/country/BOL/full"
        ));
        articlesMap.put("Bosnia and Herzegovina", List.of(
                "https://data.footprintnetwork.org/?countries=BIH",
                "https://ourworldindata.org/co2/country/bosnia-and-herzegovina",
                "https://ourworldindata.org/energy/country/bosnia-and-herzegovina",
                "https://www.climatewatchdata.org/ndcs/country/BIH/full"
        ));
        articlesMap.put("Botswana", List.of(
                "https://data.footprintnetwork.org/?countries=BWA",
                "https://ourworldindata.org/co2/country/botswana",
                "https://ourworldindata.org/energy/country/botswana",
                "https://www.climatewatchdata.org/ndcs/country/BWA/full"
        ));
        articlesMap.put("Brazil", List.of(
                "https://data.footprintnetwork.org/?countries=BRA",
                "https://ourworldindata.org/co2/country/brazil",
                "https://ourworldindata.org/energy/country/brazil",
                "https://climateactiontracker.org/countries/brazil/",
                "https://www.climatewatchdata.org/ndcs/country/BRA/full"
        ));
        articlesMap.put("Brunei Darussalam", List.of(
                "https://data.footprintnetwork.org/?countries=BRN",
                "https://ourworldindata.org/co2/country/brunei",
                "https://ourworldindata.org/energy/country/brunei",
                "https://www.climatewatchdata.org/ndcs/country/BRN/full"
        ));
        articlesMap.put("Bulgaria", List.of(
                "https://data.footprintnetwork.org/?countries=BGR",
                "https://ourworldindata.org/co2/country/bulgaria",
                "https://ourworldindata.org/energy/country/bulgaria",
                "https://www.climatewatchdata.org/ndcs/country/BGR/full"
        ));
        articlesMap.put("Burkina Faso", List.of(
                "https://data.footprintnetwork.org/?countries=BFA",
                "https://ourworldindata.org/co2/country/burkina-faso",
                "https://ourworldindata.org/energy/country/burkina-faso",
                "https://www.climatewatchdata.org/ndcs/country/BFA/full"
        ));
        articlesMap.put("Burundi", List.of(
                "https://data.footprintnetwork.org/?countries=BDI",
                "https://ourworldindata.org/co2/country/burundi",
                "https://ourworldindata.org/energy/country/burundi",
                "https://www.climatewatchdata.org/ndcs/country/BDI/full"
        ));

        // ---- C ----
        articlesMap.put("Cabo Verde", List.of(
                "https://data.footprintnetwork.org/?countries=CPV",
                "https://ourworldindata.org/co2/country/cabo-verde",
                "https://ourworldindata.org/energy/country/cabo-verde",
                "https://www.climatewatchdata.org/ndcs/country/CPV/full"
        ));
        articlesMap.put("Cambodia", List.of(
                "https://data.footprintnetwork.org/?countries=KHM",
                "https://ourworldindata.org/co2/country/cambodia",
                "https://ourworldindata.org/energy/country/cambodia",
                "https://www.climatewatchdata.org/ndcs/country/KHM/full"
        ));
        articlesMap.put("Cameroon", List.of(
                "https://data.footprintnetwork.org/?countries=CMR",
                "https://ourworldindata.org/co2/country/cameroon",
                "https://ourworldindata.org/energy/country/cameroon",
                "https://www.climatewatchdata.org/ndcs/country/CMR/full"
        ));
        articlesMap.put("Canada", List.of(
                "https://data.footprintnetwork.org/?countries=CAN",
                "https://ourworldindata.org/co2/country/canada",
                "https://ourworldindata.org/energy/country/canada",
                "https://climateactiontracker.org/countries/canada/",
                "https://www.climatewatchdata.org/ndcs/country/CAN/full"
        ));
        articlesMap.put("Central African Republic", List.of(
                "https://data.footprintnetwork.org/?countries=CAF",
                "https://ourworldindata.org/co2/country/central-african-republic",
                "https://ourworldindata.org/energy/country/central-african-republic",
                "https://www.climatewatchdata.org/ndcs/country/CAF/full"
        ));
        articlesMap.put("Chad", List.of(
                "https://data.footprintnetwork.org/?countries=TCD",
                "https://ourworldindata.org/co2/country/chad",
                "https://ourworldindata.org/energy/country/chad",
                "https://www.climatewatchdata.org/ndcs/country/TCD/full"
        ));
        articlesMap.put("Chile", List.of(
                "https://data.footprintnetwork.org/?countries=CHL",
                "https://ourworldindata.org/co2/country/chile",
                "https://ourworldindata.org/energy/country/chile",
                "https://climateactiontracker.org/countries/chile/",
                "https://www.climatewatchdata.org/ndcs/country/CHL/full"
        ));
        articlesMap.put("China", List.of(
                "https://data.footprintnetwork.org/?countries=CHN",
                "https://ourworldindata.org/co2/country/china",
                "https://ourworldindata.org/energy/country/china",
                "https://climateactiontracker.org/countries/china/",
                "https://www.climatewatchdata.org/ndcs/country/CHN/full"
        ));
        articlesMap.put("Colombia", List.of(
                "https://data.footprintnetwork.org/?countries=COL",
                "https://ourworldindata.org/co2/country/colombia",
                "https://ourworldindata.org/energy/country/colombia",
                "https://climateactiontracker.org/countries/colombia/",
                "https://www.climatewatchdata.org/ndcs/country/COL/full"
        ));
        articlesMap.put("Comoros", List.of(
                "https://data.footprintnetwork.org/?countries=COM",
                "https://ourworldindata.org/co2/country/comoros",
                "https://ourworldindata.org/energy/country/comoros",
                "https://www.climatewatchdata.org/ndcs/country/COM/full"
        ));
        articlesMap.put("Congo", List.of(
                "https://data.footprintnetwork.org/?countries=COG",
                "https://ourworldindata.org/co2/country/congo",
                "https://ourworldindata.org/energy/country/congo",
                "https://www.climatewatchdata.org/ndcs/country/COG/full"
        ));
        articlesMap.put("Costa Rica", List.of(
                "https://data.footprintnetwork.org/?countries=CRI",
                "https://ourworldindata.org/co2/country/costa-rica",
                "https://ourworldindata.org/energy/country/costa-rica",
                "https://climateactiontracker.org/countries/costa-rica/",
                "https://www.climatewatchdata.org/ndcs/country/CRI/full"
        ));
        articlesMap.put("Côte d’Ivoire", List.of(
                "https://data.footprintnetwork.org/?countries=CIV",
                "https://ourworldindata.org/co2/country/cote-d-ivoire",
                "https://ourworldindata.org/energy/country/cote-d-ivoire",
                "https://www.climatewatchdata.org/ndcs/country/CIV/full"
        ));
        articlesMap.put("Croatia", List.of(
                "https://data.footprintnetwork.org/?countries=HRV",
                "https://ourworldindata.org/co2/country/croatia",
                "https://ourworldindata.org/energy/country/croatia",
                "https://www.climatewatchdata.org/ndcs/country/HRV/full"
        ));
        articlesMap.put("Cuba", List.of(
                "https://data.footprintnetwork.org/?countries=CUB",
                "https://ourworldindata.org/co2/country/cuba",
                "https://ourworldindata.org/energy/country/cuba",
                "https://www.climatewatchdata.org/ndcs/country/CUB/full"
        ));
        articlesMap.put("Cyprus", List.of(
                "https://data.footprintnetwork.org/?countries=CYP",
                "https://ourworldindata.org/co2/country/cyprus",
                "https://ourworldindata.org/energy/country/cyprus",
                "https://www.climatewatchdata.org/ndcs/country/CYP/full"
        ));
        articlesMap.put("Czechia", List.of(
                "https://data.footprintnetwork.org/?countries=CZE",
                "https://ourworldindata.org/co2/country/czechia",
                "https://ourworldindata.org/energy/country/czechia",
                "https://climateactiontracker.org/countries/czech-republic/",
                "https://www.climatewatchdata.org/ndcs/country/CZE/full"
        ));

        // ---- D ----
        articlesMap.put("Democratic People’s Republic of Korea", List.of(
                "https://data.footprintnetwork.org/?countries=PRK",
                "https://ourworldindata.org/co2/country/north-korea",
                "https://ourworldindata.org/energy/country/north-korea",
                "https://www.climatewatchdata.org/ndcs/country/PRK/full"
        ));
        articlesMap.put("Democratic Republic of the Congo", List.of(
                "https://data.footprintnetwork.org/?countries=COD",
                "https://ourworldindata.org/co2/country/democratic-republic-of-the-congo",
                "https://ourworldindata.org/energy/country/democratic-republic-of-the-congo",
                "https://www.climatewatchdata.org/ndcs/country/COD/full"
        ));
        articlesMap.put("Denmark", List.of(
                "https://data.footprintnetwork.org/?countries=DNK",
                "https://ourworldindata.org/co2/country/denmark",
                "https://ourworldindata.org/energy/country/denmark",
                "https://climateactiontracker.org/countries/denmark/",
                "https://www.climatewatchdata.org/ndcs/country/DNK/full"
        ));
        articlesMap.put("Djibouti", List.of(
                "https://data.footprintnetwork.org/?countries=DJI",
                "https://ourworldindata.org/co2/country/djibouti",
                "https://ourworldindata.org/energy/country/djibouti",
                "https://www.climatewatchdata.org/ndcs/country/DJI/full"
        ));
        articlesMap.put("Dominica", List.of(
                "https://data.footprintnetwork.org/?countries=DMA",
                "https://ourworldindata.org/co2/country/dominica",
                "https://ourworldindata.org/energy/country/dominica",
                "https://www.climatewatchdata.org/ndcs/country/DMA/full"
        ));
        articlesMap.put("Dominican Republic", List.of(
                "https://data.footprintnetwork.org/?countries=DOM",
                "https://ourworldindata.org/co2/country/dominican-republic",
                "https://ourworldindata.org/energy/country/dominican-republic",
                "https://www.climatewatchdata.org/ndcs/country/DOM/full"
        ));

        // ---- E ----
        articlesMap.put("Ecuador", List.of(
                "https://data.footprintnetwork.org/?countries=ECU",
                "https://ourworldindata.org/co2/country/ecuador",
                "https://ourworldindata.org/energy/country/ecuador",
                "https://www.climatewatchdata.org/ndcs/country/ECU/full"
        ));
        articlesMap.put("Egypt", List.of(
                "https://data.footprintnetwork.org/?countries=EGY",
                "https://ourworldindata.org/co2/country/egypt",
                "https://ourworldindata.org/energy/country/egypt",
                "https://climateactiontracker.org/countries/egypt/",
                "https://www.climatewatchdata.org/ndcs/country/EGY/full"
        ));
        articlesMap.put("El Salvador", List.of(
                "https://data.footprintnetwork.org/?countries=SLV",
                "https://ourworldindata.org/co2/country/el-salvador",
                "https://ourworldindata.org/energy/country/el-salvador",
                "https://www.climatewatchdata.org/ndcs/country/SLV/full"
        ));
        articlesMap.put("Equatorial Guinea", List.of(
                "https://data.footprintnetwork.org/?countries=GNQ",
                "https://ourworldindata.org/co2/country/equatorial-guinea",
                "https://ourworldindata.org/energy/country/equatorial-guinea",
                "https://www.climatewatchdata.org/ndcs/country/GNQ/full"
        ));
        articlesMap.put("Eritrea", List.of(
                "https://data.footprintnetwork.org/?countries=ERI",
                "https://ourworldindata.org/co2/country/eritrea",
                "https://ourworldindata.org/energy/country/eritrea",
                "https://www.climatewatchdata.org/ndcs/country/ERI/full"
        ));
        articlesMap.put("Estonia", List.of(
                "https://data.footprintnetwork.org/?countries=EST",
                "https://ourworldindata.org/co2/country/estonia",
                "https://ourworldindata.org/energy/country/estonia",
                "https://www.climatewatchdata.org/ndcs/country/EST/full"
        ));
        articlesMap.put("Eswatini", List.of(
                "https://data.footprintnetwork.org/?countries=SWZ",
                "https://ourworldindata.org/co2/country/eswatini",
                "https://ourworldindata.org/energy/country/eswatini",
                "https://www.climatewatchdata.org/ndcs/country/SWZ/full"
        ));
        articlesMap.put("Ethiopia", List.of(
                "https://data.footprintnetwork.org/?countries=ETH",
                "https://ourworldindata.org/co2/country/ethiopia",
                "https://ourworldindata.org/energy/country/ethiopia",
                "https://climateactiontracker.org/countries/ethiopia/",
                "https://www.climatewatchdata.org/ndcs/country/ETH/full"
        ));

        // ---- F ----
        articlesMap.put("Fiji", List.of(
                "https://data.footprintnetwork.org/?countries=FJI",
                "https://ourworldindata.org/co2/country/fiji",
                "https://ourworldindata.org/energy/country/fiji",
                "https://climateactiontracker.org/countries/fiji/",
                "https://www.climatewatchdata.org/ndcs/country/FJI/full"
        ));
        articlesMap.put("Finland", List.of(
                "https://data.footprintnetwork.org/?countries=FIN",
                "https://ourworldindata.org/co2/country/finland",
                "https://ourworldindata.org/energy/country/finland",
                "https://www.climatewatchdata.org/ndcs/country/FIN/full"
        ));
        articlesMap.put("France", List.of(
                "https://data.footprintnetwork.org/?countries=FRA",
                "https://ourworldindata.org/co2/country/france",
                "https://ourworldindata.org/energy/country/france",
                "https://climateactiontracker.org/countries/france/",
                "https://www.climatewatchdata.org/ndcs/country/FRA/full"
        ));

        // ---- G ----
        articlesMap.put("Gabon", List.of(
                "https://data.footprintnetwork.org/?countries=GAB",
                "https://ourworldindata.org/co2/country/gabon",
                "https://ourworldindata.org/energy/country/gabon",
                "https://www.climatewatchdata.org/ndcs/country/GAB/full"
        ));
        articlesMap.put("Gambia", List.of(
                "https://data.footprintnetwork.org/?countries=GMB",
                "https://ourworldindata.org/co2/country/gambia",
                "https://ourworldindata.org/energy/country/gambia",
                "https://www.climatewatchdata.org/ndcs/country/GMB/full"
        ));
        articlesMap.put("Georgia", List.of(
                "https://data.footprintnetwork.org/?countries=GEO",
                "https://ourworldindata.org/co2/country/georgia",
                "https://ourworldindata.org/energy/country/georgia",
                "https://www.climatewatchdata.org/ndcs/country/GEO/full"
        ));
        articlesMap.put("Germany", List.of(
                "https://data.footprintnetwork.org/?countries=DEU",
                "https://ourworldindata.org/co2/country/germany",
                "https://ourworldindata.org/energy/country/germany",
                "https://climateactiontracker.org/countries/germany/",
                "https://www.climatewatchdata.org/ndcs/country/DEU/full"
        ));
        articlesMap.put("Ghana", List.of(
                "https://data.footprintnetwork.org/?countries=GHA",
                "https://ourworldindata.org/co2/country/ghana",
                "https://ourworldindata.org/energy/country/ghana",
                "https://www.climatewatchdata.org/ndcs/country/GHA/full"
        ));
        articlesMap.put("Greece", List.of(
                "https://data.footprintnetwork.org/?countries=GRC",
                "https://ourworldindata.org/co2/country/greece",
                "https://ourworldindata.org/energy/country/greece",
                "https://www.climatewatchdata.org/ndcs/country/GRC/full"
        ));
        articlesMap.put("Grenada", List.of(
                "https://data.footprintnetwork.org/?countries=GRD",
                "https://ourworldindata.org/co2/country/grenada",
                "https://ourworldindata.org/energy/country/grenada",
                "https://www.climatewatchdata.org/ndcs/country/GRD/full"
        ));
        articlesMap.put("Guatemala", List.of(
                "https://data.footprintnetwork.org/?countries=GTM",
                "https://ourworldindata.org/co2/country/guatemala",
                "https://ourworldindata.org/energy/country/guatemala",
                "https://www.climatewatchdata.org/ndcs/country/GTM/full"
        ));
        articlesMap.put("Guinea", List.of(
                "https://data.footprintnetwork.org/?countries=GIN",
                "https://ourworldindata.org/co2/country/guinea",
                "https://ourworldindata.org/energy/country/guinea",
                "https://www.climatewatchdata.org/ndcs/country/GIN/full"
        ));
        articlesMap.put("Guinea-Bissau", List.of(
                "https://data.footprintnetwork.org/?countries=GNB",
                "https://ourworldindata.org/co2/country/guinea-bissau",
                "https://ourworldindata.org/energy/country/guinea-bissau",
                "https://www.climatewatchdata.org/ndcs/country/GNB/full"
        ));
        articlesMap.put("Guyana", List.of(
                "https://data.footprintnetwork.org/?countries=GUY",
                "https://ourworldindata.org/co2/country/guyana",
                "https://ourworldindata.org/energy/country/guyana",
                "https://www.climatewatchdata.org/ndcs/country/GUY/full"
        ));

        // ---- H ----
        articlesMap.put("Haiti", List.of(
                "https://data.footprintnetwork.org/?countries=HTI",
                "https://ourworldindata.org/co2/country/haiti",
                "https://ourworldindata.org/energy/country/haiti",
                "https://www.climatewatchdata.org/ndcs/country/HTI/full"
        ));
        articlesMap.put("Honduras", List.of(
                "https://data.footprintnetwork.org/?countries=HND",
                "https://ourworldindata.org/co2/country/honduras",
                "https://ourworldindata.org/energy/country/honduras",
                "https://www.climatewatchdata.org/ndcs/country/HND/full"
        ));
        articlesMap.put("Hungary", List.of(
                "https://data.footprintnetwork.org/?countries=HUN",
                "https://ourworldindata.org/co2/country/hungary",
                "https://ourworldindata.org/energy/country/hungary",
                "https://www.climatewatchdata.org/ndcs/country/HUN/full"
        ));

        // ---- I ----
        articlesMap.put("Iceland", List.of(
                "https://data.footprintnetwork.org/?countries=ISL",
                "https://ourworldindata.org/co2/country/iceland",
                "https://ourworldindata.org/energy/country/iceland",
                "https://www.climatewatchdata.org/ndcs/country/ISL/full"
        ));
        articlesMap.put("India", List.of(
                "https://data.footprintnetwork.org/?countries=IND",
                "https://ourworldindata.org/co2/country/india",
                "https://ourworldindata.org/energy/country/india",
                "https://climateactiontracker.org/countries/india/",
                "https://www.climatewatchdata.org/ndcs/country/IND/full"
        ));
        articlesMap.put("Indonesia", List.of(
                "https://data.footprintnetwork.org/?countries=IDN",
                "https://ourworldindata.org/co2/country/indonesia",
                "https://ourworldindata.org/energy/country/indonesia",
                "https://climateactiontracker.org/countries/indonesia/",
                "https://www.climatewatchdata.org/ndcs/country/IDN/full"
        ));
        articlesMap.put("Iran (Islamic Republic of)", List.of(
                "https://data.footprintnetwork.org/?countries=IRN",
                "https://ourworldindata.org/co2/country/iran",
                "https://ourworldindata.org/energy/country/iran",
                "https://www.climatewatchdata.org/ndcs/country/IRN/full"
        ));
        articlesMap.put("Iraq", List.of(
                "https://data.footprintnetwork.org/?countries=IRQ",
                "https://ourworldindata.org/co2/country/iraq",
                "https://ourworldindata.org/energy/country/iraq",
                "https://www.climatewatchdata.org/ndcs/country/IRQ/full"
        ));
        articlesMap.put("Ireland", List.of(
                "https://data.footprintnetwork.org/?countries=IRL",
                "https://ourworldindata.org/co2/country/ireland",
                "https://ourworldindata.org/energy/country/ireland",
                "https://www.climatewatchdata.org/ndcs/country/IRL/full"
        ));
        articlesMap.put("Israel", List.of(
                "https://data.footprintnetwork.org/?countries=ISR",
                "https://ourworldindata.org/co2/country/israel",
                "https://ourworldindata.org/energy/country/israel",
                "https://www.climatewatchdata.org/ndcs/country/ISR/full"
        ));
        articlesMap.put("Italy", List.of(
                "https://data.footprintnetwork.org/?countries=ITA",
                "https://ourworldindata.org/co2/country/italy",
                "https://ourworldindata.org/energy/country/italy",
                "https://climateactiontracker.org/countries/italy/",
                "https://www.climatewatchdata.org/ndcs/country/ITA/full"
        ));

        // ---- J ----
        articlesMap.put("Jamaica", List.of(
                "https://data.footprintnetwork.org/?countries=JAM",
                "https://ourworldindata.org/co2/country/jamaica",
                "https://ourworldindata.org/energy/country/jamaica",
                "https://www.climatewatchdata.org/ndcs/country/JAM/full"
        ));
        articlesMap.put("Japan", List.of(
                "https://data.footprintnetwork.org/?countries=JPN",
                "https://ourworldindata.org/co2/country/japan",
                "https://ourworldindata.org/energy/country/japan",
                "https://climateactiontracker.org/countries/japan/",
                "https://www.climatewatchdata.org/ndcs/country/JPN/full"
        ));
        articlesMap.put("Jordan", List.of(
                "https://data.footprintnetwork.org/?countries=JOR",
                "https://ourworldindata.org/co2/country/jordan",
                "https://ourworldindata.org/energy/country/jordan",
                "https://www.climatewatchdata.org/ndcs/country/JOR/full"
        ));

        // ---- K ----
        articlesMap.put("Kazakhstan", List.of(
                "https://data.footprintnetwork.org/?countries=KAZ",
                "https://ourworldindata.org/co2/country/kazakhstan",
                "https://ourworldindata.org/energy/country/kazakhstan",
                "https://www.climatewatchdata.org/ndcs/country/KAZ/full"
        ));
        articlesMap.put("Kenya", List.of(
                "https://data.footprintnetwork.org/?countries=KEN",
                "https://ourworldindata.org/co2/country/kenya",
                "https://ourworldindata.org/energy/country/kenya",
                "https://www.climatewatchdata.org/ndcs/country/KEN/full"
        ));
        articlesMap.put("Kiribati", List.of(
                "https://data.footprintnetwork.org/?countries=KIR",
                "https://ourworldindata.org/co2/country/kiribati",
                "https://ourworldindata.org/energy/country/kiribati",
                "https://www.climatewatchdata.org/ndcs/country/KIR/full"
        ));
        articlesMap.put("Kuwait", List.of(
                "https://data.footprintnetwork.org/?countries=KWT",
                "https://ourworldindata.org/co2/country/kuwait",
                "https://ourworldindata.org/energy/country/kuwait",
                "https://www.climatewatchdata.org/ndcs/country/KWT/full"
        ));
        articlesMap.put("Kyrgyzstan", List.of(
                "https://data.footprintnetwork.org/?countries=KGZ",
                "https://ourworldindata.org/co2/country/kyrgyzstan",
                "https://ourworldindata.org/energy/country/kyrgyzstan",
                "https://www.climatewatchdata.org/ndcs/country/KGZ/full"
        ));

        // ---- L ----
        articlesMap.put("Lao People's Democratic Republic", List.of(
                "https://data.footprintnetwork.org/?countries=LAO",
                "https://ourworldindata.org/co2/country/laos",
                "https://ourworldindata.org/energy/country/laos",
                "https://www.climatewatchdata.org/ndcs/country/LAO/full"
        ));
        articlesMap.put("Latvia", List.of(
                "https://data.footprintnetwork.org/?countries=LVA",
                "https://ourworldindata.org/co2/country/latvia",
                "https://ourworldindata.org/energy/country/latvia",
                "https://www.climatewatchdata.org/ndcs/country/LVA/full"
        ));
        articlesMap.put("Lebanon", List.of(
                "https://data.footprintnetwork.org/?countries=LBN",
                "https://ourworldindata.org/co2/country/lebanon",
                "https://ourworldindata.org/energy/country/lebanon",
                "https://www.climatewatchdata.org/ndcs/country/LBN/full"
        ));
        articlesMap.put("Lesotho", List.of(
                "https://data.footprintnetwork.org/?countries=LSO",
                "https://ourworldindata.org/co2/country/lesotho",
                "https://ourworldindata.org/energy/country/lesotho",
                "https://www.climatewatchdata.org/ndcs/country/LSO/full"
        ));
        articlesMap.put("Liberia", List.of(
                "https://data.footprintnetwork.org/?countries=LBR",
                "https://ourworldindata.org/co2/country/liberia",
                "https://ourworldindata.org/energy/country/liberia",
                "https://www.climatewatchdata.org/ndcs/country/LBR/full"
        ));
        articlesMap.put("Libya", List.of(
                "https://data.footprintnetwork.org/?countries=LBY",
                "https://ourworldindata.org/co2/country/libya",
                "https://ourworldindata.org/energy/country/libya",
                "https://www.climatewatchdata.org/ndcs/country/LBY/full"
        ));
        articlesMap.put("Liechtenstein", List.of(
                "https://data.footprintnetwork.org/?countries=LIE",
                "https://ourworldindata.org/co2/country/liechtenstein",
                "https://ourworldindata.org/energy/country/liechtenstein",
                "https://www.climatewatchdata.org/ndcs/country/LIE/full"
        ));
        articlesMap.put("Lithuania", List.of(
                "https://data.footprintnetwork.org/?countries=LTU",
                "https://ourworldindata.org/co2/country/lithuania",
                "https://ourworldindata.org/energy/country/lithuania",
                "https://www.climatewatchdata.org/ndcs/country/LTU/full"
        ));
        articlesMap.put("Luxembourg", List.of(
                "https://data.footprintnetwork.org/?countries=LUX",
                "https://ourworldindata.org/co2/country/luxembourg",
                "https://ourworldindata.org/energy/country/luxembourg",
                "https://www.climatewatchdata.org/ndcs/country/LUX/full"
        ));

        // ---- M ----
        articlesMap.put("Madagascar", List.of(
                "https://data.footprintnetwork.org/?countries=MDG",
                "https://ourworldindata.org/co2/country/madagascar",
                "https://ourworldindata.org/energy/country/madagascar",
                "https://www.climatewatchdata.org/ndcs/country/MDG/full"
        ));
        articlesMap.put("Malawi", List.of(
                "https://data.footprintnetwork.org/?countries=MWI",
                "https://ourworldindata.org/co2/country/malawi",
                "https://ourworldindata.org/energy/country/malawi",
                "https://www.climatewatchdata.org/ndcs/country/MWI/full"
        ));
        articlesMap.put("Malaysia", List.of(
                "https://data.footprintnetwork.org/?countries=MYS",
                "https://ourworldindata.org/co2/country/malaysia",
                "https://ourworldindata.org/energy/country/malaysia",
                "https://climateactiontracker.org/countries/malaysia/",
                "https://www.climatewatchdata.org/ndcs/country/MYS/full"
        ));
        articlesMap.put("Maldives", List.of(
                "https://data.footprintnetwork.org/?countries=MDV",
                "https://ourworldindata.org/co2/country/maldives",
                "https://ourworldindata.org/energy/country/maldives",
                "https://www.climatewatchdata.org/ndcs/country/MDV/full"
        ));
        articlesMap.put("Mali", List.of(
                "https://data.footprintnetwork.org/?countries=MLI",
                "https://ourworldindata.org/co2/country/mali",
                "https://ourworldindata.org/energy/country/mali",
                "https://www.climatewatchdata.org/ndcs/country/MLI/full"
        ));
        articlesMap.put("Malta", List.of(
                "https://data.footprintnetwork.org/?countries=MLT",
                "https://ourworldindata.org/co2/country/malta",
                "https://ourworldindata.org/energy/country/malta",
                "https://www.climatewatchdata.org/ndcs/country/MLT/full"
        ));
        articlesMap.put("Marshall Islands", List.of(
                "https://data.footprintnetwork.org/?countries=MHL",
                "https://ourworldindata.org/co2/country/marshall-islands",
                "https://ourworldindata.org/energy/country/marshall-islands",
                "https://www.climatewatchdata.org/ndcs/country/MHL/full"
        ));
        articlesMap.put("Mauritania", List.of(
                "https://data.footprintnetwork.org/?countries=MRT",
                "https://ourworldindata.org/co2/country/mauritania",
                "https://ourworldindata.org/energy/country/mauritania",
                "https://www.climatewatchdata.org/ndcs/country/MRT/full"
        ));
        articlesMap.put("Mauritius", List.of(
                "https://data.footprintnetwork.org/?countries=MUS",
                "https://ourworldindata.org/co2/country/mauritius",
                "https://ourworldindata.org/energy/country/mauritius",
                "https://www.climatewatchdata.org/ndcs/country/MUS/full"
        ));
        articlesMap.put("Mexico", List.of(
                "https://data.footprintnetwork.org/?countries=MEX",
                "https://ourworldindata.org/co2/country/mexico",
                "https://ourworldindata.org/energy/country/mexico",
                "https://climateactiontracker.org/countries/mexico/",
                "https://www.climatewatchdata.org/ndcs/country/MEX/full"
        ));
        articlesMap.put("Micronesia (Federated States of)", List.of(
                "https://data.footprintnetwork.org/?countries=FSM",
                "https://ourworldindata.org/co2/country/micronesia-(country)",
                "https://ourworldindata.org/energy/country/micronesia-(country)",
                "https://www.climatewatchdata.org/ndcs/country/FSM/full"
        ));
        articlesMap.put("Monaco", List.of(
                "https://data.footprintnetwork.org/?countries=MCO",
                "https://ourworldindata.org/co2/country/monaco",
                "https://ourworldindata.org/energy/country/monaco",
                "https://www.climatewatchdata.org/ndcs/country/MCO/full"
        ));
        articlesMap.put("Mongolia", List.of(
                "https://data.footprintnetwork.org/?countries=MNG",
                "https://ourworldindata.org/co2/country/mongolia",
                "https://ourworldindata.org/energy/country/mongolia",
                "https://www.climatewatchdata.org/ndcs/country/MNG/full"
        ));
        articlesMap.put("Montenegro", List.of(
                "https://data.footprintnetwork.org/?countries=MNE",
                "https://ourworldindata.org/co2/country/montenegro",
                "https://ourworldindata.org/energy/country/montenegro",
                "https://www.climatewatchdata.org/ndcs/country/MNE/full"
        ));
        articlesMap.put("Morocco", List.of(
                "https://data.footprintnetwork.org/?countries=MAR",
                "https://ourworldindata.org/co2/country/morocco",
                "https://ourworldindata.org/energy/country/morocco",
                "https://climateactiontracker.org/countries/morocco/",
                "https://www.climatewatchdata.org/ndcs/country/MAR/full"
        ));
        articlesMap.put("Mozambique", List.of(
                "https://data.footprintnetwork.org/?countries=MOZ",
                "https://ourworldindata.org/co2/country/mozambique",
                "https://ourworldindata.org/energy/country/mozambique",
                "https://www.climatewatchdata.org/ndcs/country/MOZ/full"
        ));
        articlesMap.put("Myanmar", List.of(
                "https://data.footprintnetwork.org/?countries=MMR",
                "https://ourworldindata.org/co2/country/myanmar",
                "https://ourworldindata.org/energy/country/myanmar",
                "https://www.climatewatchdata.org/ndcs/country/MMR/full"
        ));

        // ---- N ----
        articlesMap.put("Namibia", List.of(
                "https://data.footprintnetwork.org/?countries=NAM",
                "https://ourworldindata.org/co2/country/namibia",
                "https://ourworldindata.org/energy/country/namibia",
                "https://www.climatewatchdata.org/ndcs/country/NAM/full"
        ));
        articlesMap.put("Nauru", List.of(
                "https://data.footprintnetwork.org/?countries=NRU",
                "https://ourworldindata.org/co2/country/nauru",
                "https://ourworldindata.org/energy/country/nauru",
                "https://www.climatewatchdata.org/ndcs/country/NRU/full"
        ));
        articlesMap.put("Nepal", List.of(
                "https://data.footprintnetwork.org/?countries=NPL",
                "https://ourworldindata.org/co2/country/nepal",
                "https://ourworldindata.org/energy/country/nepal",
                "https://www.climatewatchdata.org/ndcs/country/NPL/full"
        ));
        articlesMap.put("Netherlands", List.of(
                "https://data.footprintnetwork.org/?countries=NLD",
                "https://ourworldindata.org/co2/country/netherlands",
                "https://ourworldindata.org/energy/country/netherlands",
                "https://climateactiontracker.org/countries/netherlands/",
                "https://www.climatewatchdata.org/ndcs/country/NLD/full"
        ));
        articlesMap.put("New Zealand", List.of(
                "https://data.footprintnetwork.org/?countries=NZL",
                "https://ourworldindata.org/co2/country/new-zealand",
                "https://ourworldindata.org/energy/country/new-zealand",
                "https://climateactiontracker.org/countries/new-zealand/",
                "https://www.climatewatchdata.org/ndcs/country/NZL/full"
        ));
        articlesMap.put("Nicaragua", List.of(
                "https://data.footprintnetwork.org/?countries=NIC",
                "https://ourworldindata.org/co2/country/nicaragua",
                "https://ourworldindata.org/energy/country/nicaragua",
                "https://www.climatewatchdata.org/ndcs/country/NIC/full"
        ));
        articlesMap.put("Niger", List.of(
                "https://data.footprintnetwork.org/?countries=NER",
                "https://ourworldindata.org/co2/country/niger",
                "https://ourworldindata.org/energy/country/niger",
                "https://www.climatewatchdata.org/ndcs/country/NER/full"
        ));
        articlesMap.put("Nigeria", List.of(
                "https://data.footprintnetwork.org/?countries=NGA",
                "https://ourworldindata.org/co2/country/nigeria",
                "https://ourworldindata.org/energy/country/nigeria",
                "https://www.climatewatchdata.org/ndcs/country/NGA/full"
        ));
        articlesMap.put("North Macedonia", List.of(
                "https://data.footprintnetwork.org/?countries=MKD",
                "https://ourworldindata.org/co2/country/north-macedonia",
                "https://ourworldindata.org/energy/country/north-macedonia",
                "https://www.climatewatchdata.org/ndcs/country/MKD/full"
        ));
        articlesMap.put("Norway", List.of(
                "https://data.footprintnetwork.org/?countries=NOR",
                "https://ourworldindata.org/co2/country/norway",
                "https://ourworldindata.org/energy/country/norway",
                "https://climateactiontracker.org/countries/norway/",
                "https://www.climatewatchdata.org/ndcs/country/NOR/full"
        ));

        // ---- O ----
        articlesMap.put("Oman", List.of(
                "https://data.footprintnetwork.org/?countries=OMN",
                "https://ourworldindata.org/co2/country/oman",
                "https://ourworldindata.org/energy/country/oman",
                "https://www.climatewatchdata.org/ndcs/country/OMN/full"
        ));

        // ---- P ----
        articlesMap.put("Pakistan", List.of(
                "https://data.footprintnetwork.org/?countries=PAK",
                "https://ourworldindata.org/co2/country/pakistan",
                "https://ourworldindata.org/energy/country/pakistan",
                "https://climateactiontracker.org/countries/pakistan/",
                "https://www.climatewatchdata.org/ndcs/country/PAK/full"
        ));
        articlesMap.put("Palau", List.of(
                "https://data.footprintnetwork.org/?countries=PLW",
                "https://ourworldindata.org/co2/country/palau",
                "https://ourworldindata.org/energy/country/palau",
                "https://www.climatewatchdata.org/ndcs/country/PLW/full"
        ));
        articlesMap.put("Panama", List.of(
                "https://data.footprintnetwork.org/?countries=PAN",
                "https://ourworldindata.org/co2/country/panama",
                "https://ourworldindata.org/energy/country/panama",
                "https://www.climatewatchdata.org/ndcs/country/PAN/full"
        ));
        articlesMap.put("Papua New Guinea", List.of(
                "https://data.footprintnetwork.org/?countries=PNG",
                "https://ourworldindata.org/co2/country/papua-new-guinea",
                "https://ourworldindata.org/energy/country/papua-new-guinea",
                "https://www.climatewatchdata.org/ndcs/country/PNG/full"
        ));
        articlesMap.put("Paraguay", List.of(
                "https://data.footprintnetwork.org/?countries=PRY",
                "https://ourworldindata.org/co2/country/paraguay",
                "https://ourworldindata.org/energy/country/paraguay",
                "https://www.climatewatchdata.org/ndcs/country/PRY/full"
        ));
        articlesMap.put("Peru", List.of(
                "https://data.footprintnetwork.org/?countries=PER",
                "https://ourworldindata.org/co2/country/peru",
                "https://ourworldindata.org/energy/country/peru",
                "https://climateactiontracker.org/countries/peru/",
                "https://www.climatewatchdata.org/ndcs/country/PER/full"
        ));
        articlesMap.put("Philippines", List.of(
                "https://data.footprintnetwork.org/?countries=PHL",
                "https://ourworldindata.org/co2/country/philippines",
                "https://ourworldindata.org/energy/country/philippines",
                "https://climateactiontracker.org/countries/philippines/",
                "https://www.climatewatchdata.org/ndcs/country/PHL/full"
        ));
        articlesMap.put("Poland", List.of(
                "https://data.footprintnetwork.org/?countries=POL",
                "https://ourworldindata.org/co2/country/poland",
                "https://ourworldindata.org/energy/country/poland",
                "https://climateactiontracker.org/countries/poland/",
                "https://www.climatewatchdata.org/ndcs/country/POL/full"
        ));
        articlesMap.put("Portugal", List.of(
                "https://data.footprintnetwork.org/?countries=PRT",
                "https://ourworldindata.org/co2/country/portugal",
                "https://ourworldindata.org/energy/country/portugal",
                "https://climateactiontracker.org/countries/portugal/",
                "https://www.climatewatchdata.org/ndcs/country/PRT/full"
        ));
        articlesMap.put("Qatar", List.of(
                "https://data.footprintnetwork.org/?countries=QAT",
                "https://ourworldindata.org/co2/country/qatar",
                "https://ourworldindata.org/energy/country/qatar",
                "https://www.climatewatchdata.org/ndcs/country/QAT/full"
        ));

        // ---- R ----
        articlesMap.put("Republic of Korea", List.of(
                "https://data.footprintnetwork.org/?countries=KOR",
                "https://ourworldindata.org/co2/country/south-korea",
                "https://ourworldindata.org/energy/country/south-korea",
                "https://climateactiontracker.org/countries/south-korea/",
                "https://www.climatewatchdata.org/ndcs/country/KOR/full"
        ));
        articlesMap.put("Republic of Moldova", List.of(
                "https://data.footprintnetwork.org/?countries=MDA",
                "https://ourworldindata.org/co2/country/moldova",
                "https://ourworldindata.org/energy/country/moldova",
                "https://www.climatewatchdata.org/ndcs/country/MDA/full"
        ));
        articlesMap.put("Romania", List.of(
                "https://data.footprintnetwork.org/?countries=ROU",
                "https://ourworldindata.org/co2/country/romania",
                "https://ourworldindata.org/energy/country/romania",
                "https://www.climatewatchdata.org/ndcs/country/ROU/full"
        ));
        articlesMap.put("Russian Federation", List.of(
                "https://data.footprintnetwork.org/?countries=RUS",
                "https://ourworldindata.org/co2/country/russia",
                "https://ourworldindata.org/energy/country/russia",
                "https://climateactiontracker.org/countries/russian-federation/",
                "https://www.climatewatchdata.org/ndcs/country/RUS/full"
        ));
        articlesMap.put("Rwanda", List.of(
                "https://data.footprintnetwork.org/?countries=RWA",
                "https://ourworldindata.org/co2/country/rwanda",
                "https://ourworldindata.org/energy/country/rwanda",
                "https://www.climatewatchdata.org/ndcs/country/RWA/full"
        ));

        // ---- S ----
        articlesMap.put("Saint Kitts and Nevis", List.of(
                "https://data.footprintnetwork.org/?countries=KNA",
                "https://ourworldindata.org/co2/country/saint-kitts-and-nevis",
                "https://ourworldindata.org/energy/country/saint-kitts-and-nevis",
                "https://www.climatewatchdata.org/ndcs/country/KNA/full"
        ));
        articlesMap.put("Saint Lucia", List.of(
                "https://data.footprintnetwork.org/?countries=LCA",
                "https://ourworldindata.org/co2/country/saint-lucia",
                "https://ourworldindata.org/energy/country/saint-lucia",
                "https://www.climatewatchdata.org/ndcs/country/LCA/full"
        ));
        articlesMap.put("Saint Vincent and the Grenadines", List.of(
                "https://data.footprintnetwork.org/?countries=VCT",
                "https://ourworldindata.org/co2/country/saint-vincent-and-the-grenadines",
                "https://ourworldindata.org/energy/country/saint-vincent-and-the-grenadines",
                "https://www.climatewatchdata.org/ndcs/country/VCT/full"
        ));
        articlesMap.put("Samoa", List.of(
                "https://data.footprintnetwork.org/?countries=WSM",
                "https://ourworldindata.org/co2/country/samoa",
                "https://ourworldindata.org/energy/country/samoa",
                "https://www.climatewatchdata.org/ndcs/country/WSM/full"
        ));
        articlesMap.put("San Marino", List.of(
                "https://data.footprintnetwork.org/?countries=SMR",
                "https://ourworldindata.org/co2/country/san-marino",
                "https://ourworldindata.org/energy/country/san-marino",
                "https://www.climatewatchdata.org/ndcs/country/SMR/full"
        ));
        articlesMap.put("Sao Tome and Principe", List.of(
                "https://data.footprintnetwork.org/?countries=STP",
                "https://ourworldindata.org/co2/country/sao-tome-and-principe",
                "https://ourworldindata.org/energy/country/sao-tome-and-principe",
                "https://www.climatewatchdata.org/ndcs/country/STP/full"
        ));
        articlesMap.put("Saudi Arabia", List.of(
                "https://data.footprintnetwork.org/?countries=SAU",
                "https://ourworldindata.org/co2/country/saudi-arabia",
                "https://ourworldindata.org/energy/country/saudi-arabia",
                "https://climateactiontracker.org/countries/saudi-arabia/",
                "https://www.climatewatchdata.org/ndcs/country/SAU/full"
        ));
        articlesMap.put("Senegal", List.of(
                "https://data.footprintnetwork.org/?countries=SEN",
                "https://ourworldindata.org/co2/country/senegal",
                "https://ourworldindata.org/energy/country/senegal",
                "https://www.climatewatchdata.org/ndcs/country/SEN/full"
        ));
        articlesMap.put("Serbia", List.of(
                "https://data.footprintnetwork.org/?countries=SRB",
                "https://ourworldindata.org/co2/country/serbia",
                "https://ourworldindata.org/energy/country/serbia",
                "https://www.climatewatchdata.org/ndcs/country/SRB/full"
        ));
        articlesMap.put("Seychelles", List.of(
                "https://data.footprintnetwork.org/?countries=SYC",
                "https://ourworldindata.org/co2/country/seychelles",
                "https://ourworldindata.org/energy/country/seychelles",
                "https://www.climatewatchdata.org/ndcs/country/SYC/full"
        ));
        articlesMap.put("Sierra Leone", List.of(
                "https://data.footprintnetwork.org/?countries=SLE",
                "https://ourworldindata.org/co2/country/sierra-leone",
                "https://ourworldindata.org/energy/country/sierra-leone",
                "https://www.climatewatchdata.org/ndcs/country/SLE/full"
        ));
        articlesMap.put("Singapore", List.of(
                "https://data.footprintnetwork.org/?countries=SGP",
                "https://ourworldindata.org/co2/country/singapore",
                "https://ourworldindata.org/energy/country/singapore",
                "https://climateactiontracker.org/countries/singapore/",
                "https://www.climatewatchdata.org/ndcs/country/SGP/full"
        ));
        articlesMap.put("Slovakia", List.of(
                "https://data.footprintnetwork.org/?countries=SVK",
                "https://ourworldindata.org/co2/country/slovakia",
                "https://ourworldindata.org/energy/country/slovakia",
                "https://www.climatewatchdata.org/ndcs/country/SVK/full"
        ));
        articlesMap.put("Slovenia", List.of(
                "https://data.footprintnetwork.org/?countries=SVN",
                "https://ourworldindata.org/co2/country/slovenia",
                "https://ourworldindata.org/energy/country/slovenia",
                "https://www.climatewatchdata.org/ndcs/country/SVN/full"
        ));
        articlesMap.put("Solomon Islands", List.of(
                "https://data.footprintnetwork.org/?countries=SLB",
                "https://ourworldindata.org/co2/country/solomon-islands",
                "https://ourworldindata.org/energy/country/solomon-islands",
                "https://www.climatewatchdata.org/ndcs/country/SLB/full"
        ));
        articlesMap.put("Somalia", List.of(
                "https://data.footprintnetwork.org/?countries=SOM",
                "https://ourworldindata.org/co2/country/somalia",
                "https://ourworldindata.org/energy/country/somalia",
                "https://www.climatewatchdata.org/ndcs/country/SOM/full"
        ));
        articlesMap.put("South Africa", List.of(
                "https://data.footprintnetwork.org/?countries=ZAF",
                "https://ourworldindata.org/co2/country/south-africa",
                "https://ourworldindata.org/energy/country/south-africa",
                "https://climateactiontracker.org/countries/south-africa/",
                "https://www.climatewatchdata.org/ndcs/country/ZAF/full"
        ));
        articlesMap.put("South Sudan", List.of(
                "https://data.footprintnetwork.org/?countries=SSD",
                "https://ourworldindata.org/co2/country/south-sudan",
                "https://ourworldindata.org/energy/country/south-sudan",
                "https://www.climatewatchdata.org/ndcs/country/SSD/full"
        ));
        articlesMap.put("Spain", List.of(
                "https://data.footprintnetwork.org/?countries=ESP",
                "https://ourworldindata.org/co2/country/spain",
                "https://ourworldindata.org/energy/country/spain",
                "https://climateactiontracker.org/countries/spain/",
                "https://www.climatewatchdata.org/ndcs/country/ESP/full"
        ));
        articlesMap.put("Sri Lanka", List.of(
                "https://data.footprintnetwork.org/?countries=LKA",
                "https://ourworldindata.org/co2/country/sri-lanka",
                "https://ourworldindata.org/energy/country/sri-lanka",
                "https://www.climatewatchdata.org/ndcs/country/LKA/full"
        ));
        articlesMap.put("State of Palestine", List.of(
                "https://data.footprintnetwork.org/?countries=PSE",
                "https://ourworldindata.org/co2/country/palestine",
                "https://ourworldindata.org/energy/country/palestine",
                "https://www.climatewatchdata.org/ndcs/country/PSE/full"
        ));
        articlesMap.put("Sudan", List.of(
                "https://data.footprintnetwork.org/?countries=SDN",
                "https://ourworldindata.org/co2/country/sudan",
                "https://ourworldindata.org/energy/country/sudan",
                "https://www.climatewatchdata.org/ndcs/country/SDN/full"
        ));
        articlesMap.put("Suriname", List.of(
                "https://data.footprintnetwork.org/?countries=SUR",
                "https://ourworldindata.org/co2/country/suriname",
                "https://ourworldindata.org/energy/country/suriname",
                "https://www.climatewatchdata.org/ndcs/country/SUR/full"
        ));
        articlesMap.put("Sweden", List.of(
                "https://data.footprintnetwork.org/?countries=SWE",
                "https://ourworldindata.org/co2/country/sweden",
                "https://ourworldindata.org/energy/country/sweden",
                "https://climateactiontracker.org/countries/sweden/",
                "https://www.climatewatchdata.org/ndcs/country/SWE/full"
        ));
        articlesMap.put("Switzerland", List.of(
                "https://data.footprintnetwork.org/?countries=CHE",
                "https://ourworldindata.org/co2/country/switzerland",
                "https://ourworldindata.org/energy/country/switzerland",
                "https://climateactiontracker.org/countries/switzerland/",
                "https://www.climatewatchdata.org/ndcs/country/CHE/full"
        ));
        articlesMap.put("Syrian Arab Republic", List.of(
                "https://data.footprintnetwork.org/?countries=SYR",
                "https://ourworldindata.org/co2/country/syria",
                "https://ourworldindata.org/energy/country/syria",
                "https://www.climatewatchdata.org/ndcs/country/SYR/full"
        ));

        // ---- T ----
        articlesMap.put("Tajikistan", List.of(
                "https://data.footprintnetwork.org/?countries=TJK",
                "https://ourworldindata.org/co2/country/tajikistan",
                "https://ourworldindata.org/energy/country/tajikistan",
                "https://www.climatewatchdata.org/ndcs/country/TJK/full"
        ));
        articlesMap.put("Thailand", List.of(
                "https://data.footprintnetwork.org/?countries=THA",
                "https://ourworldindata.org/co2/country/thailand",
                "https://ourworldindata.org/energy/country/thailand",
                "https://climateactiontracker.org/countries/thailand/",
                "https://www.climatewatchdata.org/ndcs/country/THA/full"
        ));
        articlesMap.put("Timor-Leste", List.of(
                "https://data.footprintnetwork.org/?countries=TLS",
                "https://ourworldindata.org/co2/country/timor-leste",
                "https://ourworldindata.org/energy/country/timor-leste",
                "https://www.climatewatchdata.org/ndcs/country/TLS/full"
        ));
        articlesMap.put("Togo", List.of(
                "https://data.footprintnetwork.org/?countries=TGO",
                "https://ourworldindata.org/co2/country/togo",
                "https://ourworldindata.org/energy/country/togo",
                "https://www.climatewatchdata.org/ndcs/country/TGO/full"
        ));
        articlesMap.put("Tonga", List.of(
                "https://data.footprintnetwork.org/?countries=TON",
                "https://ourworldindata.org/co2/country/tonga",
                "https://ourworldindata.org/energy/country/tonga",
                "https://www.climatewatchdata.org/ndcs/country/TON/full"
        ));
        articlesMap.put("Trinidad and Tobago", List.of(
                "https://data.footprintnetwork.org/?countries=TTO",
                "https://ourworldindata.org/co2/country/trinidad-and-tobago",
                "https://ourworldindata.org/energy/country/trinidad-and-tobago",
                "https://www.climatewatchdata.org/ndcs/country/TTO/full"
        ));
        articlesMap.put("Tunisia", List.of(
                "https://data.footprintnetwork.org/?countries=TUN",
                "https://ourworldindata.org/co2/country/tunisia",
                "https://ourworldindata.org/energy/country/tunisia",
                "https://www.climatewatchdata.org/ndcs/country/TUN/full"
        ));
        articlesMap.put("Türkiye", List.of(
                "https://data.footprintnetwork.org/?countries=TUR",
                "https://ourworldindata.org/co2/country/turkey",
                "https://ourworldindata.org/energy/country/turkey",
                "https://climateactiontracker.org/countries/turkey/",
                "https://www.climatewatchdata.org/ndcs/country/TUR/full"
        ));
        articlesMap.put("Turkmenistan", List.of(
                "https://data.footprintnetwork.org/?countries=TKM",
                "https://ourworldindata.org/co2/country/turkmenistan",
                "https://ourworldindata.org/energy/country/turkmenistan",
                "https://www.climatewatchdata.org/ndcs/country/TKM/full"
        ));
        articlesMap.put("Tuvalu", List.of(
                "https://data.footprintnetwork.org/?countries=TUV",
                "https://ourworldindata.org/co2/country/tuvalu",
                "https://ourworldindata.org/energy/country/tuvalu",
                "https://www.climatewatchdata.org/ndcs/country/TUV/full"
        ));

        // ---- U ----
        articlesMap.put("Uganda", List.of(
                "https://data.footprintnetwork.org/?countries=UGA",
                "https://ourworldindata.org/co2/country/uganda",
                "https://ourworldindata.org/energy/country/uganda",
                "https://www.climatewatchdata.org/ndcs/country/UGA/full"
        ));
        articlesMap.put("Ukraine", List.of(
                "https://data.footprintnetwork.org/?countries=UKR",
                "https://ourworldindata.org/co2/country/ukraine",
                "https://ourworldindata.org/energy/country/ukraine",
                "https://www.climatewatchdata.org/ndcs/country/UKR/full"
        ));
        articlesMap.put("United Arab Emirates", List.of(
                "https://data.footprintnetwork.org/?countries=ARE",
                "https://ourworldindata.org/co2/country/united-arab-emirates",
                "https://ourworldindata.org/energy/country/united-arab-emirates",
                "https://climateactiontracker.org/countries/united-arab-emirates/",
                "https://www.climatewatchdata.org/ndcs/country/ARE/full"
        ));
        articlesMap.put("United Kingdom of Great Britain and Northern Ireland", List.of(
                "https://data.footprintnetwork.org/?countries=GBR",
                "https://ourworldindata.org/co2/country/united-kingdom",
                "https://ourworldindata.org/energy/country/united-kingdom",
                "https://climateactiontracker.org/countries/united-kingdom/",
                "https://www.climatewatchdata.org/ndcs/country/GBR/full"
        ));
        articlesMap.put("United Republic of Tanzania", List.of(
                "https://data.footprintnetwork.org/?countries=TZA",
                "https://ourworldindata.org/co2/country/tanzania",
                "https://ourworldindata.org/energy/country/tanzania",
                "https://www.climatewatchdata.org/ndcs/country/TZA/full"
        ));
        articlesMap.put("United States of America", List.of(
                "https://data.footprintnetwork.org/?countries=USA",
                "https://ourworldindata.org/co2/country/united-states",
                "https://ourworldindata.org/energy/country/united-states",
                "https://climateactiontracker.org/countries/usa/",
                "https://www.climatewatchdata.org/ndcs/country/USA/full"
        ));
        articlesMap.put("Uruguay", List.of(
                "https://data.footprintnetwork.org/?countries=URY",
                "https://ourworldindata.org/co2/country/uruguay",
                "https://ourworldindata.org/energy/country/uruguay",
                "https://www.climatewatchdata.org/ndcs/country/URY/full"
        ));
        articlesMap.put("Uzbekistan", List.of(
                "https://data.footprintnetwork.org/?countries=UZB",
                "https://ourworldindata.org/co2/country/uzbekistan",
                "https://ourworldindata.org/energy/country/uzbekistan",
                "https://www.climatewatchdata.org/ndcs/country/UZB/full"
        ));

        // ---- V ----
        articlesMap.put("Vanuatu", List.of(
                "https://data.footprintnetwork.org/?countries=VUT",
                "https://ourworldindata.org/co2/country/vanuatu",
                "https://ourworldindata.org/energy/country/vanuatu",
                "https://www.climatewatchdata.org/ndcs/country/VUT/full"
        ));
        articlesMap.put("Venezuela (Bolivarian Republic of)", List.of(
                "https://data.footprintnetwork.org/?countries=VEN",
                "https://ourworldindata.org/co2/country/venezuela",
                "https://ourworldindata.org/energy/country/venezuela",
                "https://www.climatewatchdata.org/ndcs/country/VEN/full"
        ));
        articlesMap.put("Viet Nam", List.of(
                "https://data.footprintnetwork.org/?countries=VNM",
                "https://ourworldindata.org/co2/country/vietnam",
                "https://ourworldindata.org/energy/country/vietnam",
                "https://climateactiontracker.org/countries/vietnam/",
                "https://www.climatewatchdata.org/ndcs/country/VNM/full"
        ));

        // ---- Y ----
        articlesMap.put("Yemen", List.of(
                "https://data.footprintnetwork.org/?countries=YEM",
                "https://ourworldindata.org/co2/country/yemen",
                "https://ourworldindata.org/energy/country/yemen",
                "https://www.climatewatchdata.org/ndcs/country/YEM/full"
        ));

        // ---- Z ----
        articlesMap.put("Zambia", List.of(
                "https://data.footprintnetwork.org/?countries=ZMB",
                "https://ourworldindata.org/co2/country/zambia",
                "https://ourworldindata.org/energy/country/zambia",
                "https://www.climatewatchdata.org/ndcs/country/ZMB/full"
        ));
        articlesMap.put("Zimbabwe", List.of(
                "https://data.footprintnetwork.org/?countries=ZWE",
                "https://ourworldindata.org/co2/country/zimbabwe",
                "https://ourworldindata.org/energy/country/zimbabwe",
                "https://www.climatewatchdata.org/ndcs/country/ZWE/full"
        ));
    }

    public HashMap<String, List<String>> getArticles(){
        return (HashMap<String, List<String>>) articlesMap;
    }
}
