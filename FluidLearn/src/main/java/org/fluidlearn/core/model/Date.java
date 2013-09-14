package org.fluidlearn.core.model;

public class Date {
	
	private String giorno;
	private String mese;
	private String anno;
	
	public Date(String giorno, String mese, String anno) {
		this.giorno = giorno;
		this.mese = mese;
		this.anno = anno;
	}
	
	public Date() {
		this(null, null, null);
	}

	public String getGiorno() {
		return giorno;
	}

	public void setGiorno(String giorno) {
		this.giorno = giorno;
	}

	public String getMese() {
		return mese;
	}

	public void setMese(String mese) {
		this.mese = mese;
	}

	public String getAnno() {
		return anno;
	}

	public void setAnno(String anno) {
		this.anno = anno;
	}
	
	

}
