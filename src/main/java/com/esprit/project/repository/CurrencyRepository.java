package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Currency;


@Repository
public interface CurrencyRepository extends JpaRepository<Currency,Long> {
}
