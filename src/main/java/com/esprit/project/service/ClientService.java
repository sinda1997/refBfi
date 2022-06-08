package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.Client;

public interface ClientService {

	List<Client> retrieveAllClients();
	Client addClient(Client client);
	void deleteClient(String idClient);
	Client updateClient(Client client);
	Optional<Client> retrieveClient(String idClient);
}
