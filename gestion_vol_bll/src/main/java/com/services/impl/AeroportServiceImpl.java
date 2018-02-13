package com.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bo.Aeroport;
import com.dao.AeroportDao;
import com.services.AeoroportService;

@Service
@Transactional
public class AeroportServiceImpl implements AeoroportService {
	
	@Autowired
	private AeroportDao aeroportDao;
	
	public AeroportServiceImpl() {

	}

	@Override
	public List<Aeroport> getAllAerport() {
		List<Aeroport> list = aeroportDao.getAll();
		
		return list;
	}

}	
