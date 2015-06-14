package com.java.ecommerce.mappers;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.java.ecommerce.model.Commande;

public interface CommandeMapper {

	public void insertCommande(Commande commande);
	
	public List<Commande> getCommandesByClient(@Param("emailClient") String emailClient);
	
	public Commande getCommande(@Param("id") Integer id);
	
}
