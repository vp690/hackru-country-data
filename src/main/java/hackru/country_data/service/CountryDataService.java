package hackru.country_data.service;

import hackru.country_data.model.CountryRequest;
import hackru.country_data.model.CountryResponse;

public interface CountryDataService {
    public CountryResponse getCountryFromData(CountryRequest countryRequest);
}
