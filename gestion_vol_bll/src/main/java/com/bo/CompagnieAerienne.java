package com.bo;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class CompagnieAerienne {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ID_COMP")
	private long IdComp;

	private String NomComp;

	@ManyToMany
	@JoinTable(
			name="COM_VOL",
			joinColumns=@JoinColumn(name="Company_ID", referencedColumnName="ID_COMP"),
			inverseJoinColumns=@JoinColumn(name="Vol_ID", referencedColumnName="ID_VOL")
			)
	private List<Vol> vols;

	public long getIdComp() {
		return IdComp;
	}

	public void setIdComp(long idComp) {
		IdComp = idComp;
	}

	public String getNomComp() {
		return NomComp;
	}

	public void setNomComp(String nomComp) {
		NomComp = nomComp;
	}

}
