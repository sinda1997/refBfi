package com.esprit.project.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.esprit.project.entity.Currency;
import com.esprit.project.service.CurrencyService;

import java.util.List;

@RestController
@RequestMapping("/api")

public class CurrencyController   {

    @Autowired
    CurrencyService currencyService;

    @PostMapping("/saveCurrency")
    public Currency addCurrency(@RequestBody Currency c){
        return currencyService.addCurrency(c);
    }

    @GetMapping("currencies")
    public List<Currency> listCurrency (){
        return currencyService.listCurrency();
    }

}
