package com.byak.currencyconverter.service;

import com.byak.currencyconverter.model.CurrencyConverterResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyConverterService {
    private static final String apiUrl = "https://api.getgeoapi.com/v2/currency/convert";
    private static final String apiKey = "592c7851435b279c868970e0c7955dd286cdef1f";

    public CurrencyConverterResponse convertCurrency(String fromCurrency, String toCurrency,
                                                     double amount) {
        String url = apiUrl + "?api_key=" + apiKey + "&from=" + fromCurrency + "&to="
                     + toCurrency + "&amount=" + amount + "&format=json";
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject(url, CurrencyConverterResponse.class);
    }
}
