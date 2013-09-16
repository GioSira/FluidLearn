package org.fluidlearn.core.model.unitadidattica;

import java.util.ArrayList;

public class Mappa {

	private ArrayList<Relazione> relazioni;
	private ArrayList<Nodo> nodi;
	
	
	public Mappa(ArrayList<Relazione> relazioni, ArrayList<Nodo> nodi) {
		super();
		this.relazioni = relazioni;
		this.nodi = nodi;
	}


	public ArrayList<Relazione> getRelazioni() {
		return relazioni;
	}


	public void setRelazioni(ArrayList<Relazione> relazioni) {
		this.relazioni = relazioni;
	}


	public ArrayList<Nodo> getNodi() {
		return nodi;
	}


	public void setNodi(ArrayList<Nodo> nodi) {
		this.nodi = nodi;
	}
	
	
	
	
}
