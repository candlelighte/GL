package com.services.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.bo.Client;
import com.dao.ClientDao;
import com.services.ClientService;

public class ClientServiceImpl implements ClientService {
	
	@Autowired
	ClientDao clientdao;

	@Override
	public Client getClientByName( String name ) {
		
		return null;
	}

}
