package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.ClientEntreprise;

public interface ClientEntrepriseService {
	
	List<ClientEntreprise> retrieveAllClientEntreprises();
	ClientEntreprise addClientEntreprise(ClientEntreprise clientEntreprise);
	void deleteClientEntreprise(String NumRne);
	ClientEntreprise updateClientEntreprise(ClientEntreprise clientEntreprise);
	Optional<ClientEntreprise> retrieveClientEntreprise(String NumRne);

}
