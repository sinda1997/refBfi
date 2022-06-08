package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.ClientParticulier;


@Repository
public interface ClientParticulierRepository extends JpaRepository<ClientParticulier, Long>{

}
