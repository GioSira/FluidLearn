package org.fluidlearn.core.model;

public abstract class Nodo {

	public String descrizione;
	public String nome;
	public Risorsa risorsa;
	public Nodo[] children;
	
	public Nodo(String descrizione, String nome, Risorsa risorsa, Nodo[] children) {
		super();
		this.descrizione = descrizione;
		this.nome = nome;
		this.risorsa = risorsa;
		this.children = children;
	}
	
	
	public abstract Risorsa getRisorsa();
	
	public abstract Risorsa[] getRisorseTutte();
	
}
