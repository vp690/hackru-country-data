package hackru.country_data.controller;

import hackru.country_data.model.CountryRequest;
import hackru.country_data.model.CountryResponse;
import hackru.country_data.service.CountryDataService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/country")
public class CountryDataController {

    @Autowired
    CountryDataService countryDataService;

    @PostMapping ("/data")
    public CountryResponse getCountryData(@RequestBody CountryRequest countryRequest){
        return countryDataService.getCountryFromData(countryRequest);
    }

}
