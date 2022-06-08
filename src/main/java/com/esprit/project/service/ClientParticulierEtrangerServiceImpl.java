package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Client;
import com.esprit.project.entity.ClientParticulierEtranger;
import com.esprit.project.repository.ClientParticulierEtrangerRepository;

@Service
public class ClientParticulierEtrangerServiceImpl implements ClientParticulierEtrangerService{

	@Autowired
	ClientParticulierEtrangerRepository clientParticulierEtrangerRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);
	
	@Override
	public List<ClientParticulierEtranger> retrieveAllClientParticulierEtrangers() {
		return clientParticulierEtrangerRepository.findAll();
	}

	@Override
	public ClientParticulierEtranger addClientParticulierEtranger(ClientParticulierEtranger clientParticulierEtranger) {
		return clientParticulierEtrangerRepository.save(clientParticulierEtranger);

	}

	@Override
	public void deleteClientParticulierEtranger(String Cin) {
		long id = Long.parseLong(Cin);
		clientParticulierEtrangerRepository.deleteById(id);
		
	}

	@Override
	public ClientParticulierEtranger updateClientParticulierEtranger(
			ClientParticulierEtranger clientParticulierEtranger) {
		return clientParticulierEtrangerRepository.save(clientParticulierEtranger);

	}

	@Override
	public Optional<ClientParticulierEtranger> retrieveClientParticulierEtranger(String Cin) {
		Optional<ClientParticulierEtranger> clientParticulierEtranger = clientParticulierEtrangerRepository.findById(Long.parseLong(Cin));
		l.info("ClientParticulierEtranger :" + clientParticulierEtranger);
		return clientParticulierEtranger;
	}

}
