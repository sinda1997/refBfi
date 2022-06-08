package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.ClientProfessionnel;


@Repository
public interface ClientProfessionnelRepository extends JpaRepository<ClientProfessionnel, Long>{

}
