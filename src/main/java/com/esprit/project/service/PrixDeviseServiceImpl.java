/*package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.PrixDevise;
import com.esprit.project.repository.PrixDeviseRepository;

@Service
public class PrixDeviseServiceImpl implements PrixDeviseService{

	@Autowired
	PrixDeviseRepository prixDeviseRepository;
	
	private static final Logger l = LogManager.getLogger(AdminServiceImpl.class);

	@Override
	public List<PrixDevise> retrieveAllPrixDevises() {
		return prixDeviseRepository.findAll();
	}

	@Override
	public PrixDevise addPrixDevise(PrixDevise prixDevise) {
		return prixDeviseRepository.save(prixDevise);
	}

	@Override
	public void deletePrixDevise(String BuyPrice) {
		long id = Long.parseLong(BuyPrice);
		prixDeviseRepository.deleteById(id);
	}

	@Override
	public PrixDevise updatePrixDevise(PrixDevise prixDevise) {
		return prixDeviseRepository.save(prixDevise);
	}

	@Override
	public Optional<PrixDevise> retrievePrixDevise(String BuyPrice) {
		Optional<PrixDevise> prixDevise = prixDeviseRepository.findById(Long.parseLong(BuyPrice));
		l.info("PrixDevise :" + prixDevise);
		return prixDevise;
	}

}*/
