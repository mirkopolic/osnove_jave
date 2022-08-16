package d15_08_2022;

import java.util.Scanner;

public class Zadatak2 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.println();
		s.close();

		System.out.println("Ime i prezime: " + spojiImeIPrezime(ime, prezime));		
		
//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");

	}

	public static String spojiImeIPrezime(String prosledjenoIme, String prosledjenoPrezime) {
		return prosledjenoIme + " " + prosledjenoPrezime;
	}
}
