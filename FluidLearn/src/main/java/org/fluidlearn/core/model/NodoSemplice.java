package org.fluidlearn.core.model;

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
		Risorsa[] risorsa = new Risorsa[1];
		risorsa[0] = this.getRisorsa();
		return risorsa;
	}

}
