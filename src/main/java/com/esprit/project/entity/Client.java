package com.esprit.project.entity;

//import java.io.Serializable;
import java.util.Date;
import java.util.List;

//import javax.persistence.FetchType;
//import javax.persistence.CascadeType;
import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;



@Entity
@Table( name = "CLIENT")
@Inheritance(strategy=InheritanceType.JOINED)
//@DiscriminatorColumn(name="type_doc")
/*@Data
@NoArgsConstructor
@AllArgsConstructor*/
public /*abstract*/ class Client{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name = "IDCLIENT", unique = true, nullable = false)
	private Long idClient;
	@Column(name = "SALAIRE", unique = true, nullable = false)
	private long salaire;
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
	/*@Column(name = "TYPE_DOC")
	private String type_doc;*/
	@Column(name = "NUMDOC")
	private String numDoc;
	@Column(name = "ADRESSE")
	private String adresse;
	@Column(name = "EMAIL")
	private String email;
	@Column(name = "NUMTELPH")
	private String numTelph;
	
	@OneToMany(cascade = CascadeType.ALL, fetch= FetchType.LAZY)
	@JoinColumn(name = "idClient")
	private List<Country> country;
	

	public long getSalaire() {
		return salaire;
	}
	public void setSalaire(long salaire) {
		this.salaire = salaire;
	}
	public void setIdClient(long idClient) {
		this.idClient = idClient;
	}
	public Long getIdClient() {
		return idClient;
	}
	public void setIdClient(Long idClient) {
		this.idClient = idClient;
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
	
	public String getNumDoc() {
		return numDoc;
	}
	public void setNumDoc(String numDoc) {
		this.numDoc = numDoc;
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
	
	@ManyToMany
	@JoinTable(
			name="agence_client",
			joinColumns = @JoinColumn(name = "idClient"),
			inverseJoinColumns = @JoinColumn(name= "idAgence")
			)
	private List<Agence> agences;
	
	@ManyToMany
	@JoinTable(
			name="agence_banque",
			joinColumns = @JoinColumn(name = "idClient"),
			inverseJoinColumns = @JoinColumn(name= "idBanque")
			)
	private List<Banque> banques;
	
	@ManyToMany//(mappedBy="Client", fetch=FetchType.LAZY, cascade = CascadeType.ALL)
	@JoinTable(
			name= "compte_client",
			joinColumns = @JoinColumn(name = "idClient"),
			inverseJoinColumns = @JoinColumn(name= "id")
			)
	private List<Compte> comptes;
	

	
	/*@OneToMany(mappedBy="client")
	private List<Demande> demandes;*/
	
	/*@OneToMany(mappedBy="client",cascade=CascadeType.ALL)
	private List<Demande> demande;*/
	@OneToOne
	private Demande demande;
	
	/*public Demande getDemande() {
		return demande;
	}
	public void setDemande(Demande demande) {
		this.demande = demande;
	}*/
	public Client() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", salaire=" + salaire + ", login=" + login + ", password=" + password
				+ ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", numDoc=" + numDoc
				+ ", adresse=" + adresse + ", email=" + email + ", numTelph=" + numTelph + ", country=" + country
				+ ", agences=" + agences + ", banques=" + banques + ", comptes=" + comptes + "]";
	}*/
	public Client(long idClient, long salaire, String login, String password, String nom, String prenom, Date dateNaiss,
			String numDoc, String adresse, String email, String numTelph, List<Country> country, List<Agence> agences,
			List<Banque> banques, List<Compte> comptes) {
		super();
		this.idClient = idClient;
		this.salaire = salaire;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.numDoc = numDoc;
		this.adresse = adresse;
		this.email = email;
		this.numTelph = numTelph;
		this.country = country;
		this.agences = agences;
		this.banques = banques;
		this.comptes = comptes;
	}
	public Client(Long idClient, long salaire, String login, String password, String nom, String prenom, Date dateNaiss,
			String numDoc, String adresse, String email, String numTelph) {
		super();
		this.idClient = idClient;
		this.salaire = salaire;
		this.login = login;
		this.password = password;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaiss = dateNaiss;
		this.numDoc = numDoc;
		this.adresse = adresse;
		this.email = email;
		this.numTelph = numTelph;
	}
	@Override
	public String toString() {
		return "Client [idClient=" + idClient + ", salaire=" + salaire + ", login=" + login + ", password=" + password
				+ ", nom=" + nom + ", prenom=" + prenom + ", dateNaiss=" + dateNaiss + ", numDoc=" + numDoc
				+ ", adresse=" + adresse + ", email=" + email + ", numTelph=" + numTelph + "]";
	}
	
}
