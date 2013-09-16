package org.fluidlearn.core.model;

import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

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

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public Boolean getVisibilita() {
		return visibilita;
	}

	public void setVisibilita(Boolean visibilita) {
		this.visibilita = visibilita;
	}

	public Boolean getIsDraft() {
		return isDraft;
	}

	public void setIsDraft(Boolean isDraft) {
		this.isDraft = isDraft;
	}

	public Risorsa getRisorsa() {
		return risorsa;
	}

	public void setRisorsa(Risorsa risorsa) {
		this.risorsa = risorsa;
	}

	public Nodo getNodo() {
		return nodo;
	}

	public void setNodo(Nodo nodo) {
		this.nodo = nodo;
	}

	public UnitaDA getUnitaDAAppartenenza() {
		return unitaDAAppartenenza;
	}

	public void setUnitaDAAppartenenza(UnitaDA unitaDAAppartenenza) {
		this.unitaDAAppartenenza = unitaDAAppartenenza;
	}

	public Corpo getCorpo() {
		return corpo;
	}

	public void setCorpo(Corpo corpo) {
		this.corpo = corpo;
	}
	
	
	

}
