package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.CompagnieAerienne;
import com.dao.CompagnieAerienneDao;
import com.genericdao.impl.NativeHibernateGenericDAOImpl;

@Repository
public class CompagnieAerienneDaoImpl extends NativeHibernateGenericDAOImpl<CompagnieAerienne, Long> implements CompagnieAerienneDao {

	public CompagnieAerienneDaoImpl() {
		super(CompagnieAerienne.class);
	}

}
