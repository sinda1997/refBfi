package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.ClientParticulierEtranger;

public interface ClientParticulierEtrangerService {

	List<ClientParticulierEtranger> retrieveAllClientParticulierEtrangers();
	ClientParticulierEtranger addClientParticulierEtranger(ClientParticulierEtranger clientParticulierEtranger);
	void deleteClientParticulierEtranger(String Cin);
	ClientParticulierEtranger updateClientParticulierEtranger(ClientParticulierEtranger clientParticulierEtranger);
	Optional<ClientParticulierEtranger> retrieveClientParticulierEtranger(String Cin);
}
