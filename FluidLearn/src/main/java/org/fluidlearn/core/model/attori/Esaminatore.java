package org.fluidlearn.core.model.attori;

public class Esaminatore extends Ruolo{

	private Partecipante partecipante;
	
	public Esaminatore(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "esaminatore";
	}

	
	
}
