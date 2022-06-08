package com.esprit.project.entity;

import java.io.Serializable;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name= "DEMANDE")
public class Demande implements Serializable{
	private static final long serialVersionUID = 1L;

	@Id
	//@GeneratedValue(strategy = GenerationType.IDENTITY)
	//@Column(name = "NumDemande", unique = true, nullable = false)
	private Long numDemande;
	/*@Column(name = "IdClient")
	private String idClient;*/
	@Column(name = "BESOIN")
	private String besoin;
	@Column(name = "Montant")
	private Long montant;
	@Column(name = "DUREE")
	private Long duree;
	@Column(name = "ANNUITEMAXIMALE")
	private Long annuiteMaximale;
	
	
	/*public String getIdClient() {
		return idClient;
	}
	public void setIdClient(String idClient) {
		this.idClient = idClient;
	}*/
	public String getBesoin() {
		return besoin;
	}
	public void setBesoin(String besoin) {
		this.besoin = besoin;
	}
	public Long getMontant() {
		return montant;
	}
	public void setMontant(Long montant) {
		this.montant = montant;
	}
	public Long getDuree() {
		return duree;
	}
	public void setDuree(Long duree) {
		this.duree = duree;
	}
	public Long getAnnuiteMaximale() {
		return annuiteMaximale;
	}
	public void setAnnuiteMaximale(Long annuiteMaximale) {
		this.annuiteMaximale = annuiteMaximale;
	}
	
	
	
	/*@ManyToOne
	@JoinTable(name = "demande_client",
			joinColumns = @JoinColumn(name = "numDemande"),
            inverseJoinColumns = @JoinColumn(name = "idClient"))
	private Client client;*/
	/*@ManyToOne
	@JoinColumn(name= "idClient", nullable=false)
	private Client client;*/
	
	public Long getNumDemande() {
		return numDemande;
	}
	public void setNumDemande(Long numDemande) {
		this.numDemande = numDemande;
	}
	
	public Demande() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@ManyToOne
	@JoinColumn(name = "id_Client")
	private Client client;
	
	
	public Demande(Long numDemande, String besoin, Long montant, Long duree, Long annuiteMaximale, Client client) {
		super();
		this.numDemande = numDemande;
		this.besoin = besoin;
		this.montant = montant;
		this.duree = duree;
		this.annuiteMaximale = annuiteMaximale;
		this.client = client;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	@Override
	public String toString() {
		return "Demande [numDemande=" + numDemande + ", besoin=" + besoin + ", montant=" + montant + ", duree=" + duree
				+ ", annuiteMaximale=" + annuiteMaximale + ", client=" + client + "]";
	}
	
	
	
	
}
