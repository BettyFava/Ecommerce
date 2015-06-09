package com.java.ecommerce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.mappers.ProduitMapper;
import com.java.ecommerce.model.Produit;

@Controller
public class IndexController {
	
	
	@Autowired
	ProduitMapper produitMapper;
	
	@RequestMapping(value = "/")
	public ModelAndView accueil() {
		ModelAndView mav = new ModelAndView("index");
		List<Produit> produits = this.produitMapper.getAllProduits();
		mav.addObject("produits", produits);
		return mav;
	}
	
	//permet la suppression d'un produit
	//POUR LE MOMENT PBM SQL MAIS CELA VEUT DIRE QUE CA MARCHE !
	@RequestMapping(value = "/delete/{id}")
	public ModelAndView supprimerPost(@PathVariable("id") final Integer id) {
		ModelAndView mav = new ModelAndView("redirect:/");
		this.produitMapper.deleteProduit(id);
		return mav;

	}

	

}