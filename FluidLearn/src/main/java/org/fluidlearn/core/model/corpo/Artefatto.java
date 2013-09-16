package org.fluidlearn.core.model.corpo;

public class Artefatto extends Corpo {

	Plugin plugin;

	public Artefatto(Plugin plugin) {
		super();
		this.plugin = plugin;
	}

	public Artefatto() {
		// TODO Auto-generated constructor stub
	}

	public Plugin getPlugin() {
		return plugin;
	}

	public void setPlugin(Plugin plugin) {
		this.plugin = plugin;
	}
	
	public void set(Object obj) {
		setPlugin((Plugin)obj);
	}
	
}
