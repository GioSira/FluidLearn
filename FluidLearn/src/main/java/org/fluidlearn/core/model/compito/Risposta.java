package org.fluidlearn.core.model.compito;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.Reazione;
import org.fluidlearn.core.model.Risorsa;
import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

@Entity
public class Risposta extends Reazione {

	@Column
	private String titolo;
	
	@Column
	private Valutazione valutazione;
	
	@Column
	private Sollecitazione sollecitazione;

	public Risposta() {
		super();
		this.titolo = null;
		this.valutazione = null;
	}

	public Risposta(String titolo, Valutazione valutazione, Date data, int visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo);
		this.titolo = titolo;
		this.valutazione = valutazione;
	}

	public Risposta(Corpo corpo) {
		super(corpo);
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Valutazione getValutazione() {
		return valutazione;
	}

	public void setValutazione(Valutazione valutazione) {
		this.valutazione = valutazione;
	}

	public Sollecitazione getSollecitazione() {
		return sollecitazione;
	}

	public void setSollecitazione(Sollecitazione sollecitazione) {
		this.sollecitazione = sollecitazione;
	}
	
	public void setIsDraft(boolean isDraft) {
		super.setIsDraft(isDraft);
	}
	
}
