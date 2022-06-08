package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Agence;

@Repository
public interface AgenceRepository  extends JpaRepository<Agence, Long>{

}
