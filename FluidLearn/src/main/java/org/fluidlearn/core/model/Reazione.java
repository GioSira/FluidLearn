package org.fluidlearn.core.model;

import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

public abstract class Reazione extends Contributo {

	public Reazione() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Reazione(Date data, int visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo) {
		super(data, visibilita, isDraft, risorsa, unitaDA, corpo);
		// TODO Auto-generated constructor stub
	}

	
	
}
