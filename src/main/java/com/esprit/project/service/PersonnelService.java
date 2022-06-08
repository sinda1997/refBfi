package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.Personnel;

public interface PersonnelService {

	List<Personnel> retrieveAllPersonnels();
	Personnel addPersonnel(Personnel personnel);
	void deletePersonnel(String idPersonnel);
	Personnel updatePersonnel(Personnel personnel);
	Optional<Personnel> retrievePersonnel(String idPersonnel);
}
