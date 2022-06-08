package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.ClientProfessionnel;

public interface ClientProfessionnelService {

	List<ClientProfessionnel> retrieveAllClientProfessionnels();
	ClientProfessionnel addClientProfessionnel(ClientProfessionnel clientProfessionnel);
	void deleteClientProfessionnel(String NumPattente);
	ClientProfessionnel updateClientProfessionnel(ClientProfessionnel clientProfessionnel);
	Optional<ClientProfessionnel> retrieveClientProfessionnel(String NumPattente);
}
