package org.fluidlearn.core.model.corpo;

public abstract class Corpo {

	public static Corpo creaCorpo(Boolean isTesto) {
		if(isTesto) {
			Corpo corpo = new Testo();
			return corpo;
		}
		else {
			// richiamo plugin controller che mi
			// mi crea un plugin che mi crea un artefatto
			// poi ritorno l'artefatto
			Plugin plugin = new Plugin();
			Corpo corpo = plugin.creaArtefatto();
			return corpo;
		}
	}
	
	public abstract void set(Object obj);
	
}
