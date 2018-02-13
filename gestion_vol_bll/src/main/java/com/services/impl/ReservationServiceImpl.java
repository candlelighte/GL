package com.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bo.Reservation;
import com.dao.ReservationDao;
import com.services.ReservationService;

@Service
@Transactional
public class ReservationServiceImpl implements ReservationService {

	@Autowired
	private ReservationDao reservationdao;
	
	public ReservationServiceImpl() {
	}

	@Override
	public void addReservation(Reservation res) {
		reservationdao.create(res);

	}

	@Override
	public void deleteReservation(Long rId) {
		reservationdao.delete(rId);

	}

	@Override
	public List<Reservation> getAllReservations() {

		return reservationdao.getAll();
	}

	@Override
	public void updateReservation(Reservation pvol) {
		reservationdao.update(pvol);

	}

}
