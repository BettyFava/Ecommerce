package com.java.ecommerce.service;

import java.util.List;

import com.java.ecommerce.model.Commande;

public interface CommandeService {
	
	public void insertCommande(Commande commande);
	
	
	public List<Commande> getCommandesByClient(String emailClient);
	
}
