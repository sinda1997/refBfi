package com.esprit.project.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Country;
import com.esprit.project.repository.CountryRepository;

import java.util.List;

@Service
public class CountryServiceImplementation implements CountryService {

    @Autowired
    CountryRepository countryRepository;

    @Override
    public Country addCountry(Country c) {
        return countryRepository.save(c);
    }

    @Override
    public List<Country> listCountry() {
        return countryRepository.findAll();
    }

    @Override
    public void deleteCountry(Country c) {
        countryRepository.delete(c);
    }
}
