package com.services.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bo.Vol;
import com.dao.VolDao;
import com.services.VolService;

@Transactional
@Service
public class VolServiceImpl implements VolService {

	@Autowired
	private VolDao voldao;
	
	public VolServiceImpl() {
	}

	@Override
	public void addVol(Vol res) {
		voldao.create(res);

	}

	@Override
	public void deleteVol(Long rId) {
		voldao.delete(rId);

	}

	@Override
	public List<Vol> getAllVols() {

		return voldao.getAll();
	}

	@Override
	public void updateVol(Vol pvol) {
		voldao.update(pvol);

	}

	@Override
	public List<Vol> getAllVolsBetweenDate(Date dateVoyageAllee, Date dateVoyageRetour) {
		
		voldao.getVolsInDate(dateVoyageAllee, dateVoyageRetour );
		return null;
	}

}
