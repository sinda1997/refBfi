package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.ClientParticulier;

public interface ClientParticulierService {

	List<ClientParticulier> retrieveAllClientParticuliers();
	ClientParticulier addClientParticulier(ClientParticulier clientParticulier);
	void deleteClientParticulier(String Cin);
	ClientParticulier updateClientParticulier(ClientParticulier clientParticulier);
	Optional<ClientParticulier> retrieveClientParticulier(String Cin);
}
