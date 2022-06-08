package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Demande;

@Repository
public interface DemandeRepository extends CrudRepository<Demande, Long>{

}
