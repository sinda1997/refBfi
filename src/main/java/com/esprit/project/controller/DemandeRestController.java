package com.esprit.project.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.esprit.project.entity.Demande;
import com.esprit.project.playload.response.MessageResponse;
import com.esprit.project.service.DemandeService;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@CrossOrigin(origins = "*") 
public class DemandeRestController {

	@Autowired
	DemandeService demandeService;
	
	//http://localhost:8094/demande
	@GetMapping("/demande")
	@ResponseBody
	public List<Demande> retrieveAllDemandes() {
	List<Demande> Demande = demandeService.retrieveAllDemandes();
	return Demande;
	}
	
	//http://localhost:8094/demande/{NumDemande}
	@GetMapping("/demande/{NumDemande}")
	@ResponseBody
	public Optional<Demande> retrieveDemande(@PathVariable("NumDemande") String id) {
	return demandeService.retrieveDemande(id);
	}
			
	//http://localhost:8094/demande
	@PostMapping("/demande")
	@ResponseBody
	public Demande addDemande(@RequestBody Demande D) {
	Demande demandes = demandeService.addDemande(D);
	return demandes;
	}
	/*@PostMapping("/demande")
	@ResponseBody
	public ResponseEntity addDemande(@RequestParam("demande") String demande1, @RequestParam("client") Long idClient) {
		String message = ""; 
        Demande addDemande = new Demande();
        try {          
          
          addDemande = new ObjectMapper().readValue(demande1, Demande.class);
          
          demandeService.store(addDemande, idClient); 
          
          message = "Uploaded demande successfully: ";
      
          return ResponseEntity.status(HttpStatus.OK).body(message);
      
      } catch (Exception e) { e.printStackTrace(); 
          message = "Could not upload the demande!"; 
            return ResponseEntity.status(HttpStatus.EXPECTATION_FAILED).body(new MessageResponse(message)); }

	}*/

	//http://localhost:8094/demande/{NumDemande}
	@DeleteMapping("/demande/{NumDemande}")
	@ResponseBody
	public void deleteDemande(@PathVariable("NumDemande") String id) {
		demandeService.deleteDemande(id);
	}
			
	//http://localhost:8094/demande
	@PutMapping("/demande")
	@ResponseBody
	public Demande updateDemande(@RequestBody Demande demande) {
	return demandeService.updateDemande(demande);
	}
	
	//http://localhost:8094/demande
	//@PutMapping("/affectdemandeclient/{numDemande}/{idClient}")
	//@ResponseBody
	/*public void affecterDemandeAClient(@PathVariable("numDemande")long numDemande,@PathVariable("idClient") long idClient){
		demandeService.affecterDemandeAClient(numDemande, idClient);
	}*/
}
