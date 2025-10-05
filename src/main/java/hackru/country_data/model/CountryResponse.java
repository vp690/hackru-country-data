package hackru.country_data.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class CountryResponse {
    private List<Double> scores;
    private List<String> links;

}
