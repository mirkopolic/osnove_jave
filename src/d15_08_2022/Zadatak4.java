package d15_08_2022;

import java.util.Scanner;

public class Zadatak4 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite JMBG: ");
		String JMBG = s.next();
		System.out.print("Unesite ime: ");
		String ime = s.next();
		System.out.print("Unesite prezime: ");
		String prezime = s.next();
		System.out.print("Unesite godinu rodjenja: ");
		int godinaRodjenja = s.nextInt();
		System.out.print("Unesite da li je korisnik aktivan (true/false): ");
		boolean aktivan = s.nextBoolean();
		System.out.println();
		s.close();

		stampajPodatke(JMBG, ime, prezime, godinaRodjenja, aktivan);

//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");

	}

	public static void stampajPodatke(String JMBG, String Ime, String Prezime, int GodinaRodjenja, boolean aktivan) {
		System.out.println("JMBG: " + JMBG);
		System.out.println("Ime: " + Ime);
		System.out.println("Prezime: " + Prezime);
		System.out.println("God. rodjenja: " + GodinaRodjenja);
		System.out.println("Aktivan: " + aktivan);
	}
}
