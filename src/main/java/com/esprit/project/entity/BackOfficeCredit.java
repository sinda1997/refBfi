package com.esprit.project.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="BACKOFFICECREDIT")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BackOfficeCredit implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "IDBOC", unique = true, nullable = false)
	private Long idBoc;
	@Column(name = "LOGIN", nullable = false)
	private String login;
	@Column(name = "PASSWORD", nullable = false)
	private String password;
	@Column(name = "NOM")
	private String nom;
	@Column(name = "PRENOM")
	private String prenom;
	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name = "idBoc")
	private List<Banque> banque;

	public Long getIdBoc() {
		return idBoc;
	}

	public void setIdBoc(Long idBoc) {
		this.idBoc = idBoc;
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

	public List<Banque> getBanque() {
		return banque;
	}

	public void setBanque(List<Banque> banque) {
		this.banque = banque;
	}

	@Override
	public String toString() {
		return "BackOfficeCredit [idBoc=" + idBoc + ", login=" + login + ", password=" + password + ", nom=" + nom
				+ ", prenom=" + prenom + ", banque=" + banque + "]";
	}

	public BackOfficeCredit(Long idBoc, String login, String password, String nom, String prenom, List<Banque> banque) {
		super();
		this.idBoc = idBoc;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.banque = banque;
	}

	public BackOfficeCredit() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
