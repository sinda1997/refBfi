package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.CurrencyPrice;

@Repository
public interface CurrencyPriceRepository extends JpaRepository<CurrencyPrice,Long> {
}
