/*package com.esprit.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="PRIXDEVISE")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class PrixDevise implements Serializable{
	
	@Id
	@Column(name = "BUYPRICE")
	private long BuyPrice;
	@Column(name = "PRICEDATE")
	private Date PriceDate;
	@Column(name = "SELLPRICE")
	private long SellPrice;
	@Column(name = "STATUS")
	private Boolean Status;
	public long getBuyPrice() {
		return BuyPrice;
	}
	public void setBuyPrice(long buyPrice) {
		BuyPrice = buyPrice;
	}
	public Date getPriceDate() {
		return PriceDate;
	}
	public void setPriceDate(Date priceDate) {
		PriceDate = priceDate;
	}
	public long getSellPrice() {
		return SellPrice;
	}
	public void setSellPrice(long sellPrice) {
		SellPrice = sellPrice;
	}
	public Boolean getStatus() {
		return Status;
	}
	public void setStatus(Boolean status) {
		Status = status;
	}
	
	@ManyToOne
	@JoinTable(
			name= "infoDevise",
			joinColumns = @JoinColumn(name = "Iddevise"),
			inverseJoinColumns = @JoinColumn(name= "PriceDate", nullable=false)
			)
	private Devise devise;
	
	
}*/
