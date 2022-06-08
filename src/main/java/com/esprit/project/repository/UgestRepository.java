package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Ugest;

@Repository
public interface UgestRepository extends JpaRepository<Ugest,Long> {
}
