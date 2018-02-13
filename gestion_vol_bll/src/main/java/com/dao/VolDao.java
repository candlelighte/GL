package com.dao;

import java.sql.Date;
import java.util.List;

import com.bo.Vol;
import com.genericdao.api.GenericDao;

public interface VolDao extends GenericDao<Vol, Long>  {
	
	public List<Vol> getVolsInDate( Date dateVoyageAllee, Date dateVoyageRetour );

}
