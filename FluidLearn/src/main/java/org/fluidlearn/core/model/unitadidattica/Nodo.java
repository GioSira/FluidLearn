package org.fluidlearn.core.model.unitadidattica;

import org.fluidlearn.core.model.Risorsa;
import java.util.*;

public abstract class Nodo {

	public static ArrayList<Risorsa> allNode = new ArrayList<Risorsa>();
	
	public String descrizione;
	public String nome;
	public Risorsa risorsa;
	public Nodo[] children;
	
	public Nodo(String descrizione, String nome, Risorsa risorsa, Nodo[] children) {
		this.descrizione = descrizione;
		this.nome = nome;
		this.risorsa = risorsa;
		this.children = children;
	}
	
	
	public abstract Risorsa getRisorsa();
	
	public abstract Risorsa[] getRisorseTutte();
	
}
