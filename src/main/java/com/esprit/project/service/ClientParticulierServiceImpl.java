package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Client;
import com.esprit.project.entity.ClientParticulier;
import com.esprit.project.repository.ClientParticulierRepository;

@Service
public class ClientParticulierServiceImpl implements ClientParticulierService{

	@Autowired
	ClientParticulierRepository clientParticulierRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);
	
	@Override
	public List<ClientParticulier> retrieveAllClientParticuliers() {
		return clientParticulierRepository.findAll();
	}

	@Override
	public ClientParticulier addClientParticulier(ClientParticulier clientParticulier) {
		return clientParticulierRepository.save(clientParticulier);
	}

	@Override
	public void deleteClientParticulier(String Cin) {
		long id = Long.parseLong(Cin);
		clientParticulierRepository.deleteById(id);
		
	}

	@Override
	public ClientParticulier updateClientParticulier(ClientParticulier clientParticulier) {
		return clientParticulierRepository.save(clientParticulier);
	}

	@Override
	public Optional<ClientParticulier> retrieveClientParticulier(String Cin) {
		Optional<ClientParticulier> clientParticulier = clientParticulierRepository.findById(Long.parseLong(Cin));
		l.info("ClientParticulier :" + clientParticulier);
		return clientParticulier;
	}

}
