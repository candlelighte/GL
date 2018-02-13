package com.dao.impl;

import com.bo.DateVoyage;
import com.dao.DateVoyageDao;
import com.genericdao.impl.NativeHibernateGenericDAOImpl;

public class DateVoyageDaoImpl extends NativeHibernateGenericDAOImpl<DateVoyage, Long> implements DateVoyageDao {

	public DateVoyageDaoImpl() {
		super(DateVoyage.class);
	}

}
