package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Redattore extends Ruolo {

	@Column
	private Partecipante partecipante;

	public Redattore(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "redattore";
	}
	
	
}
