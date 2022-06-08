package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import com.esprit.project.entity.Admin;

public interface AdminService {

	List<Admin> retrieveAllAdmins();
	Admin addAdmin(Admin admin);
	void deleteAdmin(String idAdmin);
	Admin updateAdmin(Admin admin);
	Optional<Admin> retrieveAdmin(String idAdmin);
}
