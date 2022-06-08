package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Country;

@Repository
public interface CountryRepository extends JpaRepository<Country,Long> {
}
