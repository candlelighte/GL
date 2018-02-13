
package com.dao.impl;

import org.springframework.stereotype.Repository;

import com.bo.Reservation;
import com.dao.ReservationDao;
import com.genericdao.impl.NativeHibernateGenericDAOImpl;

@Repository

public class ReservationDaoImpl extends NativeHibernateGenericDAOImpl<Reservation, Long> implements ReservationDao {

	public ReservationDaoImpl() {
		super(Reservation.class);
	}

	

}
