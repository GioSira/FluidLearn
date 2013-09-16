package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Ruolo extends Partecipante {

	@Column
	protected String ruolo;

	public String getRuolo() {
		return ruolo;
	}
	
	public void setRuolo(String ruolo) {
		this.ruolo = ruolo;
	}

	public Ruolo() {
		super();
		this.ruolo = "sconosciuto";
	}

	public Ruolo(String user, String password, String email, String nome,
			String cognome) {
		super(user, password, email, nome, cognome);
		this.ruolo = "sconosciuto";
	}
	
	
	
}
