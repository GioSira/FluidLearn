package org.fluidlearn.core.model;

public class Risposta extends Reazione {

	private String titolo;
	private Valutazione valutazione;

	public Risposta() {
		super();
		this.titolo = null;
		this.valutazione = null;
	}

	public Risposta(String titolo, Valutazione valutazione, Date data, Boolean visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo);
		this.titolo = titolo;
		this.valutazione = valutazione;
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
	
}
