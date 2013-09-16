package org.fluidlearn.core.model.corpo;

import java.io.Serializable;
import java.util.ArrayList;

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
	
	@Column
	private ArrayList<Artefatto> artefatti;

	public Plugin() {
		artefatti = new ArrayList<Artefatto>();
	}

	public Plugin(Long id, String name, String type, String path) {
		super();
		this.id = id;
		this.name = name;
		this.type = type;
		this.path = path;
		this.artefatti = new ArrayList<Artefatto>();
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
	
	public Artefatto[] getArtefatti() {
		return (Artefatto[]) artefatti.toArray();
	}

	public void setArtefatti(Artefatto[] artefatti) {
		for(Artefatto art: artefatti)
			this.artefatti.add(art);
	}

	public Artefatto creaArtefatto() {
		Artefatto artefatto = new Artefatto(this);
		artefatti.add(artefatto);
		return artefatto;		
	}

	@Override
	public String toString() {
		return "Plugin [id=" + id + ", name=" + name + ", type=" + type
				+ ", path=" + path + "]";
	}
	
	
	
	

}
