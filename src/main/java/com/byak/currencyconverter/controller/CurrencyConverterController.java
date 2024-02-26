package com.byak.currencyconverter.controller;

import com.byak.currencyconverter.model.CurrencyConverterResponse;
import com.byak.currencyconverter.service.CurrencyConverterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/convert")
public class CurrencyConverterController {

    @Autowired
    private  CurrencyConverterService currencyConverterService;

    @GetMapping("/{fromCurrency}/{toCurrency}/{amount}")
    public CurrencyConverterResponse convertCurrency(
            @PathVariable String fromCurrency,
            @PathVariable String toCurrency,
            @PathVariable double amount) {
        return currencyConverterService.convertCurrency(fromCurrency, toCurrency, amount);
    }
}
