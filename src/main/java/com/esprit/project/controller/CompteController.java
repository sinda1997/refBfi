package com.esprit.project.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.esprit.project.entity.Admin;
import com.esprit.project.entity.Compte;
import com.esprit.project.repository.CompteRepository;
import com.esprit.project.service.CompteService;

import java.util.List;

@RestController 
@CrossOrigin(origins = "*")
public class CompteController {
    @Autowired
    CompteService compteService;
    @Autowired
    CompteRepository compteRepository;

    @PostMapping("/Compte")
    @ResponseBody
    public Compte addCompte(@RequestBody Compte compte){
        return compteService.addCompte(compte);
    }

    @GetMapping("/Compte")
    @ResponseBody
    public List<Compte> listComptes(){
    	List<Compte> Compte = compteService.listComptes();
        return Compte;
    }

    @DeleteMapping("/Compte")
    @ResponseBody
    public void deleteCompte(@PathVariable("id") Long id ){
    }

    @DeleteMapping("/Compte/{id}")
    @ResponseBody
    public void deleteCompteById(@PathVariable("id") Long id){
        compteRepository.deleteById(id);

    }
    @PutMapping("/Compte")
    @ResponseBody
    public Compte updateCompte(@RequestBody Compte compte){
        return compteService.updateCompte(compte);
    }

}
