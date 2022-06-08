package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Client;
import com.esprit.project.entity.ClientProfessionnel;
import com.esprit.project.repository.ClientProfessionnelRepository;

@Service
public class ClientProfessionnelServiceImpl implements ClientProfessionnelService{

	@Autowired
	ClientProfessionnelRepository clientProfessionnelRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);

	@Override
	public List<ClientProfessionnel> retrieveAllClientProfessionnels() {
		return clientProfessionnelRepository.findAll();
	}

	@Override
	public ClientProfessionnel addClientProfessionnel(ClientProfessionnel clientProfessionnel) {
		return clientProfessionnelRepository.save(clientProfessionnel);
	}

	@Override
	public void deleteClientProfessionnel(String NumPattente) {
		long id = Long.parseLong(NumPattente);
		clientProfessionnelRepository.deleteById(id);
		
	}

	@Override
	public ClientProfessionnel updateClientProfessionnel(ClientProfessionnel clientProfessionnel) {
		return clientProfessionnelRepository.save(clientProfessionnel);

	}

	@Override
	public Optional<ClientProfessionnel> retrieveClientProfessionnel(String NumPattente) {
		Optional<ClientProfessionnel> clientProfessionnel = clientProfessionnelRepository.findById(Long.parseLong(NumPattente));
		l.info("ClientProfessionnel :" + clientProfessionnel);
		return clientProfessionnel;
	}

}
