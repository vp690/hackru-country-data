package hackru.country_data.service.impl;

import hackru.country_data.model.*;
import hackru.country_data.service.CountryDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;

@Service
public class CountryDataServiceImpl implements CountryDataService {

    @Autowired
    Scores scores;

    @Autowired
    CountryLinks countryLinks;

    @Override
    public CountryResponse getCountryFromData(CountryRequest countryRequest) {
        CountryResponse countryResponse = new CountryResponse();
        String country = countryRequest.getCountry();

        if(scores.getScores().containsKey(country)){
            countryResponse.setScores(scores.getScores().get(country));
        }

        if(countryLinks.getArticles().containsKey(country)){
            countryResponse.setLinks(countryLinks.getArticles().get(country));
        }

        return countryResponse;
    }
}
