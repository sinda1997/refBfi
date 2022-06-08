package com.esprit.project.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/*import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Column;*/
import javax.persistence.DiscriminatorValue;


@Entity
@DiscriminatorValue("P")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ClientParticulier extends Client{
	
	/**
	 * 
	 */
	//private static final long serialVersionUID = 1L;
	/*@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	@Column(name = "ID_CLIENT", unique = true, nullable = false)
	private Long idClient;
	
	public Long getIdClient() {
		return idClient;
	}

	public void setIdClient(Long idClient) {
		this.idClient = idClient;
	}
*/
	//@Id
	private int Cin;

	public int getCin() {
		return Cin;
	}

	public void setCin(int cin) {
		Cin = cin;
	} 
	

}
