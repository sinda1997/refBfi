package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.Agent;

public interface AgentService {

	List<Agent> retrieveAllAgents();
	Agent addAgent(Agent agent);
	void deleteAgent(String idAgent);
	Agent updateAgent(Agent agent);
	Optional<Agent> retrieveAgent(String idAgent);
}
