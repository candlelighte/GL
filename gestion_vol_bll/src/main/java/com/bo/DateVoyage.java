package com.bo;

import org.joda.time.DateTime;



public class DateVoyage {
	
	
	private Long id;
	
	
	private DateTime dateTimeAlle;
	
	
	private DateTime dateTimeRetour;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public DateTime getDateTimeAlle() {
		return dateTimeAlle;
	}

	public void setDateTimeAlle(DateTime dateTimeAlle) {
		this.dateTimeAlle = dateTimeAlle;
	}

	public DateTime getDateTimeRetour() {
		return dateTimeRetour;
	}

	public void setDateTimeRetour(DateTime dateTimeRetour) {
		this.dateTimeRetour = dateTimeRetour;
	}

}
