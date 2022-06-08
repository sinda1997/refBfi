package com.esprit.project.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="COUNTRY")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Country implements Serializable{
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "IDCOUNTRY", unique = true, nullable = false)
	private long idCountry;
	
	@Column(name = "AREAPHONECODE", unique = true, nullable = false)
	private long AreaPhoneCode;
	
	@Column(name = "NAME", unique = true, nullable = false)
	private String Name;
	
	@Column(name = "NATIONALITY", unique = true, nullable = false)
	private String Nationality;

	
	public long getAreaPhoneCode() {
		return AreaPhoneCode;
	}

	public void setAreaPhoneCode(long areaPhoneCode) {
		AreaPhoneCode = areaPhoneCode;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public long getIdCountry() {
		return idCountry;
	}

	public void setIdCountry(long idCountry) {
		this.idCountry = idCountry;
	}
	
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "idClient")
	private Client client;


	public Country(long idCountry, long areaPhoneCode, String name, String nationality, Client client) {
		super();
		this.idCountry = idCountry;
		AreaPhoneCode = areaPhoneCode;
		Name = name;
		Nationality = nationality;
		this.client = client;
	}
	
	
	
	

}
