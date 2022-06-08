package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Banque;
import com.esprit.project.repository.BanqueRepository;

@Service
public class BanqueServiceImpl implements BanqueService{

	@Autowired
	private BanqueRepository banqueRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);
	
	@Override
	public List<Banque> retrieveAllBanques() {
		return banqueRepository.findAll();
	}

	@Override
	public Banque addBanque(Banque banque) {
		return banqueRepository.save(banque);
	}

	@Override
	public void deleteBanque(String idBanque) {
		long id = Long.parseLong(idBanque);
		banqueRepository.deleteById(id);
		
	}

	@Override
	public Banque updateBanque(Banque banque) {
		return banqueRepository.save(banque);

	}

	@Override
	public Optional<Banque> retrieveBanque(String idBanque) {
		Optional<Banque> banque = banqueRepository.findById(Long.parseLong(idBanque));
		l.info("Banque :" + banque);
		return banque;
	}

}
