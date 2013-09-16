package org.fluidlearn.core.model.unitadidattica;

import org.fluidlearn.core.model.Risorsa;

public class Relazione {

	public String nome;
	public String descrizione;
	public Risorsa risorsa;
	private Nodo nodo1;
	private Nodo nodo2;
	
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescrizione() {
		return descrizione;
	}
	
	public void setDescrizione(String descrizione) {
		this.descrizione = descrizione;
	}
	
	public Risorsa getRisorsa() {
		return risorsa;
	}
	
	public void setRisorsa(Risorsa risorsa) {
		this.risorsa = risorsa;
	}
	
	public Nodo getNodo1() {
		return nodo1;
	}
	
	public void setNodo1(Nodo nodo1) {
		this.nodo1 = nodo1;
	}
	
	public Nodo getNodo2() {
		return nodo2;
	}
	
	public void setNodo2(Nodo nodo2) {
		this.nodo2 = nodo2;
	}
	
	public Relazione(String nome, String descrizione, Risorsa risorsa,
			Nodo nodo1, Nodo nodo2) {
		super();
		this.nome = nome;
		this.descrizione = descrizione;
		this.risorsa = risorsa;
		this.nodo1 = nodo1;
		this.nodo2 = nodo2;
	}
	
	
	
}
