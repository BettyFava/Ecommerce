package com.java.ecommerce.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.junit.runners.Parameterized.Parameters;

import com.java.ecommerce.model.Panier;
import com.java.ecommerce.model.Produit;

public interface PanierMapper {
	
	public void createCart(String emailClient, String login);
	
	public Panier getPanierById(Integer id);
	
	public List<Produit> getAllProduits(Panier panier);
	
	public List<Produit> getAllProduits(Integer IdPanier);
	
	public void insertProduit(@Param("idProduit") Integer idproduit,@Param("idCommande") Integer idCommande, @Param("quantite")Integer quantite);
	
	public void removeProduit(Produit produit);
	
	public void removeProduit(@Param("idCommande") Integer idCommande,@Param("idProduit") Integer idProduit ); //ok

	public float calculatePrice(Panier idPanier);

}
