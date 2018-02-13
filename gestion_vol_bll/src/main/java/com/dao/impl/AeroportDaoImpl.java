package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Aeroport;
import com.dao.AeroportDao;
import com.genericdao.impl.NativeHibernateGenericDAOImpl;

@Repository
public class AeroportDaoImpl  extends NativeHibernateGenericDAOImpl<Aeroport,Long> implements AeroportDao{

	public AeroportDaoImpl(){
		super(Aeroport.class);
	}

}
