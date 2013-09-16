package org.fluidlearn.core.model.unitadidattica;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class UnitaDA {

	@Column
	private String titolo;
	
	@Column
	private String descrizione;
	
	@Column
	private String stato;
	
	public UnitaDA(String titolo, String descrizione, String stato) {
		this.titolo = titolo;
		this.descrizione = descrizione;
		this.stato = stato;
	}
	
	public UnitaDA() {
		this(null, null, null);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public String getDescrizione() {
		return descrizione;
	}

	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}

	public String getStato() {
		return stato;
	}

	public void setStato(String stato) {
		this.stato = stato;
	}
	
	
	
}
