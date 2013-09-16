package org.fluidlearn.core.model.compito;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Valutazione {
	
	@Column
	private String risultato;
	
	@Column
	private String commento;
	
	@Column
	private String maxRisultato;
	
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
	
	public String getMaxRisultato() {
		return maxRisultato;
	}

	public void setMaxRisultato(String maxRisultato) {
		this.maxRisultato = maxRisultato;
	}
	
}
