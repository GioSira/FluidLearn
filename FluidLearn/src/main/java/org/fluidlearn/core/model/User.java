package org.fluidlearn.core.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 0;
	
	@Id
	@Column
	private long id;
	
	@Column
	private String username;
	
	@Column
	private String pwd;


	public User() {
	}
	
	public User(long id, String username, String pwd) {
		this.id = id;
		this.username = username;
		this.pwd = pwd;
	}
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((pwd == null) ? 0 : pwd.hashCode());
		result = prime * result
				+ ((username == null) ? 0 : username.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		User other = (User) obj;
		if (pwd == null) {
			if (other.pwd != null)
				return false;
		} else if (!pwd.equals(other.pwd))
			return false;
		if (username == null) {
			if (other.username != null)
				return false;
		} else if (!username.equals(other.username))
			return false;
		return true;
	}
	
	
	
	

}
