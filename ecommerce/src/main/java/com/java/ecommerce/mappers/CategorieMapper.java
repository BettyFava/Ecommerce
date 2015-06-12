package com.java.ecommerce.mappers;

import java.util.List;

import com.java.ecommerce.model.Categorie;


public interface CategorieMapper {

	public Categorie getCategorie(Integer id);
	
	public List<Categorie> getAllCategories();
}
