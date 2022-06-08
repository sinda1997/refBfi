package com.esprit.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.project.entity.Agent;
import com.esprit.project.service.AgentService;

@RestController
@CrossOrigin(origins = "*") 
public class AgentRestController {
	
	@Autowired
	AgentService agentService;

	//http://localhost:8082/retrieveAllAgents
	@GetMapping("/retrieveAllAgents")
	@ResponseBody
	public List<Agent> getAgents() {
	List<Agent> Agent = agentService.retrieveAllAgents();
	return Agent;
	}
	
	//http://localhost:8082/retrieve-agents/{idAgent}
	@GetMapping("/retrieve-agents/{idAgent}")
	@ResponseBody
	public Optional<Agent> retrieveUser(@PathVariable("idAgent") String id) {
	return agentService.retrieveAgent(id);
	}
	
	
	//http://localhost:8082/add-agent
	@PostMapping("/add-agent")
	@ResponseBody
	public Agent addAgent(@RequestBody Agent A) {
	Agent agents = agentService.addAgent(A);
	return agents;
	}
	
	//http://localhost:8082/remove-agent/{idAgent}
	@DeleteMapping("/remove-agent/{idAgent}")
	@ResponseBody
	public void deleteAgent(@PathVariable("idAgent") String id) {
	agentService.deleteAgent(id);
	}
	
	//http://localhost:8082/update-agent
	@PutMapping("/update-agent")
	@ResponseBody
	public Agent updateAgent(@RequestBody Agent agent) {
	return agentService.updateAgent(agent);
	}
	
	
}
