package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Agent;
import com.esprit.project.repository.AgentRepository;

@Service
public class AgentServiceImpl implements AgentService{

	@Autowired
	private AgentRepository agentRepository;
	
	private static final Logger l = LogManager.getLogger(AdminServiceImpl.class);
	
	@Override
	public List<Agent> retrieveAllAgents() {
		/*List<Agent> agents = (List<Agent>) agentRepository.findAll();
		for (Agent agent : agents){
			l.info("Agent :" + agent);
		}*/
		return agentRepository.findAll();
	}

	@Override
	public Agent addAgent(Agent agent) {
		return agentRepository.save(agent);
	}

	@Override
	public void deleteAgent(String idAgent) {
		long id = Long.parseLong(idAgent);
		agentRepository.deleteById(id);
		
	}

	@Override
	public Agent updateAgent(Agent agent) {
		return agentRepository.save(agent);
	}

	@Override
	public Optional<Agent> retrieveAgent(String idAgent) {
		Optional<Agent> agent = agentRepository.findById(Long.parseLong(idAgent));
		l.info("Agent :" + agent);
		return agent;
	}

}
