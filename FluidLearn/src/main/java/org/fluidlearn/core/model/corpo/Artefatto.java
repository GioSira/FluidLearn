package org.fluidlearn.core.model.corpo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Artefatto extends Corpo {

	@Id
	@Column
	Long id;
	
	@Column
	private Plugin plugin;

	public Artefatto(Plugin plugin) {
		super();
		this.plugin = plugin;
	}

	public Artefatto() {
		// TODO Auto-generated constructor stub
	}

	public void setArtefatto(Plugin plugin) {
		this.plugin = plugin;
	}
	
	public void set(Object obj) {
		setArtefatto((Plugin)obj);
	}
	
	public Object get() {
		return plugin;
	}
	
}
