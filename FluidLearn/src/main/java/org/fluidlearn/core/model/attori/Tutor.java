package org.fluidlearn.core.model.attori;

public class Tutor extends Ruolo {

	Partecipante partecipante;
	
	public Tutor(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "tutor";
	}

}
