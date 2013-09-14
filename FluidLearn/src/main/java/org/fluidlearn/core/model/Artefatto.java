package org.fluidlearn.core.model;

public class Artefatto implements Corpo {

	Plugin plugin;

	public Artefatto(Plugin plugin) {
		super();
		this.plugin = plugin;
	}

	public Plugin getPlugin() {
		return plugin;
	}

	public void setPlugin(Plugin plugin) {
		this.plugin = plugin;
	}
	
	
	
	
}
