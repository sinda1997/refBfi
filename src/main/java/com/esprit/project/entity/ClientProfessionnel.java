package com.esprit.project.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PRO")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientProfessionnel extends Client{
	
	//@Id
	private int NumPattente;

	public int getNumPattente() {
		return NumPattente;
	}

	public void setNumPattente(int numPattente) {
		NumPattente = numPattente;
	}

}
