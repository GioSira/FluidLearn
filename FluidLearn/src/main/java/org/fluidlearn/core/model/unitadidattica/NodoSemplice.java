package org.fluidlearn.core.model.unitadidattica;

import org.fluidlearn.core.model.Risorsa;

public class NodoSemplice extends Nodo {
	
	public NodoSemplice(String descrizione, String nome, Risorsa[] risorse) {
		super(descrizione, nome, risorse, null);
	}

	public NodoSemplice(String descrizione, String nome) {
		super(descrizione, nome);
		// TODO Auto-generated constructor stub
	}



	@Override
	public Risorsa[] getRisorse() {
		return risorse;
	}

	@Override
	public Risorsa[] getRisorseTutte() {
		for(Risorsa ris : this.risorse)
			risorseArray.add(ris);
		return (Risorsa[]) risorseArray.toArray();
	}

}
