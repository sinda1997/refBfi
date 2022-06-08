package com.esprit.project.entity;

import java.io.Serializable;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString

public class Currency implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String cc;
    private String symbol;
    private String name;

    public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCc() {
		return cc;
	}
	public void setCc(String cc) {
		this.cc = cc;
	}
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Collection<Compte> getComptes() {
		return comptes;
	}
	public void setComptes(Collection<Compte> comptes) {
		this.comptes = comptes;
	}
	public CurrencyPrice getDeviseAchat() {
		return deviseAchat;
	}
	public void setDeviseAchat(CurrencyPrice deviseAchat) {
		this.deviseAchat = deviseAchat;
	}
	public CurrencyPrice getDeviseVente() {
		return deviseVente;
	}
	public void setDeviseVente(CurrencyPrice deviseVente) {
		this.deviseVente = deviseVente;
	}
	@OneToMany(mappedBy = "currency")
    private Collection<Compte> comptes;
    @ManyToOne
    private CrossParity crossParity;
    @ManyToOne
    private CurrencyPrice deviseAchat;
    @ManyToOne
    private CurrencyPrice deviseVente;

	public Currency(Long id, String cc, String symbol, String name, Collection<Compte> comptes,
			CurrencyPrice deviseAchat, CurrencyPrice deviseVente) {
		super();
		this.id = id;
		this.cc = cc;
		this.symbol = symbol;
		this.name = name;
		this.comptes = comptes;
		this.deviseAchat = deviseAchat;
		this.deviseVente = deviseVente;
	}
	@Override
	public String toString() {
		return "Currency [id=" + id + ", cc=" + cc + ", symbol=" + symbol + ", name=" + name + ", comptes=" + comptes
				+ ", deviseAchat=" + deviseAchat + ", deviseVente=" + deviseVente + "]";
	}
	public Currency() {
		super();
		// TODO Auto-generated constructor stub
	}



}