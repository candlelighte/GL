package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Client;
import com.dao.ClientDao;
import com.genericdao.impl.NativeHibernateGenericDAOImpl;

/**
 * 
 * Implementation du DAO BookDAO.
 * 
 * Cette classe he©rite toutes les fonctionnalitÃ©s du DAO Generic en indiquant
 * les valeurs de T et PK
 * 
 * @author KHIRALLAH
 *
 */

@Repository
public class ClientDaoImpl extends NativeHibernateGenericDAOImpl<Client, Long> implements ClientDao {

	public ClientDaoImpl() {

		super(Client.class);
	}

}
