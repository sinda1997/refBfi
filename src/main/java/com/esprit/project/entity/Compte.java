package com.esprit.project.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import org.springframework.web.bind.annotation.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="COMPTE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Compte implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numCpt;
    private String description;
    private String rib;
    private double soldeComptable;
    private double soldeDisponible;
    private boolean cloture;
    //private Date dateCloture;

    
    
    @ManyToOne
    private Banque banque;
    @ManyToOne
    private Tiers tiers;
    @ManyToOne
    Currency currency;
    /*@OneToMany(mappedBy = "compte")
    private Collection<Currency> currencies;*/
    @ManyToOne
    private Ugest ugest;



	public Long getId() {
		return id;
	}



	public void setId(Long id) {
		this.id = id;
	}



	public String getNumCpt() {
		return numCpt;
	}



	public void setNumCpt(String numCpt) {
		this.numCpt = numCpt;
	}



	public String getDescription() {
		return description;
	}



	public void setDescription(String description) {
		this.description = description;
	}



	public String getRib() {
		return rib;
	}



	public void setRib(String rib) {
		this.rib = rib;
	}



	public double getSoldeComptable() {
		return soldeComptable;
	}



	public void setSoldeComptable(double soldeComptable) {
		this.soldeComptable = soldeComptable;
	}



	public double getSoldeDisponible() {
		return soldeDisponible;
	}



	public void setSoldeDisponible(double soldeDisponible) {
		this.soldeDisponible = soldeDisponible;
	}



	public boolean isCloture() {
		return cloture;
	}



	/*@Override
	public String toString() {
		return "Compte [id=" + id + ", numCpt=" + numCpt + ", description=" + description + ", rib=" + rib
				+ ", soldeComptable=" + soldeComptable + ", soldeDisponible=" + soldeDisponible + ", cloture=" + cloture
				+ ", currency=" + currency + "]";
	}



	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Compte(Long id, String numCpt, String description, String rib, double soldeComptable, double soldeDisponible,
			boolean cloture, Currency currency) {
		super();
		this.id = id;
		this.numCpt = numCpt;
		this.description = description;
		this.rib = rib;
		this.soldeComptable = soldeComptable;
		this.soldeDisponible = soldeDisponible;
		this.cloture = cloture;
		this.currency = currency;
	}*/



	public void setCloture(boolean cloture) {
		this.cloture = cloture;
	}



	public Compte() {
		super();
		// TODO Auto-generated constructor stub
	}



	public Compte(Long id, String numCpt, String description, String rib, double soldeComptable, double soldeDisponible,
			boolean cloture, Banque banque, Tiers tiers, Currency currency,
			Ugest ugest) {
		super();
		this.id = id;
		this.numCpt = numCpt;
		this.description = description;
		this.rib = rib;
		this.soldeComptable = soldeComptable;
		this.soldeDisponible = soldeDisponible;
		this.cloture = cloture;
		this.banque = banque;
		this.tiers = tiers;
		this.currency = currency;
		this.ugest = ugest;
	}



	@Override
	public String toString() {
		return "Compte [id=" + id + ", numCpt=" + numCpt + ", description=" + description + ", rib=" + rib
				+ ", soldeComptable=" + soldeComptable + ", soldeDisponible=" + soldeDisponible + ", cloture=" + cloture
				+ ", banque=" + banque + ", tiers=" + tiers + ", currency=" + currency + ", ugest=" + ugest + "]";
	}



	public Currency getCurrency() {
		return currency;
	}



	public void setCurrency(Currency currency) {
		this.currency = currency;
	}
}
