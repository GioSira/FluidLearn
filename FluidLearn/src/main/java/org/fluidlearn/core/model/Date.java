package org.fluidlearn.core.model;


public class Date {
	
	private int giorno;
	private int mese;
	private int anno;
	private java.util.Date ora;
	
	public Date(int giorno, int mese, int anno, java.util.Date ora) {
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
		this.ora = ora;
	}
	
	public Date() {
		this(0, 0, 0, null);
	}

	public int getGiorno() {
		return giorno;
	}

	public void setGiorno(int i) {
		this.giorno = i;
	}

	public int getMese() {
		return mese;
	}

	public void setMese(int mese) {
		this.mese = mese;
	}

	public int getAnno() {
		return anno;
	}

	public void setAnno(int anno) {
		this.anno = anno;
	}

	public java.util.Date getOra() {
		return ora;
	}

	public void setOra(java.util.Date date) {
		this.ora = date;
	}

	public boolean isLessThan(Date dataScadenza) {
		
		if(this.anno > dataScadenza.anno)
			return false;
		else {
			if(this.mese > dataScadenza.mese)
				return false;
			else {
				if(this.giorno > dataScadenza.giorno)
					return false;
				else
					return true;
			}
		}
	}
	
	

}
