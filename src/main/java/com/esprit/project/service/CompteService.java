package com.esprit.project.service;

import org.springframework.stereotype.Service;

import com.esprit.project.entity.Compte;

import java.util.List;

public interface CompteService {
    Compte addCompte(Compte compte);
    List<Compte> listComptes();
    void deleteCompte (Compte compte);
    Compte updateCompte (Compte compte );
    //void deleteCompteById





}
