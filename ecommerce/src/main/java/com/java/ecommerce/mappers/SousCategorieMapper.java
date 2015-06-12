package com.java.ecommerce.mappers;

import java.util.List;


import com.java.ecommerce.model.SousCategorie;

public interface SousCategorieMapper {

	
	public SousCategorie getSousCategorie(Integer id);
	
	public List<SousCategorie> getAllSousCategoriesByCategorie();
	
	
}
