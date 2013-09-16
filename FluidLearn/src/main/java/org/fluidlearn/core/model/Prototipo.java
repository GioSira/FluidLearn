package org.fluidlearn.core.model;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.fluidlearn.core.model.unitadidattica.Mappa;

@Entity
public class Prototipo {

	@Column
	private Mappa mappa;
	
	public Prototipo() {
		mappa = null;
	}
	
	public Prototipo(Mappa mappa) {
		this.mappa = mappa;
	}

	public Mappa getMappa() {
		return mappa;
	}

	public void setMappa(Mappa mappa) {
		this.mappa = mappa;
	}
	
	
	
}
