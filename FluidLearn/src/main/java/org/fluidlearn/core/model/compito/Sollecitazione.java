package org.fluidlearn.core.model.compito;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.fluidlearn.core.model.Azione;
import org.fluidlearn.core.model.Date;
import org.fluidlearn.core.model.Risorsa;
import org.fluidlearn.core.model.attori.Partecipante;
import org.fluidlearn.core.model.corpo.Corpo;
import org.fluidlearn.core.model.unitadidattica.Nodo;
import org.fluidlearn.core.model.unitadidattica.UnitaDA;

@Entity
public class Sollecitazione extends Azione {

	@Column
	private Partecipante esaminatore;
	
	@Column
	private Date data_scadenza;

	public Sollecitazione(Date data, int visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo,
			String titolo, Date data_scadenza, Partecipante part) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo, titolo);
		this.data_scadenza = data_scadenza;
		this.esaminatore = part;
	}

	public Sollecitazione(Partecipante part, Corpo corpo, UnitaDA uda) {
		super(uda, corpo);
		this.esaminatore = part;
	}

	public Date getDataScadenza() {
		return data_scadenza;
	}

	public void setDataScadenza(Date data_scadenza) {
		this.data_scadenza = data_scadenza;
	}

	
	
}
