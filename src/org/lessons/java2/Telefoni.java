package org.lessons.java2;

public class Telefoni extends Prodotto {

	int codiceImei;

	int memoria;
	
	//Costruttore Telefoni
	
	public Telefoni(String nome, String marca, int prezzo, int codiceImei, int memoria) {
		super(nome, marca, prezzo);
		this.codiceImei = codiceImei;
		this.memoria = memoria;
	}

	public int getCodiceImei() {
		return codiceImei;
	}

	public void setCodiceImei(int codiceImei) {
		this.codiceImei = codiceImei;
	}

	public int getMemoria() {
		return memoria;
	}

	public void setMemoria(int memoria) {
		this.memoria = memoria;
	}

}