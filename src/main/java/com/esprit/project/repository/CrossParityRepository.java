package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.CrossParity;

@Repository
public interface CrossParityRepository extends JpaRepository<CrossParity,Long> {
}
