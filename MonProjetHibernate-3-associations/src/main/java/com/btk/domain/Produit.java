package com.btk.domain;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "produits")
public class Produit {

	@Id
	private String id;

	private String noml;
	private BigDecimal prixUnitaire;

	@ManyToOne
	private Categorie categorie;
	
	@ManyToMany(mappedBy="produits")
	private List<Fournisseur> fournisseurs;

	public List<Fournisseur> getFournisseurs() {
		return fournisseurs;
	}

	public void setFournisseurs(List<Fournisseur> fournisseurs) {
		this.fournisseurs = fournisseurs;
	}

	public Produit() {
		// TODO Auto-generated constructor stub
	}

	public Produit(String id, String noml, BigDecimal prixUnitaire, Categorie categorie) {
		super();
		this.id = id;
		this.noml = noml;
		this.prixUnitaire = prixUnitaire;
		this.categorie = categorie;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNoml() {
		return noml;
	}

	public void setNoml(String noml) {
		this.noml = noml;
	}

	public BigDecimal getPrixUnitaire() {
		return prixUnitaire;
	}

	public void setPrixUnitaire(BigDecimal prixUnitaire) {
		this.prixUnitaire = prixUnitaire;
	}

	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

}
