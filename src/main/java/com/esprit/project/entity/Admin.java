package com.esprit.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="ADMIN")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Admin implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	//@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "IDADMIN", unique = true, nullable = false)
	private Long idAdmin;
	@Column(name = "LOGIN", nullable = false)
	private String login;
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	@Column(name = "DATENAISS")
	private Date dateNaiss;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "NUMTELPH")
	private String numTelph;
	
	
	public Long getIdAdmin() {
		return idAdmin;
	}
	
	public void setIdAdmin(Long idAdmin) {
		this.idAdmin = idAdmin;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaiss() {
		return dateNaiss;
	}
	public void setDateNaiss(Date dateNaiss) {
		this.dateNaiss = dateNaiss;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumTelph() {
		return numTelph;
	}
	public void setNumTelph(String numTelph) {
		this.numTelph = numTelph;
	}
	
	

	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(Long idAdmin, String login, String password, String nom, String prenom, Date dateNaiss, String adresse,
			String email, String numTelph) {
		super();
		this.idAdmin = idAdmin;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.adresse = adresse;
		this.email = email;
		this.numTelph = numTelph;
	}

	
	
	
	
}
