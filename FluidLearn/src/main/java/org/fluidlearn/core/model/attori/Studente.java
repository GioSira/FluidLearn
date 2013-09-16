package org.fluidlearn.core.model.attori;

import org.fluidlearn.core.model.Date;

public class Studente extends Ruolo {

	Date anno_iscrizione;
	private Object partecipante;

	public Studente(Partecipante partecipante) {
		this.partecipante = partecipante;
		this.anno_iscrizione = null;
		this.ruolo = "studente";
	}

	public Studente(String user, String password, String email, String nome,
			String cognome, Date anno_iscrizione) {
		this.partecipante = partecipante;
		this.anno_iscrizione = anno_iscrizione;
		this.ruolo = "studente";
	}
	
	
	
	
	
}
