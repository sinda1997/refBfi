package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Client;
import com.esprit.project.entity.ClientEntreprise;
import com.esprit.project.repository.ClientEntrepriseRepository;

@Service
public class ClientEntrepriseServiceImpl implements ClientEntrepriseService{

	@Autowired
	ClientEntrepriseRepository clientEntrepriseRepository;

	private static final Logger l = LogManager.getLogger(AdminService.class);

	@Override
	public List<ClientEntreprise> retrieveAllClientEntreprises() {
		return clientEntrepriseRepository.findAll();
	}

	@Override
	public ClientEntreprise addClientEntreprise(ClientEntreprise clientEntreprise) {
		return clientEntrepriseRepository.save(clientEntreprise);
	}

	@Override
	public void deleteClientEntreprise(String NumRne) {
		long num = Long.parseLong(NumRne);
		clientEntrepriseRepository.deleteById(num);
		
	}

	@Override
	public ClientEntreprise updateClientEntreprise(ClientEntreprise clientEntreprise) {
		return clientEntrepriseRepository.save(clientEntreprise);
	}

	@Override
	public Optional<ClientEntreprise> retrieveClientEntreprise(String NumRne) {
		Optional<ClientEntreprise> clientEntreprise = clientEntrepriseRepository.findById(Long.parseLong(NumRne));
		l.info("ClientEntreprise :" + clientEntreprise);
		return clientEntreprise;
	}

}
