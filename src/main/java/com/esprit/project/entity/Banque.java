package com.esprit.project.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="BANQUE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Banque implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "IDBANQUE", unique = true, nullable = false)
	private Long idBanque;
	@Column(name = "NOMBANQUE")
	private String NomBanque;
	@Column(name = "ADRESSE")
	private String adresse;
	
	@ManyToMany(mappedBy = "agences")
	private List<Client> clients;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idAgence")
	private Agence agence;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idCharge")
	private ChargeClientele chargeClientele;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idBoc")
	private BackOfficeCredit backOfficeCredit;
	
	public Long getIdBanque() {
		return idBanque;
	}

	public void setIdBanque(Long idBanque) {
		this.idBanque = idBanque;
	}

	public String getNomBanque() {
		return NomBanque;
	}

	public void setNomBanque(String nomBanque) {
		NomBanque = nomBanque;
	}

	public String getAdresse() {
		return adresse;
	}

	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

	public List<Client> getClients() {
		return clients;
	}

	public void setClients(List<Client> clients) {
		this.clients = clients;
	}

	public Agence getAgence() {
		return agence;
	}

	public void setAgence(Agence agence) {
		this.agence = agence;
	}

	@Override
	public String toString() {
		return "Banque [idBanque=" + idBanque + ", NomBanque=" + NomBanque + ", adresse=" + adresse + ", clients="
				+ clients + ", agence=" + agence + "]";
	}

	public Banque(Long idBanque, String nomBanque, String adresse, List<Client> clients, Agence agence) {
		super();
		this.idBanque = idBanque;
		NomBanque = nomBanque;
		this.adresse = adresse;
		this.clients = clients;
		this.agence = agence;
	}

	public Banque() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
}
