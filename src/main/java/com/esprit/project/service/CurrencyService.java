package com.esprit.project.service;


import java.util.List;

import com.esprit.project.entity.Currency;

public interface CurrencyService {
    public Currency addCurrency(Currency c);
    public List<Currency> listCurrency ();
    public void deleteCurrency (Currency c);
}
