package com.esprit.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Currency;
import com.esprit.project.repository.CurrencyRepository;

import java.util.List;

@Service
public class CurrencyServiceImplementation implements CurrencyService {

    @Autowired
    CurrencyRepository currencyRepository;

    @Override
    public Currency addCurrency(Currency c) {
        return currencyRepository.save(c);
    }

    @Override
    public List<Currency> listCurrency() {
        return currencyRepository.findAll();
    }

    @Override
    public void deleteCurrency(Currency c) {
        currencyRepository.delete(c);

    }
}
