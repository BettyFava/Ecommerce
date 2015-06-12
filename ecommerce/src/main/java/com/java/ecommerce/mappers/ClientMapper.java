package com.java.ecommerce.mappers;

import com.java.ecommerce.model.Client;

public interface ClientMapper {
	
	public void insertClient(Client client);
	
	public Client getClientByEmail(String emailClient);
	
}
