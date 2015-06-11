package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Commande;

public interface CommandeMapper {

	public void insertCommande(Commande commande);
	
	
	public List<Commande> getCommandesByClient(String emailClient);
	

	
}
