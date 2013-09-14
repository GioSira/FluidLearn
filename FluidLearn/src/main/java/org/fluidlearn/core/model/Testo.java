package org.fluidlearn.core.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Testo implements Serializable, Corpo {
	
	private static final long serialVersionUID = -1308795024262635690L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String titolo;
	
	
	public Testo() {
	}

	public Testo(Long id, String titolo, String descrizione) {
		this.id = id;
		this.titolo = titolo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}



	@Override
	public String toString() {
		return "Testo [id=" + id + ", titolo=" + titolo + ", descrizione="
				+ "]";
	}
	
	
	
	

}
