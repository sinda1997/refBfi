package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Banque;

@Repository
public interface BanqueRepository  extends JpaRepository<Banque, Long>{

}
