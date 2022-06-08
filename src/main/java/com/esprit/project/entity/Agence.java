package com.esprit.project.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="AGENCE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Agence implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "IDAGENCE", unique = true, nullable = false)
	private Long idAgence;
	@Column(name = "NOMAGENCE")
	private String NomAgence;
	@Column(name = "ADRESSE")
	private String adresse;
	
	
	@ManyToMany(mappedBy = "agences")
	private List<Client> clients;
	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name = "idAgence")
	private List<Banque> banque;

	public Long getIdAgence() {
		return idAgence;
	}

	public void setIdAgence(Long idAgence) {
		this.idAgence = idAgence;
	}

	public String getNomAgence() {
		return NomAgence;
	}

	public void setNomAgence(String nomAgence) {
		NomAgence = nomAgence;
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

	public List<Banque> getBanque() {
		return banque;
	}

	public void setBanque(List<Banque> banque) {
		this.banque = banque;
	}

	@Override
	public String toString() {
		return "Agence [idAgence=" + idAgence + ", NomAgence=" + NomAgence + ", adresse=" + adresse + ", clients="
				+ clients + ", banque=" + banque + "]";
	}

	public Agence() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Agence(Long idAgence, String nomAgence, String adresse, List<Client> clients, List<Banque> banques) {
		super();
		this.idAgence = idAgence;
		NomAgence = nomAgence;
		this.adresse = adresse;
		this.clients = clients;
		this.banque = banque;
	}
	
	
}
