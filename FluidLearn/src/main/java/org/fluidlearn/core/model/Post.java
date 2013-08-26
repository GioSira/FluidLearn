package org.fluidlearn.core.model;

import java.io.Serializable;

import javax.persistence.*;

@Entity
public class Post implements Serializable {
	
	private static final long serialVersionUID = -1308795024262635690L;
	
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@Column
	private String titolo;
	
	@Column
	private Long personID;

	@Column 
	private Long testoID;
	
	@Column 
	private Long pluginID;

	public Post() {
		super();
	}

	public Post(Long id, String titolo, Long personID, Long testoID,
			Long pluginID) {
		super();
		this.id = id;
		this.titolo = titolo;
		this.personID = personID;
		this.testoID = testoID;
		this.pluginID = pluginID;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTitolo() {
		return titolo;
	}

	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}

	public Long getPersonID() {
		return personID;
	}

	public void setPersonID(Long personID) {
		this.personID = personID;
	}

	public Long getTestoID() {
		return testoID;
	}

	public void setTestoID(Long testoID) {
		this.testoID = testoID;
	}

	public Long getPluginID() {
		return pluginID;
	}

	public void setPluginID(Long pluginID) {
		this.pluginID = pluginID;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", titolo=" + titolo + ", personID="
				+ personID + ", testoID=" + testoID + ", pluginID=" + pluginID
				+ "]";
	}
	
	
	
	

}
