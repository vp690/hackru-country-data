package hackru.country_data.model;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class Scores {
    // Declare a static HashMap
    private static final Map<String, List<Double>> scoreMap = new HashMap<>();

    // Initialize the static HashMap (can be done in a static block or directly)
    static {

        scoreMap.put("Afghanistan", List.of(0.21, 990.47, 0.9));
        scoreMap.put("Albania", List.of(1.56, 8032.07, 2.1));
        scoreMap.put("Algeria", List.of(3.99, 16994.38, 2.4));
        scoreMap.put("Angola", List.of(0.78, 2680.34, 1.0));
        scoreMap.put("Antigua and Barbuda", List.of(2.99, 32266.11, 3.9));
        scoreMap.put("Argentina", List.of(3.93, 22053.05, 3.4));
        scoreMap.put("Armenia", List.of(2.63, 16027.84, 2.1));
        scoreMap.put("Australia", List.of(14.21, 62658.08, 6.1));
        scoreMap.put("Austria", List.of(6.65, 43148.04, 5.8));
        scoreMap.put("Azerbaijan", List.of(4.14, 21072.76, 2.3));
        scoreMap.put("Bahamas", List.of(4.04, 30598.40, 1.6));
        scoreMap.put("Bahrain", List.of(20.70, 164932.52, 8.1));
        scoreMap.put("Bangladesh", List.of(0.71, 2954.85, 0.7));
        scoreMap.put("Barbados", List.of(2.76, 20013.90, 3.2));
        scoreMap.put("Belarus", List.of(5.79, 33297.79, 4.7));
        scoreMap.put("Belgium", List.of(7.18, 55542.02, 7.2));
        scoreMap.put("Belize", List.of(0.66, 9012.32, 8.1));
        scoreMap.put("Benin", List.of(0.49, 1896.63, 1.3));
        scoreMap.put("Bhutan", List.of(0.33, 4000.0, 1.2));        // low emissions, hydropower-heavy
        scoreMap.put("Bolivia", List.of(1.89, 7000.0, 2.5));       // developing energy sector
        scoreMap.put("Bosnia and Herzegovina", List.of(4.50, 20000.0, 4.3));  // coal-dependent
        scoreMap.put("Botswana", List.of(8.70, 22000.0, 4.9));     // high fossil fuel reliance
        scoreMap.put("Brazil", List.of(2.10, 8000.0, 3.6));        // hydro + biofuel offset
        scoreMap.put("Brunei Darussalam", List.of(18.20, 110000.0, 7.1)); // oil-exporting
        scoreMap.put("Bulgaria", List.of(6.60, 36000.0, 4.8));     // mixed renewables and coal
        scoreMap.put("Burkina Faso", List.of(0.30, 1200.0, 1.1));  // minimal industrial energy use
        scoreMap.put("Burundi", List.of(0.10, 800.0, 0.8));        // very low energy footprint
        scoreMap.put("Cabo Verde", List.of(0.90, 4200.0, 1.7));    // small island, imported fuel
        scoreMap.put("Cambodia", List.of(0.75, 3200.0, 2.0));      // rising energy demand
        scoreMap.put("Cameroon", List.of(0.60, 2800.0, 1.9));      // hydro-rich but limited grid
        scoreMap.put("Canada", List.of(15.40, 95000.0, 8.0));      // high per capita use
        scoreMap.put("Central African Republic", List.of(0.09, 700.0, 0.8));  // low development
        scoreMap.put("Chad", List.of(0.15, 1200.0, 1.0));          // low industry, high emissions growth
        scoreMap.put("Chile", List.of(4.80, 23000.0, 4.0));        // renewables growing fast
        scoreMap.put("China", List.of(8.70, 30000.0, 4.6));        // world’s top emitter
        scoreMap.put("Colombia", List.of(1.80, 10000.0, 2.8));     // hydro power dominant
        scoreMap.put("Comoros", List.of(0.40, 3000.0, 1.6));       // island import-dependent
        scoreMap.put("Congo, Republic of the", List.of(2.50, 6000.0, 2.3));   // oil-driven economy
        scoreMap.put("Congo, Democratic Republic of the", List.of(0.15, 1100.0, 1.2)); // low grid coverage
        scoreMap.put("Costa Rica", List.of(1.40, 9000.0, 2.6));    // almost 100% renewable power
        scoreMap.put("Croatia", List.of(3.90, 26000.0, 4.7));      // EU renewables expansion
        scoreMap.put("Cuba", List.of(3.10, 18000.0, 3.2));           // moderate industrial sector
        scoreMap.put("Cyprus", List.of(5.60, 39000.0, 4.9));         // high transport emissions
        scoreMap.put("Czech Republic", List.of(8.10, 51000.0, 5.5)); // strong manufacturing base
        scoreMap.put("Denmark", List.of(5.00, 45000.0, 5.4));        // high renewables adoption
        scoreMap.put("Djibouti", List.of(0.40, 2500.0, 1.4));        // low fossil use
        scoreMap.put("Dominica", List.of(1.00, 5200.0, 1.8));        // small island energy mix
        scoreMap.put("Dominican Republic", List.of(2.60, 12500.0, 2.9)); // rapid tourism growth
        scoreMap.put("Ecuador", List.of(2.40, 9500.0, 2.7));         // hydro + oil combination
        scoreMap.put("Egypt", List.of(2.90, 14500.0, 3.2));          // large fossil generation
        scoreMap.put("El Salvador", List.of(1.10, 7200.0, 2.0));     // growing renewable share
        scoreMap.put("Equatorial Guinea", List.of(6.50, 28000.0, 3.9)); // oil-dependent
        scoreMap.put("Eritrea", List.of(0.20, 900.0, 1.0));          // very low energy access
        scoreMap.put("Estonia", List.of(9.00, 64000.0, 6.2));        // oil-shale legacy, improving
        scoreMap.put("Eswatini", List.of(1.80, 7800.0, 2.4));        // small but industrializing
        scoreMap.put("Ethiopia", List.of(0.20, 1800.0, 1.2));        // hydropower investments
        scoreMap.put("Fiji", List.of(1.40, 6500.0, 2.1));            // renewable push in islands
        scoreMap.put("Finland", List.of(7.20, 70000.0, 6.0));        // heavy industry, clean energy
        scoreMap.put("France", List.of(4.40, 41000.0, 4.7));         // strong nuclear base
        scoreMap.put("Gabon", List.of(3.20, 16500.0, 3.0));          // oil and forestry balance
        scoreMap.put("Gambia", List.of(0.35, 2100.0, 1.2));          // small coastal economy
        scoreMap.put("Georgia", List.of(2.50, 13000.0, 2.6));        // hydro-driven
        scoreMap.put("Germany", List.of(7.90, 56000.0, 6.1));        // major EU emitter
        scoreMap.put("Ghana", List.of(0.70, 3900.0, 2.0));           // hydro and gas mix
        scoreMap.put("Greece", List.of(5.40, 39000.0, 4.8));         // tourism & shipping impact
        scoreMap.put("Grenada", List.of(2.30, 11800.0, 2.9));        // small island economy
        scoreMap.put("Guatemala", List.of(1.10, 5800.0, 2.1));       // hydro + biomass mix
        scoreMap.put("Guinea", List.of(0.50, 2300.0, 1.4));          // low industrialization
        scoreMap.put("Guinea-Bissau", List.of(0.30, 1500.0, 1.0));   // minimal energy usage
        scoreMap.put("Guyana", List.of(2.70, 8200.0, 3.3));          // new oil production rising
        scoreMap.put("Haiti", List.of(0.35, 1900.0, 1.2));           // deforestation effects
        scoreMap.put("Honduras", List.of(1.00, 5000.0, 2.0));        // growing renewables
        scoreMap.put("Hungary", List.of(5.10, 37000.0, 4.5));        // nuclear + gas balance
        scoreMap.put("Iceland", List.of(6.00, 70000.0, 5.0));        // renewable leader
        scoreMap.put("India", List.of(2.00, 9000.0, 1.7));           // rapid industrial growth
        scoreMap.put("Indonesia", List.of(2.30, 11000.0, 2.5));      // coal-heavy but improving
        scoreMap.put("Iran", List.of(8.60, 37000.0, 4.3));           // fossil fuel producer
        scoreMap.put("Iraq", List.of(4.70, 18000.0, 3.5));           // oil-dominated economy
        scoreMap.put("Ireland", List.of(7.00, 54000.0, 5.7));        // agricultural + tech industry
        scoreMap.put("Israel", List.of(6.40, 48000.0, 4.8));         // efficient but high-tech energy use
        scoreMap.put("Italy", List.of(5.20, 38000.0, 4.6));          // strong renewables expansion
        scoreMap.put("Jamaica", List.of(2.40, 15000.0, 3.1));        // tourism & import dependence
        scoreMap.put("Japan", List.of(8.60, 52000.0, 5.5));          // dense urban energy use
        scoreMap.put("Jordan", List.of(2.20, 11000.0, 2.9));         // growing solar investments
        scoreMap.put("Kazakhstan", List.of(13.00, 58000.0, 5.2));    // heavy coal reliance
        scoreMap.put("Kenya", List.of(0.50, 3000.0, 1.8));           // geothermal leader in Africa
        scoreMap.put("Kiribati", List.of(0.40, 4200.0, 1.5));        // small island emissions
        scoreMap.put("Kuwait", List.of(22.00, 175000.0, 8.5));       // oil-rich nation
        scoreMap.put("Kyrgyzstan", List.of(1.80, 9500.0, 2.3));      // hydro-dependent
        scoreMap.put("Laos", List.of(1.10, 8500.0, 2.1));            // expanding hydro exports
        scoreMap.put("Latvia", List.of(3.80, 29000.0, 4.0));         // Baltic renewables mix
        scoreMap.put("Lebanon", List.of(3.40, 21000.0, 3.2));         // energy imports & crisis impact
        scoreMap.put("Lesotho", List.of(1.20, 4800.0, 1.8));          // hydro exports to South Africa
        scoreMap.put("Liberia", List.of(0.40, 2000.0, 1.3));          // post-war recovery stage
        scoreMap.put("Libya", List.of(9.80, 43000.0, 4.4));           // oil-driven, low population
        scoreMap.put("Liechtenstein", List.of(5.30, 52000.0, 5.6));   // affluent microstate
        scoreMap.put("Lithuania", List.of(4.50, 35000.0, 4.4));       // Baltic renewables integration
        scoreMap.put("Luxembourg", List.of(13.60, 95000.0, 8.3));     // wealthy, commuter-based emissions
        scoreMap.put("Madagascar", List.of(0.20, 1800.0, 1.5));       // deforestation effects
        scoreMap.put("Malawi", List.of(0.15, 1600.0, 1.2));           // limited grid access
        scoreMap.put("Malaysia", List.of(7.70, 39000.0, 4.6));        // industrial hub, palm oil exports
        scoreMap.put("Maldives", List.of(3.00, 23000.0, 3.1));        // small island, diesel reliant
        scoreMap.put("Mali", List.of(0.30, 2200.0, 1.2));             // low energy access
        scoreMap.put("Malta", List.of(5.00, 37000.0, 4.7));           // compact island economy
        scoreMap.put("Marshall Islands", List.of(2.10, 9000.0, 2.4)); // small island, sea-level issues
        scoreMap.put("Mauritania", List.of(1.50, 5000.0, 2.0));       // mining-based economy
        scoreMap.put("Mauritius", List.of(3.60, 19500.0, 3.5));       // renewable expansion
        scoreMap.put("Mexico", List.of(3.90, 18000.0, 3.4));          // large industrial output
        scoreMap.put("Micronesia", List.of(1.00, 7200.0, 2.1));       // diesel + solar mix
        scoreMap.put("Moldova", List.of(2.90, 14000.0, 3.0));         // energy imports from Romania
        scoreMap.put("Monaco", List.of(4.10, 45000.0, 5.2));          // high urban density
        scoreMap.put("Mongolia", List.of(13.00, 47000.0, 5.0));       // coal-dominant heating systems
        scoreMap.put("Montenegro", List.of(4.60, 26000.0, 3.8));      // hydro and tourism
        scoreMap.put("Morocco", List.of(2.40, 11500.0, 2.6));         // growing solar investment
        scoreMap.put("Mozambique", List.of(0.30, 2200.0, 1.4));       // hydroelectric potential
        scoreMap.put("Myanmar", List.of(0.90, 3800.0, 2.0));          // rapid development, hydropower use
        scoreMap.put("Namibia", List.of(1.50, 6000.0, 2.3));          // arid climate, mining-driven
        scoreMap.put("Nauru", List.of(4.00, 21000.0, 3.5));           // small island, phosphate export
        scoreMap.put("Nepal", List.of(0.50, 2800.0, 1.7));            // hydro-based, low emissions
        scoreMap.put("Netherlands", List.of(8.00, 53000.0, 6.7));     // strong renewables, dense population
        scoreMap.put("New Zealand", List.of(6.90, 48000.0, 5.4));     // renewable-heavy agriculture
        scoreMap.put("Nicaragua", List.of(0.90, 4000.0, 2.0));        // growing geothermal power
        scoreMap.put("Niger", List.of(0.20, 1200.0, 1.0));            // low electrification rate
        scoreMap.put("Nigeria", List.of(0.70, 4000.0, 2.3));          // oil exporter but low per capita use
        scoreMap.put("North Macedonia", List.of(4.70, 25000.0, 3.9)); // Balkan renewables mix
        scoreMap.put("Norway", List.of(7.30, 75000.0, 6.1));          // hydropower leader
        scoreMap.put("Oman", List.of(14.90, 145000.0, 7.8));          // oil-rich Gulf nation
        scoreMap.put("Pakistan", List.of(1.00, 5200.0, 1.9));         // coal and hydro expansion
        scoreMap.put("Palau", List.of(3.30, 17500.0, 3.2));           // small island imports
        scoreMap.put("Panama", List.of(2.70, 14500.0, 3.0));          // hydro and canal economy
        scoreMap.put("Papua New Guinea", List.of(1.10, 6200.0, 2.0)); // resource-dependent
        scoreMap.put("Paraguay", List.of(0.70, 8700.0, 2.3));         // exports hydroelectricity
        scoreMap.put("Peru", List.of(2.20, 9800.0, 2.8));             // hydro + mining mix
        scoreMap.put("Philippines", List.of(1.50, 6400.0, 2.1));      // growing renewables
        scoreMap.put("Poland", List.of(7.80, 46000.0, 5.4));          // coal-heavy, transitioning
        scoreMap.put("Portugal", List.of(4.30, 37000.0, 4.5));        // wind and solar adoption
        scoreMap.put("Qatar", List.of(30.00, 220000.0, 9.0));         // highest per capita emissions
        scoreMap.put("Romania", List.of(4.00, 31000.0, 4.1));         // diverse energy mix
        scoreMap.put("Russia", List.of(11.50, 65000.0, 6.8));         // high fossil dependency
        scoreMap.put("Rwanda", List.of(0.15, 1500.0, 1.1));           // hydro and biomass reliance
        scoreMap.put("Saint Kitts and Nevis", List.of(2.80, 15500.0, 3.0));    // small island imports
        scoreMap.put("Saint Lucia", List.of(2.40, 12500.0, 2.8));              // tourism-driven economy
        scoreMap.put("Saint Vincent and the Grenadines", List.of(2.00, 10200.0, 2.6)); // small island grid
        scoreMap.put("Samoa", List.of(1.50, 7800.0, 2.2));                     // renewable push in Pacific
        scoreMap.put("San Marino", List.of(5.10, 42000.0, 4.9));               // small, affluent state
        scoreMap.put("Sao Tome and Principe", List.of(0.80, 3800.0, 1.9));     // limited grid, growing solar
        scoreMap.put("Saudi Arabia", List.of(17.60, 125000.0, 7.5));           // oil-based economy
        scoreMap.put("Senegal", List.of(0.80, 3200.0, 1.8));                   // renewable expansion
        scoreMap.put("Serbia", List.of(6.60, 37000.0, 4.5));                   // coal transition in Balkans
        scoreMap.put("Seychelles", List.of(5.00, 28000.0, 3.9));               // small island economy
        scoreMap.put("Sierra Leone", List.of(0.40, 2000.0, 1.3));              // post-conflict development
        scoreMap.put("Singapore", List.of(8.80, 58000.0, 6.4));                // industrial hub
        scoreMap.put("Slovakia", List.of(6.10, 39000.0, 4.8));                 // EU industry, renewables rising
        scoreMap.put("Slovenia", List.of(6.00, 40000.0, 4.6));                 // high efficiency
        scoreMap.put("Solomon Islands", List.of(0.80, 4200.0, 2.0));           // isolated grid
        scoreMap.put("Somalia", List.of(0.10, 900.0, 0.9));                    // conflict impact, low access
        scoreMap.put("South Africa", List.of(6.90, 28000.0, 4.5));             // coal-heavy economy
        scoreMap.put("South Korea", List.of(11.80, 62000.0, 6.2));             // tech and manufacturing center
        scoreMap.put("South Sudan", List.of(0.15, 1400.0, 1.0));               // conflict-affected, low grid access
        scoreMap.put("Spain", List.of(5.00, 39000.0, 4.8));              // strong solar + wind capacity
        scoreMap.put("Sri Lanka", List.of(1.10, 5400.0, 2.3));           // hydro + thermal energy
        scoreMap.put("Sudan", List.of(0.60, 2500.0, 1.5));               // limited infrastructure
        scoreMap.put("Suriname", List.of(3.00, 14000.0, 3.1));           // oil and mining exports
        scoreMap.put("Sweden", List.of(3.60, 59000.0, 6.0));             // renewables leader
        scoreMap.put("Switzerland", List.of(4.40, 51000.0, 5.3));        // efficient, hydro-dominant
        scoreMap.put("Syria", List.of(1.90, 8500.0, 2.6));               // reconstruction phase
        scoreMap.put("Taiwan", List.of(11.00, 67000.0, 6.5));            // major industrial hub
        scoreMap.put("Tajikistan", List.of(1.00, 6000.0, 2.0));          // hydro-reliant
        scoreMap.put("Tanzania", List.of(0.40, 2600.0, 1.5));            // hydro + biomass mix
        scoreMap.put("Thailand", List.of(4.70, 28000.0, 3.6));           // growing industrial economy
        scoreMap.put("Timor-Leste", List.of(0.60, 3500.0, 1.8));         // developing grid
        scoreMap.put("Togo", List.of(0.50, 2300.0, 1.4));                // improving electrification
        scoreMap.put("Tonga", List.of(1.70, 9800.0, 2.3));               // island imports, small grid
        scoreMap.put("Trinidad and Tobago", List.of(23.00, 165000.0, 7.8));   // oil & gas exporter
        scoreMap.put("Tunisia", List.of(2.60, 13500.0, 3.0));                 // developing solar sector
        scoreMap.put("Turkey", List.of(5.00, 32000.0, 4.0));                  // diversified energy mix
        scoreMap.put("Turkmenistan", List.of(13.50, 76000.0, 5.2));           // natural gas exports
        scoreMap.put("Tuvalu", List.of(1.20, 7200.0, 2.1));                   // small island, diesel power
        scoreMap.put("Uganda", List.of(0.30, 2400.0, 1.3));                   // hydro-dependent
        scoreMap.put("Ukraine", List.of(5.40, 29000.0, 3.9));                 // wartime energy strain
        scoreMap.put("United Arab Emirates", List.of(20.50, 150000.0, 8.0));  // high per capita emissions
        scoreMap.put("United Kingdom", List.of(5.00, 37000.0, 4.9));          // decarbonizing economy
        scoreMap.put("United States", List.of(14.00, 80000.0, 8.5));          // major global emitter
        scoreMap.put("Uruguay", List.of(2.20, 12000.0, 3.3));                 // renewable-heavy grid
        scoreMap.put("Uzbekistan", List.of(6.00, 26000.0, 3.7));              // fossil-based but diversifying
        scoreMap.put("Vanuatu", List.of(1.10, 7200.0, 2.0));                  // island renewables effort
        scoreMap.put("Venezuela", List.of(3.60, 17500.0, 3.5));               // hydro + oil dependence
        scoreMap.put("Vietnam", List.of(3.00, 14500.0, 3.1));                 // coal-heavy growth
        scoreMap.put("Yemen", List.of(0.80, 3200.0, 1.9));                    // conflict and energy shortage
        scoreMap.put("Zambia", List.of(0.40, 2800.0, 1.6));                   // hydro exports regionally
        scoreMap.put("Zimbabwe", List.of(0.90, 4200.0, 2.2));                 // growing solar potential

    }

    public HashMap<String, List<Double>> getScores(){
        return (HashMap<String, List<Double>>) scoreMap;
    }
}
