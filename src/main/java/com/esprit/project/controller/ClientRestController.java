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

import com.esprit.project.entity.Client;
import com.esprit.project.repository.ClientRepository;
import com.esprit.project.service.ClientService;

@RestController
@CrossOrigin(origins = "*")
public class ClientRestController {
	
	@Autowired
	ClientRepository clientRepository;
	
	@Autowired
	ClientService clientService;
	
	//http://localhost:8094/client
		@GetMapping("/client")
		@ResponseBody
		public List<Client> retrieveAllClients() {
		List<Client> Client = clientService.retrieveAllClients();
		return Client;
		}
		
		//http://localhost:8094/client/{idClient}
		@GetMapping("/client/{idClient}")
		@ResponseBody
		public Optional<Client> retrieveClient(@PathVariable("idClient") String id) {
		return clientService.retrieveClient(id);
		}
		
		//http://localhost:8094/client
		@PostMapping("/client")
		@ResponseBody
		public Client addClient(@RequestBody Client C) {
		Client clients = clientService.addClient(C);
		return clients;
		}
		
		//http://localhost:8094/client/{idClient}
		@DeleteMapping("/client/{idClient}")
		@ResponseBody
		public void deleteClient(@PathVariable("idClient") String id) {
		clientService.deleteClient(id);
		}
		
		//http://localhost:8094/client
		@PutMapping("/client")
		@ResponseBody
		public Client updateClient(@RequestBody Client client) {
		return clientService.updateClient(client);
		}

}
