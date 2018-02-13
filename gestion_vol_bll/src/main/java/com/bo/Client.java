package com.bo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Client {
	
		@Id
		@GeneratedValue(strategy= GenerationType.IDENTITY)
		private Long idClient;
		@Column(length=50)
		private String nom;
		@Column(length=50)
		private String prenom;
		@Column(length=50)
		private String email;
		@Column(length=50)
		private String password;
		@Column(length=50)
		private String CIN;
		@Column(length=100)
		private String Adresse;
		
//		@Column(length=50)
//		private Date record_date;
		
//		@OneToMany(mappedBy="client" ,fetch=FetchType.LAZY)
//		private Collection<Client> clients ;
//		

		//Gatters and setter:

		public Long getIdClient() {
			return idClient;
		}

		

		public void setIdClient(Long idClient) {
			this.idClient = idClient;
		}

		public String getNom() {
			return nom;
		}

		public void setNom(String nom) {
			this.nom = nom;
		}

		public String getPrenom() {
			return prenom;
		}

		public void setPrenom(String prenom) {
			this.prenom = prenom;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public String getCIN() {
			return CIN;
		}

		public void setCIN(String cIN) {
			CIN = cIN;
		}

		public String getAdresse() {
			return Adresse;
		}

		public void setAdresse(String adresse) {
			Adresse = adresse;
		}

//		public Collection<Client> getClients() {
//			return clients;
//		}
//
//		public void setClients(Collection<Client> clients) {
//			this.clients = clients;
//		}

		
		
		
		
		
	
		
		
		

	}



