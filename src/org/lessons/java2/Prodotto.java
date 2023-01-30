package org.lessons.java2;

import java.util.Random;

public class Prodotto {

	private int codice;
	String nome;
	String marca;
	int prezzo;
	int iva;
	Random r = new Random();
	
	//Costruttore Prodotto
	public Prodotto(String nome, String marca, int prezzo) {
		super();
		this.nome = nome;
		this.marca = marca;
		this.prezzo = prezzo;
		this.codice=r.nextInt(1000);
		this.iva = (this.prezzo * 22) /100;
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		if (this.nome != "") {
			this.nome = nome;
		}

	}
	

	public int getCodice() {
		return this.codice;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		if (this.marca != "") {
			this.marca = marca;
		}
	}

	public int getPrezzo() {
		return prezzo;
	}

	public void setPrezzo(int prezzo) {

		if (this.prezzo > 0) {
			this.prezzo = prezzo;
		}

	}

	public double getIva() {
		return this.iva;
	}

	double prezzoSenzaIva() {
		return this.prezzo;
	}

	double prezzoConIva() {
		return this.prezzo +  this.iva;
	}

	@Override
	public String toString() {
		return " Codice Prodotto: " + codice + " Nome: " + nome + " Marca: " + marca + " Prezzo con Iva: "
				+ prezzoConIva() + " euro";

	}
}