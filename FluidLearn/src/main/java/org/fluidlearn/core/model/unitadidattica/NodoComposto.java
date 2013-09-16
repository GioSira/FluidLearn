package org.fluidlearn.core.model.unitadidattica;

import java.util.ArrayList;

import org.fluidlearn.core.model.Risorsa;

public class NodoComposto extends Nodo {
	
	public NodoComposto(String descrizione, String nome, Risorsa risorsa,
			Nodo[] children) {
		super(descrizione, nome, risorsa, children);
	}

	@Override
	public Risorsa getRisorsa() {
		return this.getRisorsa();
	}

	
	public Risorsa[] getRisorseTutte() {
		// aggiungo la risorsa del nodo in cui sono
		this.allNode.add(this.getRisorsa());
		// per ogni nodo figlio, aggiungo la risorsa
		for(Nodo nodo: this.children) {
			this.allNode.add(nodo.getRisorseTutte());
		}
	}
	
}
