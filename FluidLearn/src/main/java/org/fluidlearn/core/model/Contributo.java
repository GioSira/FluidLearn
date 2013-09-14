package org.fluidlearn.core.model;

public abstract class Contributo {

	private Date datetime;
	private Boolean visibilita;
	private Boolean isDraft;
	private Risorsa risorsa;
	private Nodo nodo;
	private UnitaDA unitaDAAppartenenza;
	private Corpo corpo;
	
	public Contributo(Date data, Boolean visibilita, Boolean isDraft, Risorsa risorsa,
					  Nodo nodo, UnitaDA unitaDA, Corpo corpo) {
		this.datetime = data;
		this.visibilita = visibilita;
		this.isDraft = isDraft;
		this.risorsa = risorsa;
		this.nodo = nodo;
		this.unitaDAAppartenenza = unitaDA;
		this.corpo = corpo;
	}
	
	public Contributo() {
		this(null, null, null, null, null, null, null);
	}
	

}
