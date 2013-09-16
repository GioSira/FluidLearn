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
	
	@Column
	private PercorsoDA percorsoDA;
	
	@Column
	private Prototipo prototipo;

	public UnitaDA getLastUDAAttiva() {
		return uda;
	}
	
}
