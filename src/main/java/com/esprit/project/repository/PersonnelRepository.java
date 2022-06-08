package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Personnel;

@Repository
public interface PersonnelRepository extends JpaRepository<Personnel, Long>{

}
