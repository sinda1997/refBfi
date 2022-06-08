package com.esprit.project.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PET")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientParticulierEtranger extends Client{
	
	
	//@Id
	private int Cin;
	private int Num_Passport;
	private int Carte_Sejour;
	
	public int getNum_Passport() {
		return Num_Passport;
	}
	public void setNum_Passport(int num_Passport) {
		Num_Passport = num_Passport;
	}
	public int getCarte_Sejour() {
		return Carte_Sejour;
	}
	public void setCarte_Sejour(int carte_Sejour) {
		Carte_Sejour = carte_Sejour;
	}
	public int getCin() {
		return Cin;
	}
	public void setCin(int cin) {
		Cin = cin;
	}
	

}
