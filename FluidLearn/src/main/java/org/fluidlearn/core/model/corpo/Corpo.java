package org.fluidlearn.core.model.corpo;

import org.fluidlearn.core.controller.PluginController;

public abstract class Corpo {

	public static Corpo creaCorpo(Boolean isTesto) {
		if(isTesto) {
			Corpo corpo = new Testo();
			return corpo;
		}
		else {
			PluginController plugContr = new PluginController();
			return plugContr.creArtefatto();
		}
	}
	
	public abstract void set(Object obj);
	
	public abstract Object get();
	
}
