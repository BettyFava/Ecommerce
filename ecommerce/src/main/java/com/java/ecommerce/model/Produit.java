package com.java.ecommerce.model;

public class Produit {
	private Integer id;
	private String nom;
	private float prix;
	private String description;

	public String toString() {
		return "Produit[ nomProduit = " + nom + ", idProduit = " + id + ", prixUnitaireProduit = " + prix
				+ ", descriptionProduit = " + description + " ]";
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer idProduit) {
		this.id = idProduit;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nomProduit) {
		this.nom = nomProduit;
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(float prixUnitaireProduit) {
		this.prix = prixUnitaireProduit;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String descriptionProduit) {
		this.description = descriptionProduit;
	}



}
