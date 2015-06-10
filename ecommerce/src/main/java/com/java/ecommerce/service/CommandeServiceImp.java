package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.mappers.CommandeMapper;
import com.java.ecommerce.model.Commande;

@Service
public class CommandeServiceImp implements CommandeService {

	@Autowired
	CommandeMapper commandeMapper;
	
	@Override
	public void insertCommande(Commande commande) {
		commandeMapper.insertCommande(commande);
	}

	@Override
	public List<Commande> getAllCommandes() {
		return commandeMapper.getAllCommandes();
	}

	@Override
	public List<Commande> getCommandesByClient(String emailClient) {
		return commandeMapper.getCommandesByClient(emailClient);
	}

	@Override
	public void deleteCommande(Integer idCommande) {
		commandeMapper.deleteCommande(idCommande);
	}


}
