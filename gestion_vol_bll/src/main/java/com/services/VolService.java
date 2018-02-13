package com.services;

import java.sql.Date;
import java.util.List;

import com.bo.Vol;

public interface VolService {

	public void addVol(Vol a);

	public void deleteVol(Long vId);

	public List<Vol> getAllVols();
	
	public List<Vol> getAllVolsBetweenDate(Date dateVoyageAllee, Date dateVoyageRetour);

	public void updateVol(Vol pvol);

}
