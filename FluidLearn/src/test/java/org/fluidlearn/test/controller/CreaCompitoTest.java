package org.fluidlearn.test.controller;

import org.fluidlearn.core.controller.CompitoController;
import org.fluidlearn.core.model.Corso;
import org.fluidlearn.core.model.attori.Docente;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.attori.PartecipanteConcreto;
import org.fluidlearn.core.model.unitadidattica.Mappa;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.NodoSemplice;
import org.fluidlearn.core.model.unitadidattica.Relazione;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;
import org.junit.Test;

public class CreaCompitoTest {

	@Test
	public void testCreazioneCompito() {
		
		// creo un partecipante
		Partecipante user = new PartecipanteConcreto("Ruper", "abba1234", "rupert@gmail.com",
								"Rupert", "Smith");
		
		// faccio diventare rupert un docente
		user = new Docente(user);
		
		// creo primo nodo
		Nodo nodo1 = new NodoSemplice("Matematica", "IL corso propone...");
		
		// creo secondo nodo
		Nodo nodo2 = new NodoSemplice("Informatica", "il corso insegna...");
		
		// creo una relazione
		Relazione relazione = new Relazione("conoscenze base", "per l'esame di informatica è necessaria matematica",
					nodo1, nodo2);
		
		// creo un nuovo oggeto mappa
		Mappa mappa = new Mappa();
		// aggiungo i nodi
		mappa.addNodi(nodo1);
		mappa.addNodi(nodo2);
		// aggiungo relazione
		mappa.addRelazioni(relazione);
		
		// creo una unitaDA
		UnitaDA uda = new UnitaDA();
		uda.setTitolo("Array in java");
		uda.setDescrizione("si vedrà come realizzare...");
		uda.setStato("in svolgimento svolgere");
		
		// creo un corso
		Corso corso = new Corso();
		corso.setNome("Programmazione avanzata in java");
		corso.setMappa(mappa);
		corso.setDescrizione("si partirà rivedendo gli array...");
		corso.addPartecipanti(user);
		corso.setUda(uda);
		
		CompitoController compitoController = new CompitoController();
		
		try {
			compitoController.creaCompito(user, true, 4547L);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		// vedere cosa si può asserire
		
	}
	
}
