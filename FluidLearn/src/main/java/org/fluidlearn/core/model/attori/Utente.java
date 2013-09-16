package org.fluidlearn.core.model.attori;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Utente {

	@Column
	private String user;
	
	@Column
	private String password;
	
	@Column
	private String email;
	
	public Utente(String user, String password, String email) {
		this.user= user;
		this.password = password;
		this.email = email;
	}
	
	public Utente() {
		this(null, null, null);
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
