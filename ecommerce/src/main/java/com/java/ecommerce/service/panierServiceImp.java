package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.Panier;
import com.java.ecommerce.model.Produit;

public class PanierServiceImp implements PanierService {

	@Override
	public void createCart(String emailClient, String login) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Panier getPanierById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Produit> getAllProduits(Panier panier) {
		return getAllProduits(panier.getIdProduit());
	}

	@Override
	public List<Produit> getAllProduits(Integer IdPanier) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertProduit(Produit produit, int quantite) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduit(Produit produit) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeProduit(int produitId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public float calculatePrice(Panier idPanier) {
		// TODO Auto-generated method stub
		return 0;
	}

	
}
