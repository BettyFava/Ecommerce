package com.java.ecommerce.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.ecommerce.model.Produit;

public interface ProduitMapper {
	public void insertProduit(@Param("produit") Produit produit);

	public Produit getProduitById(@Param("id") Integer id);
	
	public Produit getInformationsSuppProduit(@Param("id")Integer id);

	public List<Produit> getAllProduits();
	
	public List<Produit> getProduitsParSousCategories(@Param("idSousCat") Integer idSousCat);

}
