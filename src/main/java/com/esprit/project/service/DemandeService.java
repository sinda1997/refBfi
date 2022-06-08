package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.Demande;

public interface DemandeService {

	List<Demande> retrieveAllDemandes();
	Demande addDemande(Demande demande);
	void deleteDemande(String NumDemande);
	Demande updateDemande(Demande demande);
	Optional<Demande> retrieveDemande(String NumDemande);
	void store (Demande demande, Long idClient);
	Demande gestionDemande(Long NumDemande);
	//void affecterDemandeAClient(Long numDemande, Long idClient);

}
