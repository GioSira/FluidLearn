package org.fluidlearn.core.model;

import java.util.ArrayList;

public class NodoComposto extends Nodo {
	
	private static ArrayList<Risorsa> risorse = new ArrayList<Risorsa>();

	public NodoComposto(String descrizione, String nome, Risorsa risorsa,
			Nodo[] children) {
		super(descrizione, nome, risorsa, children);
	}

	@Override
	public Risorsa getRisorsa() {
		return this.getRisorsa();
	}

	
	public Risorsa[] getRisorseTutte() {
		return (Risorsa[]) risorse.toArray();
	}
	
	// vedere come poter fare in modo tale che sia nodosemplice e nodo
	// composto restituiscano tutte le risorse
	private Risorsa getTutteRisorse() {
		risorse.add(this.getRisorsa());
		for(Nodo nodo: children) {
			risorse.add(nodo.);
		}
		return
	}

}
