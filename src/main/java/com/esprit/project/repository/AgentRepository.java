package com.esprit.project.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.esprit.project.entity.Agent;

@Repository
public interface AgentRepository extends JpaRepository<Agent, Long>{

}
