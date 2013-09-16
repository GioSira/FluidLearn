package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Moderatore extends Ruolo{

	@Column
	private Partecipante partecipante;
	
	public Moderatore(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "moderatore";
	}
	
	
}
