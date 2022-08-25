package d23_08_2022;

import java.util.ArrayList;
//import java.util.Scanner;

public class Zadatak1 {

	public static void main(String[] args) {

		ArrayList<ZeleniKarton> zk = new ArrayList<ZeleniKarton>();

		zk.add(new ZeleniKarton("Mirko Polic", "1015", "JOOP", "Milan Jovanovic", 9));
		zk.add(new ZeleniKarton("Uros Urosevic", "1235", "Nesto", "Vladimir Minic", 5));
		zk.add(new ZeleniKarton("Nevena Markovicc", "1415", "JOOP", "Milan Jovanovic", 10));
		zk.add(new ZeleniKarton("Ana Dakic", "1025", "Isto nesto", "Jaov Ignjatovic", 8));
		zk.add(new ZeleniKarton("Jelena Peric", "1019", "Pa dokle vise", "Ivo Andric", 10));
		zk.add(new ZeleniKarton("Petar Petrovic", "2015", "ONO i DSZ", "No Djani", 5));
		zk.add(new ZeleniKarton("Marko Markovic", "1815", "Hahaha", "No Parti", 8));
		zk.add(new ZeleniKarton("Dragana Pantic", "1755", "Zasto vise", "Kari Pesic", 7));
		zk.add(new ZeleniKarton("Tea Katai", "1635", "Ko ovo smislja", "Milan Jovanovic", 5));
		zk.add(new ZeleniKarton("Milan Borjan", "1034", "Strasno", "Vladimir Minic", 9));
//Ovaj deo dole je petlja za dodavanje objekata preko skenera, ali budući da je naporno
//unositi 10 i više objekata preko skenera, a u svrhu testiranja rada zadatka, napravio sam 
// ovaj niz iznad
		
		
		
//		Scanner s = new Scanner(System.in);
//		String ime = "";
//		String indeks = "";
//		String predmet = "";
//		String profesor = "";
//		int grade = 5;
//		System.out.print("Unesite N ");
//		int n = s.nextInt();
//		s.nextLine();
//		
//		for (int i = 0; i < n; i++) {
//			System.out.print("Unesite ime i prezime studenta: ");
//			ime = s.nextLine();
//			System.out.print("Unesite broj indeksa studenta: ");
//			indeks = s.nextLine();
//			System.out.print("Unesite naziv predmeta: ");
//			predmet = s.nextLine();
//			System.out.print("Unesite ime i prezime profesora: ");
//			profesor = s.nextLine();
//			System.out.print("Unesite ocenu: ");
//			grade = s.nextInt();
//			zk.add(new ZeleniKarton(ime, indeks, predmet, profesor, grade));
//		}

		int zbirUkupni = 0;
		int zbirPolozili = 0;
		int brojacPolozili = 0;
		for (int i = 0; i < zk.size(); i++) {
			zk.get(i).stampaj();

			if (zk.get(i).getOcena() > 5) {
				zbirPolozili += zk.get(i).getOcena();
				brojacPolozili++;
			}
			zbirUkupni += zk.get(i).getOcena();
		}

		double prosecnaOcenaUkupna = 1.0 * zbirUkupni / zk.size();
		double prosecnaOcenaPolozili = 1.0 * zbirPolozili / brojacPolozili;

		System.out.println("Prosecna ocena za sve ispite je: " + prosecnaOcenaUkupna);
		System.out.println("Prosecna ocena za polozene ispite je: " + prosecnaOcenaPolozili);

		System.out.println("------------------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

}
//nizS.add(new Sastojak(sastojak, cena));
