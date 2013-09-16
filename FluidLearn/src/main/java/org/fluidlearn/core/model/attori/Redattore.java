package org.fluidlearn.core.model.attori;

public class Redattore extends Ruolo {

	private Partecipante partecipante;

	public Redattore(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "redattore";
	}
	
	
}
