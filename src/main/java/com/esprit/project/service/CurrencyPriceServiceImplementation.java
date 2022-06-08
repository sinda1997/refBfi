package com.esprit.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.CurrencyPrice;
import com.esprit.project.repository.CurrencyPriceRepository;

import java.util.List;

@Service
public class CurrencyPriceServiceImplementation implements CurrencyPriceService{
    @Autowired
    CurrencyPriceRepository currencyPriceRepository;

    @Override
    public CurrencyPrice addCurrencyPrice(CurrencyPrice cp) {
        return currencyPriceRepository.save(cp);
    }

    @Override
    public List<CurrencyPrice> listCp() {
        return currencyPriceRepository.findAll();
    }

    @Override
    public void deleteCurrencyPrice(CurrencyPrice cp) {
        currencyPriceRepository.delete(cp);
    }
}
