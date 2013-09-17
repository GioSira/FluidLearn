package org.fluidlearn.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

@Entity
public abstract class Azione extends Contributo {

	@Column
	private String titolo;

	public Azione(Date data, int visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo,
			String titolo) {
		super(data, visibilita, isDraft, risorsa, unitaDA, corpo);
		this.titolo = titolo;
	}

	public Azione(UnitaDA uda, Corpo corpo) {
		super(uda, corpo);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	
	
}
