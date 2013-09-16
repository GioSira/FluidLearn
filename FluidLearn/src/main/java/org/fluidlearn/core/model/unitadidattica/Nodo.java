package org.fluidlearn.core.model.unitadidattica;

import org.fluidlearn.core.model.Risorsa;
import java.util.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Entity
public abstract class Nodo {
	
	protected static ArrayList<Risorsa> risorseArray = new ArrayList<Risorsa>();
	
	@Column
	public String descrizione;
	
	@Column
	public String nome;
	
	@Column // vedere come salvare array in hibernate
	public Risorsa[] risorse;
	
	@Column
	public Nodo[] children;
	
	public Nodo(String descrizione, String nome, Risorsa[] risorsa, Nodo[] children) {
		this.descrizione = descrizione;
		this.nome = nome;
		this.risorse = risorsa;
		this.children = children;
	}
	
	public Nodo(String descrizione, String nome) {
		this(descrizione, nome, null, null);
	}
	
	
	public abstract Risorsa[] getRisorse();
	
	public abstract Risorsa[] getRisorseTutte();
	
}
