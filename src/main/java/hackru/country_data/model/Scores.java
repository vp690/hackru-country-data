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
        scoreMap.put("India", List.of(0.67, 0.68, 0.69));
        scoreMap.put("Uganda", List.of(0.67, 0.68, 0.69));
        scoreMap.put("USA", List.of(0.67, 0.68, 0.69));
    }

    public HashMap<String, List<Double>> getScores(){
        return (HashMap<String, List<Double>>) scoreMap;
    }
}
