package org.fluidlearn.core.model.unitadidattica;

import org.fluidlearn.core.model.Risorsa;

public class NodoComposto extends Nodo {
	
	public NodoComposto(String descrizione, String nome, Risorsa[] risorse,
			Nodo[] children) {
		super(descrizione, nome, risorse, children);
	}

	@Override
	public Risorsa[] getRisorse() {
		return risorse;
	}

	// da rincontrollare per vedere se va bene come idea
	public Risorsa[] getRisorseTutte() {
		for(Risorsa risorsa: this.risorse)
			risorseArray.add(risorsa);
		for(Nodo nodo : this.children)
			nodo.getRisorseTutte();
		return (Risorsa[]) risorseArray.toArray();
	}
	
}
