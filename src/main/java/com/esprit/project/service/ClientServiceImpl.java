package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Client;
import com.esprit.project.repository.ClientRepository;

@Service
public class ClientServiceImpl implements ClientService{

	@Autowired
	ClientRepository clientRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);
	
	@Override
	public List<Client> retrieveAllClients() {
		return clientRepository.findAll();
	}

	@Override
	public Client addClient(Client client) {
		return clientRepository.save(client);
	}

	@Override
	public void deleteClient(String idClient) {
		long id = Long.parseLong(idClient);
		clientRepository.deleteById(id);
	}

	@Override
	public Client updateClient(Client client) {
		return clientRepository.save(client);

	}

	@Override
	public Optional<Client> retrieveClient(String idClient) {
		Optional<Client> client = clientRepository.findById(Long.parseLong(idClient));
		l.info("Client :" + client);
		return client;
	}

	public Client findById(Long id) {
		Optional<Client> result = clientRepository.findById(id);
		Client client = null;
		
		if(result.isPresent()) {
			client = result.get();
		}
		else {
			throw new RuntimeException("cannot find the user" + id);
		}
		return client;
	}
}
