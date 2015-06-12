package com.java.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.java.ecommerce.mappers.ClientMapper;
import com.java.ecommerce.model.Client;

public class ClientServiceImp implements ClientService {

	@Autowired
	ClientMapper clientMapper;
	
	@Override
	public void insertClient(Client client) {
		clientMapper.insertClient(client);
	}
	
	@Override
	public Client getClientByEmail(String emailClient) {
		return clientMapper.getClientByEmail(emailClient);
	}

}
