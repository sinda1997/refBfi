package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Personnel;
import com.esprit.project.repository.PersonnelRepository;

@Service
public class PersonnelServiceImpl implements PersonnelService{

	@Autowired
	PersonnelRepository personnelRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);

	@Override
	public List<Personnel> retrieveAllPersonnels() {
		return personnelRepository.findAll();
	}

	@Override
	public Personnel addPersonnel(Personnel personnel) {
		return personnelRepository.save(personnel);
	}

	@Override
	public void deletePersonnel(String idPersonnel) {
		long id = Long.parseLong(idPersonnel);
		personnelRepository.deleteById(id);
	}

	@Override
	public Personnel updatePersonnel(Personnel personnel) {
		return personnelRepository.save(personnel);
	}

	@Override
	public Optional<Personnel> retrievePersonnel(String idPersonnel) {
		Optional<Personnel> personnel = personnelRepository.findById(Long.parseLong(idPersonnel));
		l.info("Personnel :" + personnel);
		return personnel;
	}

}
