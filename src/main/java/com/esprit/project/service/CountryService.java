package com.esprit.project.service;


import java.util.List;

import com.esprit.project.entity.Country;

public interface CountryService {
    Country addCountry(Country c);
    List<Country> listCountry();
    void deleteCountry(Country c);
}
