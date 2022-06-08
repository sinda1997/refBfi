/*package com.esprit.project.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


/*@Entity
@Table(name="DEVISE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Devise implements Serializable{
	
	@Id
	@Column(name = "IDENTIFIER", unique = true, nullable = false)
	private long Identifier;
	/*@Column(name = "DECIMAL")
	private double Decimal;*/
	/*@Column(name = "DECIMALNAME")
	private String DecimalName;
	@Column(name = "NAME")
	private String Name;
	
	
	public long getIdentifier() {
		return Identifier;
	}


	public void setIdentifier(Long identifier) {
		Identifier = identifier;
	}


	/*public double getDecimal() {
		return Decimal;
	}


	public void setDecimal(double decimal) {
		Decimal = decimal;
	}*/

/*
	public String getDecimalName() {
		return DecimalName;
	}


	public void setDecimalName(String decimalName) {
		DecimalName = decimalName;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}
	@OneToMany(mappedBy="devise")
	private List<PrixDevise> prixDevises;

	@ManyToOne
	@JoinTable(
			name= "devisecompte",
			joinColumns = @JoinColumn(name = "Identifier"),
			inverseJoinColumns = @JoinColumn(name= "NumCompte", nullable=false)
			)
	private CompteDevise compteDevise;


	public Devise(Long identifier, /*double decimal,*/ /*String decimalName, String name, List<PrixDevise> prixDevises,
			CompteDevise compteDevise) {
		super();
		Identifier = identifier;
		//Decimal = decimal;
		DecimalName = decimalName;
		Name = name;
		this.prixDevises = prixDevises;
		this.compteDevise = compteDevise;
	}



	@Override
	public String toString() {
		return "Devise [Identifier=" + Identifier + ", DecimalName=" + DecimalName + ", Name=" + Name + ", prixDevises="
				+ prixDevises + ", compteDevise=" + compteDevise + "]";
	}


	public Devise() {
		super();
		// TODO Auto-generated constructor stub
	}

	
}*/
