package com.java.ecommerce.service.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import junit.framework.Assert;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.java.ecommerce.mappers.ProduitMapper;
import com.java.ecommerce.model.Commande;
import com.java.ecommerce.model.Produit;
import com.java.ecommerce.service.CommandeService;
import com.java.ecommerce.service.ProduitService;

public class ProduitServiceTest {

	@Autowired
	ProduitMapper produitMapper;
	
	@Test
	public void getAllProduitTest() {
		
		List<Produit> produits = produitMapper.getAllProduits();
		//assertEquals(14, produits.size());
		//assertTrue(commandeService.getCommandesByClient("emailTest").isEmpty());
		//assertNotNull(commandeService.getCommandesByClient("emailTest"));
	}

	
}
