package org.fluidlearn.core.model;

public class Valutazione {

	private String risultato;
	private String commento;
	
	public Valutazione(String risultato, String commento) {
		super();
		this.risultato = risultato;
		this.commento = commento;
	}

	public String getRisultato() {
		return risultato;
	}

	public void setRisultato(String risultato) {
		this.risultato = risultato;
	}

	public String getCommento() {
		return commento;
	}

	public void setCommento(String commento) {
		this.commento = commento;
	}
	
	
	
}
