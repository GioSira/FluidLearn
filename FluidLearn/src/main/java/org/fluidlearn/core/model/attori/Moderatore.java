package org.fluidlearn.core.model.attori;

public class Moderatore extends Ruolo{

	private Partecipante partecipante;
	
	public Moderatore(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "moderatore";
	}
	
	
}
