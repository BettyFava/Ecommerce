package com.java.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.ecommerce.mappers.ProduitMapper;
import com.java.ecommerce.model.Produit;

@Service
public class ProduitServiceImp implements ProduitService {

	@Autowired
	ProduitMapper produitMapper;

	@Override
	public void insertProduit(Produit produit) {
		produitMapper.insertProduit(produit);

	}

	@Override
	public Produit getProduitById(Integer idProduit) {
		return produitMapper.getProduitById(idProduit);
	}

	@Override
	public List<Produit> getAllProduits() {
		return produitMapper.getAllProduits();
	}

	@Override
	public void updateProduit(Produit produit) {
		produitMapper.updateProduit(produit);

	}

	@Override
	public void deleteProduit(Integer idProduit) {
		produitMapper.deleteProduit(idProduit);

	}

	@Override
	public int getHighProduitId() {
		return produitMapper.getHighProduitId();
	}

}
