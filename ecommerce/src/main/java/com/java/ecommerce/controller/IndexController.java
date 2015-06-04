package com.java.ecommerce.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.java.ecommerce.mappers.ProduitMapper;
import com.java.ecommerce.model.Produit;

@Controller
public class IndexController {
	
	
	@Autowired
	ProduitMapper produitMapper;

	protected final Log logger = LogFactory.getLog(getClass());
	
	@RequestMapping(value = "/")
	public ModelAndView test(final HttpServletResponse response) throws IOException {
		ModelAndView mav = new ModelAndView("index");
		List<Produit> produits = this.produitMapper.getAllProduits();
		mav.addObject("produits", produits);
		return mav;
	}

	

}