package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Esaminatore extends Ruolo{

	@Column
	private Partecipante partecipante;
	
	public Esaminatore(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "esaminatore";
	}

	
	
}
