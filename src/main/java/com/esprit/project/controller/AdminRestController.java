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

import com.esprit.project.entity.Admin;
import com.esprit.project.service.AdminService;

@RestController
@CrossOrigin(origins = "*") 
public class AdminRestController {
	
	
	@Autowired
	AdminService adminService;
	
	//http://localhost:8082/retrieve-all-admins
	@GetMapping("/retrieveAllAdmins")
	@ResponseBody
	public List<Admin> getAdmins() {
	List<Admin> Admin = adminService.retrieveAllAdmins();
	return Admin;
	}
	
	//http://localhost:8082/retrieve-admins/{idAdmin}
	@GetMapping("/retrieve-admins/{idAdmin}")
	@ResponseBody
	public Optional<Admin> retrieveUser(@PathVariable("idAdmin") String id) {
	return adminService.retrieveAdmin(id);
	}
	
	//http://localhost:8082/add-admin
	@PostMapping("/add-admin")
	@ResponseBody
	public Admin addAdmin(@RequestBody Admin A) {
	Admin admins = adminService.addAdmin(A);
	return admins;
	}
	
	//http://localhost:8082/remove-admin/{idAdmin}
	@DeleteMapping("/remove-admin/{idAdmin}")
	@ResponseBody
	public void deleteAdmin(@PathVariable("idAdmin") String id) {
	adminService.deleteAdmin(id);
	}
	
	//http://localhost:8082/update-admin
	@PutMapping("/update-admin")
	@ResponseBody
	public Admin updateAdmin(@RequestBody Admin admin) {
	return adminService.updateAdmin(admin);
	}
}
