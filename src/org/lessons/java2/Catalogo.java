package org.lessons.java2;

import java.util.Scanner;

public class Catalogo {

	public static void main(String[] args) {
		
		///Prodotto[] prodotti = new Prodotto[]; // da implementare con richiesta ad utente;

		Scanner s = new Scanner(System.in);

		System.out.println("Vuoi inserire un telefono, cuffie o televisori?");

		String scelta = s.nextLine();

		if (scelta.equals("telefono")) {

			System.out.println("Inserisci nome");

			String nome = s.nextLine();

			System.out.println("Inserisci marca");

			String marca = s.nextLine();

			System.out.println("Inserisci prezzo");

			int prezzo = s.nextInt();

			System.out.println("Inserisci Imei");

			int imei = s.nextInt();

			System.out.println("Inserisci memoria");

			int memoria = s.nextInt();

			Telefoni telefono = new Telefoni(nome,marca,prezzo,imei,memoria);
			
			System.out.println("ecco il telefono" + telefono);

		}else if (scelta.equals("cuffie")){
			
			System.out.println("Inserisci nome");

			String nome = s.nextLine();

			System.out.println("Inserisci marca");

			String marca = s.nextLine();

			System.out.println("Inserisci prezzo");

			int prezzo = s.nextInt();

			System.out.println("Inserisci colore");

			String colore = s.nextLine();
			
			System.out.println("è wireless?");
			
			boolean b = s.nextBoolean();

			Cuffie c = new Cuffie(nome,marca,prezzo,colore,b);
			
			System.out.println("ecco il telefono" + c);
			
		}

	}

}

