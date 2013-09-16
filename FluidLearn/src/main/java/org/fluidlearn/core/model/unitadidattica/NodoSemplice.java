package org.fluidlearn.core.model.unitadidattica;

import org.fluidlearn.core.model.Risorsa;

public class NodoSemplice extends Nodo {
	
	public NodoSemplice(String descrizione, String nome, Risorsa risorsa) {
		super(descrizione, nome, risorsa, null);
	}

	@Override
	public Risorsa getRisorsa() {
		return this.getRisorsa();
	}

	@Override
	public Risorsa[] getRisorseTutte() {
		return (Risorsa[]) this.allNode.toArray();
	}

}
