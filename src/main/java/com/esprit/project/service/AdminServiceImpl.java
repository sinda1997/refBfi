package com.esprit.project.service;

import java.util.List;
import java.util.Optional;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esprit.project.entity.Admin;
import com.esprit.project.repository.AdminRepository;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	private AdminRepository adminRepository;
	
	private static final Logger l = LogManager.getLogger(AdminService.class);

	@Override
	public List<Admin> retrieveAllAdmins() {
//		List<Admin> admins = (List<Admin>) adminRepository.findAll();
//		for (Admin admin : admins){
//			l.info("Admin :" + admin);
//		}
		return adminRepository.findAll();
	}

	@Override
	public Admin addAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public void deleteAdmin(String idAdmin) {
		long id = Long.parseLong(idAdmin);
		adminRepository.deleteById(id);
		
	}

	@Override
	public Admin updateAdmin(Admin admin) {
		return adminRepository.save(admin);
	}

	@Override
	public Optional<Admin> retrieveAdmin(String idAdmin) {
		Optional<Admin> admin = adminRepository.findById(Long.parseLong(idAdmin));
		l.info("Admin :" + admin);
		return admin;
	}

}
