package com.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Aeroport {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nom;
	private String ville;

//	public Aeroport() {
//		super();
//		// TODO Auto-generated constructor stub
//	}
//
//	public Aeroport(Long id, String nom, String ville) {
//		super();
//		this.id = id;
//		this.nom = nom;
//		this.ville = ville;
//	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

}
