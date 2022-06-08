package com.esprit.project.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import java.util.Collection;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CurrencyPrice implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date priceDate;
    private Long buyPrice;
    private Long sellPrice;
    private boolean statut;
    private Long fourchette;
    private String commen;
    private Long envoi;
    
    
    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public Date getPriceDate() {
		return priceDate;
	}
	public void setPriceDate(Date priceDate) {
		this.priceDate = priceDate;
	}
	public Long getBuyPrice() {
		return buyPrice;
	}
	public void setBuyPrice(Long buyPrice) {
		this.buyPrice = buyPrice;
	}
	public Long getSellPrice() {
		return sellPrice;
	}
	public void setSellPrice(Long sellPrice) {
		this.sellPrice = sellPrice;
	}
	public boolean isStatut() {
		return statut;
	}
	public void setStatut(boolean statut) {
		this.statut = statut;
	}
	public Long getFourchette() {
		return fourchette;
	}
	public void setFourchette(Long fourchette) {
		this.fourchette = fourchette;
	}
	public String getCommen() {
		return commen;
	}
	public void setCommen(String commen) {
		this.commen = commen;
	}
	public Long getEnvoi() {
		return envoi;
	}
	public void setEnvoi(Long envoi) {
		this.envoi = envoi;
	}
	public Collection<Currency> getCurrencies() {
		return currencies;
	}
	public void setCurrencies(Collection<Currency> currencies) {
		this.currencies = currencies;
	}
	public Collection<Currency> getDevises() {
		return devises;
	}
	public void setDevises(Collection<Currency> devises) {
		this.devises = devises;
	}
	@OneToMany(mappedBy = "deviseAchat")
    private Collection<Currency>currencies;
    @OneToMany(mappedBy = "deviseVente")
    private Collection<Currency>devises;


	public CurrencyPrice(Long id, Date priceDate, Long buyPrice, Long sellPrice, boolean statut, Long fourchette,
			String commen, Long envoi, Collection<Currency> currencies, Collection<Currency> devises) {
		super();
		this.id = id;
		this.priceDate = priceDate;
		this.buyPrice = buyPrice;
		this.sellPrice = sellPrice;
		this.statut = statut;
		this.fourchette = fourchette;
		this.commen = commen;
		this.envoi = envoi;
		this.currencies = currencies;
		this.devises = devises;
	}
	@Override
	public String toString() {
		return "CurrencyPrice [id=" + id + ", priceDate=" + priceDate + ", buyPrice=" + buyPrice + ", sellPrice="
				+ sellPrice + ", statut=" + statut + ", fourchette=" + fourchette + ", commen=" + commen + ", envoi="
				+ envoi + ", currencies=" + currencies + ", devises=" + devises + "]";
	}
	public CurrencyPrice() {
		super();
		// TODO Auto-generated constructor stub
	}


}
