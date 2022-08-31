package d26_08_2022;

import java.util.ArrayList;
import java.util.Scanner;

public class Zadatak1A {
	// (Za vezbanje) U glavnom programu kreirati niz igraca i niz trenera, na kraju
	// programa ispisati sve igrace i trenere. Podatke za igrace i trenere unosi
	// korisnik sa tastature.

	public static void main(String[] args) {

		ArrayList<Igrac> igraci = new ArrayList<Igrac>();
		ArrayList<Trener> treneri = new ArrayList<Trener>();
		Scanner s = new Scanner(System.in);

		System.out.print("Koliko igraca zelite da unesete: ");
		int n = s.nextInt();
		s.nextLine();

		for (int i = 0; i < n; i++) {
			System.out.print("Unesite ime: ");
			String igrIme = s.nextLine();
			System.out.print("Unesite jmbg: ");
			String igrJmbg = s.nextLine();
			System.out.print("Unesite godinu rodjenja: ");
			int igrGodRodjenja = s.nextInt();
			System.out.print("Unesite broj: ");
			int igrBroj = s.nextInt();
			System.out.print("Unesite poziciju: ");
			String igrPozicija = s.next();
			System.out.print("Da li je kapiten: ");
			boolean igrKapiten = s.nextBoolean();
			System.out.println();
			s.nextLine();
			igraci.add(new Igrac(igrIme, igrJmbg, igrGodRodjenja, igrBroj, igrPozicija, igrKapiten));
		}

		System.out.print("Koliko trenera zelite da unesete: ");
		int t = s.nextInt();
		s.nextLine();

		for (int i = 0; i < t; i++) {
			System.out.print("Unesite ime: ");
			String trIme = s.nextLine();
			System.out.print("Unesite jmbg: ");
			String trJmbg = s.nextLine();
			System.out.print("Unesite godinu rodjenja: ");
			int trGodRodjenja = s.nextInt();
			System.out.print("Unesite godine iskustva: ");
			int trGodinaIskustva = s.nextInt();
			System.out.print("Unesite tip trenera: ");
			String trTip = s.next();
			System.out.println();
			s.nextLine();
			treneri.add(new Trener(trIme, trJmbg, trGodRodjenja, trGodinaIskustva, trTip));
		}

		for (int i = 0; i < igraci.size(); i++) {
			igraci.get(i).stampajOsobu();
		}
		System.out.println();
		for (int i = 0; i < treneri.size(); i++) {
			treneri.get(i).stampajOsobu();
		}
		s.close();
	}

}
