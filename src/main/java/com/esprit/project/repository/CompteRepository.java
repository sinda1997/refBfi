package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Compte;

@Repository
public interface CompteRepository extends JpaRepository<Compte,Long> {
    void deleteCompteById(Long id);
}
