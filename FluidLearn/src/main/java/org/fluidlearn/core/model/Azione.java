package org.fluidlearn.core.model;

public abstract class Azione extends Contributo {

	private String titolo;

	public Azione(Date data, Boolean visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo,
			String titolo) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo);
		this.titolo = titolo;
	}
	
	
	
}
