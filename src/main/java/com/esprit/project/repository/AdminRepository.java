package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long>{

}
