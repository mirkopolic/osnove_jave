package d25_08_2022;

public class Zadatak1 {
//	Napisati klasu Student koja ima
//	broj indeksa
//	ime i prezime
//	tip studija (osnovne, master, doktorske)
//	niz ispita
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za indeks, ime i prezime, tip studija
//	getter za niz predmeta
//	metodu dodaj ispit u niz ispita
//	metodu koja racuna prosek na studijama (u prosek se ubrajaju samo polozeni ispiti)
//	metodu stampaj koja stampa u formatu:
//	(broj indeksa) - (ime i prezime) - (tip studija)
//	Predmeti:
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	(naziv predmeta) - (profesor) - (ocena)
//	Prosecna ocena: (prosecna ocena)
//
//
//	Napisati klasu Ispit koja ima
//	naziv predmeta
//	ocenu (u rasponu od 5 do 10)
//	Ime i prezime profesora koji predaje predmet
//	konstuktore koje mislite da ce vam trebati
//	gettere i settere za sve atribute
//	metodu koja kaze da li je ispit polozen (polozen je ako je ocena od 6 do 10)
//	metodu koja stampa ispit u formatu:
//	(naziv predmeta) - (profesor) - (ocena)


	public static void main(String[] args) {

		Ispit is1 = new Ispit("JOOP", 8, "Marko Markovic");
		Ispit is2 = new Ispit("OOS", 9, "Janko Jankovic");
		Ispit is3 = new Ispit("KOOP", 5, "Nenad Nenadovic");
		Ispit is4 = new Ispit("SSS", 10, "Marko Markovic");
		Ispit is5 = new Ispit("JOOP 2", 8, "Marko Markovic");
		Ispit is6 = new Ispit("Nesto", 8, "Marko Markovic");
		Ispit is7 = new Ispit("Isto nesto", 9, "Janko Jankovic");
		Ispit is8 = new Ispit("Nista", 5, "Nenad Nenadovic");
		Ispit is9 = new Ispit("Manje nista", 10, "Marko Markovic");
		Ispit is10 = new Ispit("Dokle vise", 5, "Marko Markovic");

		Student mirko = new Student("1015", "Mirko Polic", "master");
		Student milena = new Student("1045", "Milena Milena", "doktorske");

		mirko.dodajIspit(is1);
		mirko.dodajIspit(is3);
		mirko.dodajIspit(is5);
		mirko.dodajIspit(is6);
		mirko.dodajIspit(is7);

		milena.dodajIspit(is9);
		milena.dodajIspit(is8);
		milena.dodajIspit(is2);
		milena.dodajIspit(is4);
		milena.dodajIspit(is10);

		mirko.stampaj();
		System.out.println();
		milena.stampaj();

		System.out.println();

	}

}
