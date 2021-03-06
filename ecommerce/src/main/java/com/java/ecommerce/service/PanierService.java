package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.Panier;
import com.java.ecommerce.model.Produit;

public interface PanierService {
	
	public void createCart(String emailClient, String login);
	
	public Panier getPanierById(Integer id);
	
	public List<Produit> getAllProduits(Panier panier);
	
	public List<Produit> getAllProduits(Integer IdPanier);
	
	public void insertProduit(Produit produit,int quantite);
	
	public void removeProduit(Produit produit);
	
	public void removeProduit(int produitId);

	public float calculatePrice(Panier idPanier);
	
}
