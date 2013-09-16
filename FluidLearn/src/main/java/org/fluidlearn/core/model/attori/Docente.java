package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Docente extends Ruolo {

	@Column
	private Partecipante partecipante;
	
	public Docente(Partecipante partecipante) {
		this.partecipante = partecipante;
		ruolo = "docente";
	}

}
