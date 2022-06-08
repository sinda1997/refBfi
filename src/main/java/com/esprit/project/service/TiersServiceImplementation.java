package com.esprit.project.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Tiers;
import com.esprit.project.repository.TiersRepository;

import java.util.List;

@Service
public class TiersServiceImplementation implements TiersService{

    @Autowired
    TiersRepository tiersRepository;


    @Override
    public Tiers addTiers(Tiers t) {
        return tiersRepository.save(t);
    }

    @Override
    public List<Tiers> listTiers() {
        return tiersRepository.findAll();
    }

    @Override
    public void deleteTiers(Tiers t) {
        tiersRepository.delete(t);
    }
}
