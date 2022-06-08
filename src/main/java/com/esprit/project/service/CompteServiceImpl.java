package com.esprit.project.service;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.esprit.project.entity.Compte;
import com.esprit.project.entity.Demande;
import com.esprit.project.repository.CompteRepository;

import java.util.List;

@Service

public class CompteServiceImpl implements CompteService {

	private static final Logger l = LogManager.getLogger(ClientService.class);

    @Autowired
    CompteRepository compteRepository;


    @Override
    public Compte addCompte(Compte compte) {
        return compteRepository.save(compte);
    }

    @Override
    public List<Compte> listComptes() {
    	List<Compte> comptes = (List<Compte>) compteRepository.findAll();
		for (Compte compte : comptes) {
			l.info("Compte:" + compte);
		}
		return comptes;
    }

    @Override
    public void deleteCompte(Compte compte) {
        compteRepository.delete(compte);
    }

    @Override
    public Compte updateCompte(Compte compte) {
        return compteRepository.save(compte);

    }

    //public void deleteCompteById(Long id) {
    //    compteRepository.deleteCompteById(id);
    //}



}
