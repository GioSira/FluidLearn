package org.fluidlearn.core.model.attori;

public class Docente extends Ruolo {

	private Partecipante partecipante;
	
	public Docente(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "docente";
	}

}
