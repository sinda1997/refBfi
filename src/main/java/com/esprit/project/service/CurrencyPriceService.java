package com.esprit.project.service;


import java.util.List;

import com.esprit.project.entity.CurrencyPrice;

public interface CurrencyPriceService {
     CurrencyPrice addCurrencyPrice(CurrencyPrice cp);
     List<CurrencyPrice> listCp();
     void deleteCurrencyPrice(CurrencyPrice cp);
}
