package org.fluidlearn.core.model;

public class Sollecitazione extends Azione {

	private Date data_scadenza;

	public Sollecitazione(Date data, Boolean visibilita, Boolean isDraft,
			Risorsa risorsa, Nodo nodo, UnitaDA unitaDA, Corpo corpo,
			String titolo, Date data_scadenza) {
		super(data, visibilita, isDraft, risorsa, nodo, unitaDA, corpo, titolo);
		this.data_scadenza = data_scadenza;
	}

	public Date getData_scadenza() {
		return data_scadenza;
	}

	public void setData_scadenza(Date data_scadenza) {
		this.data_scadenza = data_scadenza;
	}
	
	

	
	
}
