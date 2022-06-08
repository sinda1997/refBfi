package com.esprit.project.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.esprit.project.entity.CrossParity;
import com.esprit.project.repository.CrossParityRepository;

import java.util.List;

public class CrossParityServiceImplementation implements CrossParityService{

    @Autowired
    CrossParityRepository crossParityRepository;

    @Override
    public CrossParity addCrossParity(CrossParity cp) {
        return crossParityRepository.save(cp);
    }

    @Override
    public List<CrossParity> listCrossParity() {
        return crossParityRepository.findAll();
    }

    @Override
    public void deleteCrossParity(CrossParity cp) {
        crossParityRepository.delete(cp);
    }
}
