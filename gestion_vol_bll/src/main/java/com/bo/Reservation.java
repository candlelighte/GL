package com.bo;

import java.sql.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Reservation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idReservation;
	private int numeroReservation;
	
	@Column
	private Date dateAllee;
	
	@Column
	private Date dateRetour;
	
	
	@OneToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="ID_CLIENT")
	private Client client;
	
	@OneToMany(mappedBy="reservation")
	private List<Vol> vols;

	public int getNumeroReservation() {
		return numeroReservation;
	}

	public void setNumeroReservation(int numeroReservation) {
		this.numeroReservation = numeroReservation;
	}

	

	public Client getClient() {
		return client;
	}

	public void setClient(Client client) {
		this.client = client;
	}

	public Long getIdReservation() {
		return idReservation;
	}

	public void setIdReservation(Long idReservation) {
		this.idReservation = idReservation;
	}

	public List<Vol> getVols() {
		return vols;
	}

	public void setVols(List<Vol> vols) {
		this.vols = vols;
	}

	public Date getDateAllee() {
		return dateAllee;
	}

	public void setDateAllee(Date dateAllee) {
		this.dateAllee = dateAllee;
	}

	public Date getDateRetour() {
		return dateRetour;
	}

	public void setDateRetour(Date dateRetour) {
		this.dateRetour = dateRetour;
	}
	
	
	
	

}
