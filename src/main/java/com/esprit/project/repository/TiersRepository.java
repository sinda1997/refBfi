package com.esprit.project.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Tiers;

import java.util.List;

@Repository
public interface TiersRepository extends JpaRepository<Tiers,Long> {
    List<Tiers> findByNomContains (String nom);

}
