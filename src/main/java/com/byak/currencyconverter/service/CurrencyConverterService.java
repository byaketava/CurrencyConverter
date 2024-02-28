package com.byak.currencyconverter.service;

import com.byak.currencyconverter.model.CurrencyConverterResponse;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CurrencyConverterService {
    @Value("${api.key}")
    private String apiKey;
    private static final String API_URL = "https://api.getgeoapi.com/v2/currency/convert";

    public CurrencyConverterResponse convertCurrency(String fromCurrency, String toCurrency,
                                                     double amount) {
        String url = API_URL + "?api_key=" + apiKey + "&from=" + fromCurrency
                + "&to=" + toCurrency + "&amount=" + amount + "&format=json";
        RestTemplate restTemplate = new RestTemplate();

        CurrencyConverterResponse response = restTemplate.getForObject(url, CurrencyConverterResponse.class);
        if (response == null) {
            throw new RuntimeException("Failed to convert currency. API response is null.");
        }
        return response;
    }
}
