package org.fluidlearn.core.model;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.fluidlearn.core.model.unitadidattica.*;
import org.fluidlearn.core.model.attori.*;

@Entity
public class Corso {

	@Column
	private String nome;
	
	@Column
	private String descrizione;
	
	@Column // vedere come mettere array dentro
	private ArrayList<Partecipante> partecipanti;
	
	@Column
	private Mappa mappa;
	
	@Column
	private UnitaDA uda;
	
	//@Column
	//private PercorsoDA percorsoDA;
	
	@Column
	private Prototipo prototipo;

	public UnitaDA getLastUDAAttiva() {
		return uda;
	}

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

	public Partecipante[] getPartecipanti() {
		return (Partecipante[]) partecipanti.toArray();
	}

	public void addPartecipanti(Partecipante part) {
		this.partecipanti.add(part);
	}

	public Mappa getMappa() {
		return mappa;
	}

	public void setMappa(Mappa mappa) {
		this.mappa = mappa;
	}

	public UnitaDA getUda() {
		return uda;
	}

	public void setUda(UnitaDA uda) {
		this.uda = uda;
	}
	
	
	
}
