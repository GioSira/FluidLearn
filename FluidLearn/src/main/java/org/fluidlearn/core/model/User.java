package org.fluidlearn.core.model;

import java.io.Serializable;
import javax.persistence.*;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 0;
	
	@Id
	@Column
	private String username;
	
	@Column
	private String pwd;

	public User() {
		this(null, null);
	}

	public User(String username, String pwd) {
		this.username = username;
		this.pwd = pwd;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", pwd=" + pwd
				+ "]";
	}
	
	
	
	

}
