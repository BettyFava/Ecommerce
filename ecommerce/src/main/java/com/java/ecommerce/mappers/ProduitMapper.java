package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Produit;

public interface ProduitMapper {
	public void insertProduit(Produit produit);

	public Produit getProduitById(Integer id);
	
	public Produit getInformationsSuppProduit(Integer id);

	public List<Produit> getAllProduits();
	
	public List<Produit> getProduitsParCategories();

	public void updateProduit(Produit produit);
}
