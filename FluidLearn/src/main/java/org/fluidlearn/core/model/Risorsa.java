package org.fluidlearn.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Risorsa {

	@Column
	private String file;
	
	@Column
	private String external;
	
	public Risorsa() {
		this(null, null);
	}
	
	public Risorsa(String file, String external) {
		this.file = file;
		this.external = external;
	}

	public String getFile() {
		return file;
	}

	public void setFile(String file) {
		this.file = file;
	}

	public String getExternal() {
		return external;
	}

	public void setExternal(String external) {
		this.external = external;
	}
	
}
