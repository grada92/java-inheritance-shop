package org.lessons.java2;

public class Cuffie extends Prodotto {

	String colore;
	boolean isWireless = true;
	
	//Costruttore Cuffie
	
	public Cuffie(String nome, String marca, int prezzo, String colore, boolean isWireless) {
		super(nome, marca, prezzo);
		this.colore = colore;
		this.isWireless = isWireless;
	}


	public void setColore(String colore) {
		this.colore = colore;
	}
	
	public String getColore() {
		return colore;
	}

	public boolean isWireless() {
		return isWireless;
	}

	public void setWireless(boolean isWireless) {
		this.isWireless = isWireless;
	}

}

