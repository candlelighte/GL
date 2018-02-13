package com.services;

import java.util.List;

import com.bo.Reservation;

public interface ReservationService {

	public void addReservation(Reservation a);

	public void deleteReservation(Long rId);

	public List<Reservation> getAllReservations();

	public void updateReservation(Reservation pvol);
}
