package com.java.ecommerce.service.test;

import static org.junit.Assert.*;

import java.util.Date;
import java.util.List;
import javax.inject.Inject;

import org.junit.Test;

import com.java.ecommerce.model.Commande;
import com.java.ecommerce.service.CommandeService;

public class CommandeServiceTest {

	@Inject
	private CommandeService commandeService;
	
	@Test
	public void testInsertCommande() {
		//GIVEN
		Commande commande = new Commande();
		commande.setDate(new Date());
		commande.setEmail_client("emailTest");
		commande.setEtat("etatTest");
		commande.setLogin_anonyme("loginTest");
		//WHEN
		commandeService.insertCommande(commande);
		//THEN
		//assertTrue(commandeService.getCommandesByClient("emailTest").isEmpty());
		//assertNotNull(commandeService.getCommandesByClient("emailTest"));
	}

	@Test
	public void testGetAllCommandes() {
/*		//WHEN
		List<Commande> listeCommande = commandeService.getAllCommandes();
		//THEN
		assertTrue(listeCommande.isEmpty());*/
		fail("Not yet implemented");
	}

	@Test
	public void testGetCommandesByClient() {
		fail("Not yet implemented");
	}

	@Test
	public void testDeleteCommande() {
		fail("Not yet implemented");
	}

}
