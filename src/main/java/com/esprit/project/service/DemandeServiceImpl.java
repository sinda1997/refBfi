package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Client;
import com.esprit.project.entity.Demande;
import com.esprit.project.repository.ClientRepository;
import com.esprit.project.repository.DemandeRepository;

@Service
public class DemandeServiceImpl implements DemandeService{

	@Autowired
	DemandeRepository demandeRepository;
	@Autowired
	ClientServiceImpl clientServiceImpl;
	@Autowired
	ClientRepository clientRepository;
	
	private static final Logger l = LogManager.getLogger(ClientService.class);

	
	@Override
	public List<Demande> retrieveAllDemandes() {
		List<Demande> demandes = (List<Demande>) demandeRepository.findAll();
		for (Demande demande : demandes) {
			l.info("Demande:" + demande);
		}
		return demandes;
	}

	@Override
	public Demande addDemande(Demande demande) {
		return demandeRepository.save(demande);
	}

	@Override
	public void deleteDemande(String NumDemande) {
		long id = Long.parseLong(NumDemande);
		demandeRepository.deleteById(id);
		
	}

	@Override
	public Demande updateDemande(Demande demande) {
		return demandeRepository.save(demande);
	}

	@Override
	public Optional<Demande> retrieveDemande(String NumDemande) {
		Optional<Demande> demande = demandeRepository.findById(Long.parseLong(NumDemande));
		l.info("Demande :" + demande);
		return demande;
	}

	//@Override
	public void store(Demande demande, Long idClient) {
		Client client = clientServiceImpl.findById(idClient);
		Demande demande2 = new Demande(demande.getNumDemande(), demande.getBesoin(), demande.getDuree(), demande.getMontant(), demande.getAnnuiteMaximale(), client);
		demandeRepository.save(demande2);
		
	}
	
	public Demande findById(Long id) {
		Optional<Demande> result = demandeRepository.findById(id);
		Demande demande = null;
		
		if(result.isPresent()) {
			 demande = result.get();
		}
		else {
			throw new RuntimeException("cannot find the demande" + id);
		}
		return demande;
	}

	/*@Override
	public Demande gestionDemande(String NumDemande) {
		// TODO Auto-generated method stub
		return null;
	}
	*/
	@Override
	public Demande gestionDemande(Long NumDemande) {
		return this.findById(NumDemande);
	}

	/*@Override
	public void affecterDemandeAClient(Long numDemande, Long idClient) {
		Demande demande = demandeRepository.findById((long) numDemande).get();
		Client client = clientRepository.findById((long) idClient).get();
		demande.setClient(client);
		client.setDemande(demande);
		demandeRepository.save(demande);
		clientRepository.save(client);
		
	}*/

}
