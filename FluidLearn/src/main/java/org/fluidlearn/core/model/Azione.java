package org.fluidlearn.core.model;

import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

public abstract class Azione extends Contributo {

	private String titolo;

	public Azione(Date data, Boolean visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo,
			String titolo) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo);
		this.titolo = titolo;
	}
	
	
	
}
