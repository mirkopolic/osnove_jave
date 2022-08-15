package v_15_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite znak karte na stolu: ");
		String znakKarteNaStolu = s.next();
		System.out.print("Unesite broj karte na stolu: ");
		String brojKarteNaStolu = s.next();
		System.out.println("Poslednja karta na stolu je sad: " + brojKarteNaStolu + " " + znakKarteNaStolu);
		System.out.println();

		String znakOdigraneKarte, brojOdigraneKarte;
		boolean potez = true;

		while (potez) {
			System.out.println("Sledeci potez");

			System.out.print("Unesite znak: ");
			znakOdigraneKarte = s.next();
			System.out.print("Unesite broj: ");
			brojOdigraneKarte = s.next();
			System.out.println();
// Nisam siguran za pravila, ali pretpostavka je da je nevalidan potez kada se baci identicna karta
// ili kada su i znak i broj različiti
			if (znakKarteNaStolu.equals(znakOdigraneKarte)) {
				if (brojKarteNaStolu.equals(brojOdigraneKarte)) {
					potez = false;
				}
			} else if (!brojKarteNaStolu.equals(brojOdigraneKarte)) {
				potez = false;
			}

			if (potez) {
				znakKarteNaStolu = znakOdigraneKarte;
				brojKarteNaStolu = brojOdigraneKarte;

				System.out.println("Potez je validan");
				System.out.print("Poslednja karta na stolu je sad: " + brojKarteNaStolu + " " + znakKarteNaStolu);
				System.out.println();
				System.out.println();
			}
		}
		System.out.println("Nevalidan potez. Kraj igre.");

//-----------------------------------------------------------		
		s.close();
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");

	}

}
