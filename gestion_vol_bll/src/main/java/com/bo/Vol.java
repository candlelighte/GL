package com.bo;


import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

@Entity
public class Vol {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_VOL")
	private Long idVol;

	@Column
	private Date dateTimeAlle;
	
	@Column
	private Date dateTimeRetour;
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="AEO_ID")
	private Aeroport aeoportt;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn
	private Reservation reservation;

	

	public Long getIdVol() {
		return idVol;
	}



	public Date getDateTimeAlle() {
		return dateTimeAlle;
	}



	public void setDateTimeAlle(Date dateTimeAlle) {
		this.dateTimeAlle = dateTimeAlle;
	}



	public Date getDateTimeRetour() {
		return dateTimeRetour;
	}



	public void setDateTimeRetour(Date dateTimeRetour) {
		this.dateTimeRetour = dateTimeRetour;
	}



	public Aeroport getAeoportt() {
		return aeoportt;
	}



	public void setAeoportt(Aeroport aeoportt) {
		this.aeoportt = aeoportt;
	}



	public Reservation getReservation() {
		return reservation;
	}



	public void setReservation(Reservation reservation) {
		this.reservation = reservation;
	}



	public void setIdVol(Long idVol) {
		this.idVol = idVol;
	}

	public String toString() {
		return idVol + " " + dateTimeAlle + " " + dateTimeRetour + " " + aeoportt.toString();
	}
	
	
	
}
