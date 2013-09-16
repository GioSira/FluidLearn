package org.fluidlearn.core.model.corpo;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Plugin implements Serializable  {
	
	// devo far diventare così la classe Artefatto!!
	
	private static final long serialVersionUID = -1308795024262635690L;
	
	@Id
	private Long id;
	
	@Column
	private String name;
	
	@Column
	private String type;
	
	@Column
	private String path;

	public Plugin() {
	}

	public Plugin(Long id, String name, String type, String path) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.path = path;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
	public Artefatto creaArtefatto() {
		return new Artefatto();
	}

	@Override
	public String toString() {
		return "Plugin [id=" + id + ", name=" + name + ", type=" + type
				+ ", path=" + path + "]";
	}
	
	
	
	

}
