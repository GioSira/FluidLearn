package org.fluidlearn.core.model.unitadidattica;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public class Mappa {

	@Column
	private ArrayList<Relazione> relazioni;
	
	@Column
	private ArrayList<Nodo> nodi;
	
	
	public Mappa() {
		super();
		this.relazioni = new ArrayList<Relazione>();
		this.nodi = new ArrayList<Nodo>();
	}


	public Relazione[] getRelazioni() {
		return (Relazione[]) relazioni.toArray();
	}


	public void addRelazioni(Relazione relazione) {
		this.relazioni.add(relazione);
	}


	public Nodo[] getNodi() {
		return (Nodo[]) nodi.toArray();
	}


	public void addNodi(Nodo nodo) {
		this.nodi.add(nodo);
	}
	
	
	
	
}
