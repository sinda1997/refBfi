package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.Banque;


public interface BanqueService {
	
	List<Banque> retrieveAllBanques();
	Banque addBanque(Banque banque);
	void deleteBanque(String idBanque);
	Banque updateBanque(Banque banque);
	Optional<Banque> retrieveBanque(String idBanque);

}
