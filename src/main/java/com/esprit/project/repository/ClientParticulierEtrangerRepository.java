package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.ClientParticulierEtranger;


@Repository
public interface ClientParticulierEtrangerRepository extends JpaRepository<ClientParticulierEtranger, Long>{

}
