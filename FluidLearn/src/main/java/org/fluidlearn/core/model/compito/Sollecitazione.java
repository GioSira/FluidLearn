package org.fluidlearn.core.model.compito;

import org.fluidlearn.core.model.Azione;
import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.Risorsa;
import org.fluidlearn.core.model.attori.Esaminatore;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

public class Sollecitazione extends Azione {

	private Partecipante esaminatore;
	private Date data_scadenza;

	public Sollecitazione(Date data, Boolean visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo,
			String titolo, Date data_scadenza, Partecipante part) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo, titolo);
		this.data_scadenza = data_scadenza;
		this.esaminatore = part;
	}

	public Date getData_scadenza() {
		return data_scadenza;
	}

	public void setData_scadenza(Date data_scadenza) {
		this.data_scadenza = data_scadenza;
	}
	
	

	
	
}
