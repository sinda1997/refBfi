package com.esprit.project.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("E")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientEntreprise extends Client{

	//@Id
	private int NumRne;

	public int getNumRne() {
		return NumRne;
	}

	public void setNumRne(int numRne) {
		NumRne = numRne;
	}
	
}
