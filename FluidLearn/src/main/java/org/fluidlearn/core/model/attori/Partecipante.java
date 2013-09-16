package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Partecipante extends Utente {

	@Column
	private String nome;
	
	@Column
	private String cognome;
	
	public Partecipante(String user, String password, String email,
			String nome, String cognome) {
		super(user, password, email);
		this.nome = nome;
		this.cognome = cognome;
	}
	
	public Partecipante() {
		super();
		this.nome = null;
		this.cognome = null;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	
	
	
}
