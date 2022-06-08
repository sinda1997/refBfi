package com.esprit.project.entity;

import java.io.Serializable;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@DiscriminatorValue("PER")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Personnel extends Client{

	//@Id
	//@GeneratedValue (strategy = GenerationType.IDENTITY)
	//@Column(name = "IDPERSONNEL", unique = true, nullable = false)
	private long idPersonnel;

	public long getIdPersonnel() {
		return idPersonnel;
	}

	public void setIdPersonnel(long idPersonnel) {
		this.idPersonnel = idPersonnel;
	}

	public Personnel(long idPersonnel) {
		super();
		this.idPersonnel = idPersonnel;
	}

	public Personnel() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Personnel [idPersonnel=" + idPersonnel + "]";
	}
	
	
	
	
	
}
