package org.fluidlearn.core.model.corpo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Testo extends Corpo implements Serializable  {
	
	private static final long serialVersionUID = -1308795024262635690L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String testo;
	
	
	public Testo() {
	}

	public Testo(Long id, String testo) {
		this.id = id;
		this.testo = testo;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTesto() {
		return testo;
	}

	public void setTesto(String testo) {
		this.testo = testo;
	}

	public void set(Object obj) {
		this.setTesto((String)obj);
	}
	
	public Object get() {
		return testo;
	}

	@Override
	public String toString() {
		return "Testo [id=" + id + ", titolo=" + testo + ", descrizione="
				+ "]";
	}
	
	
	
	

}
