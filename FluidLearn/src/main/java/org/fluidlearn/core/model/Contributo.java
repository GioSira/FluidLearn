package org.fluidlearn.core.model;

import java.util.ArrayList;

import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

public abstract class Contributo {

	private Date datetime;
	
	/* se vis = 0, visibile al creatore,
	 * se vis = 1, visibile creatore e iscritti,
	 * se vis = 2, visibile a tutti
	 */
	
	private int visibilita;
	private Boolean isDraft;
	private Risorsa risorsa;
	private ArrayList<Nodo> nodo;
	private UnitaDA unitaDAAppartenenza;
	private Corpo corpo;
	
	public Contributo(Date data, int visibilita, Boolean isDraft, Risorsa risorsa,
					  UnitaDA unitaDA, Corpo corpo) {
		this.datetime = data;
		this.visibilita = visibilita;
		this.isDraft = isDraft;
		this.risorsa = risorsa;
		this.nodo = new ArrayList<Nodo>();
		this.unitaDAAppartenenza = unitaDA;
		this.corpo = corpo;
	}
	
	public Contributo() {
		this(null, 0, null, null, null, null);
	}

	public Contributo(UnitaDA uda, Corpo corpo) {
		this.unitaDAAppartenenza = uda;
		this.corpo = corpo;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public int getVisibilita() {
		return visibilita;
	}

	public void setVisibilita(int visibilita) {
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

	public Nodo[] getNodo() {
		return (Nodo[]) nodo.toArray();
	}

	public void addNodo(Nodo nodo) {
		this.nodo.add(nodo);
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
