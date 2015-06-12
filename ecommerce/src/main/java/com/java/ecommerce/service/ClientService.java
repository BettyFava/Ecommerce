package com.java.ecommerce.service;

import com.java.ecommerce.model.Client;

public interface ClientService {

	public void insertClient(Client client);
	
	public Client getClientByEmail(String emailClient);
}
