package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.fluidlearn.core.model.Date;

@Entity
public class Studente extends Ruolo {

	@Column
	Date anno_iscrizione;
	
	@Column
	private Partecipante partecipante;

	public Studente(Partecipante part) {
		super();
		this.anno_iscrizione = null;
		this.partecipante = part;
	}

	
	
	
	
	
	
}
