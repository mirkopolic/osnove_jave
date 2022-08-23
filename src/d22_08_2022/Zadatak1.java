package d22_08_2022;

import java.util.ArrayList;

public class Zadatak1 {
//	Kreirati klasu Autor koja ima
//	-ime i prezime
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu:
//	(ime autora) (prezime autora)
//
//	Kreirati klasu Knjiga koji ima:
//	-ISBN
//	-naziv
//	-godina izdanja
//	-autor
//	-konstuktore koje mislite da su vam potrebni
//	-gettere i settere za atribute
//	-metodu print koja stampa u formatu (izbegavati dupliranje koda):
//	(ISBN)
//	(naziv) - (godina izdanja)
//	autor: (ime autora) (prezime autora) 
//
//		U glavnom programu napraviti vise autora sa vise knjiga.


	public static void main(String[] args) {

		Autor a1 = new Autor("Ivo", "Andric");
		Autor a2 = new Autor("Borislav", "Pekic");
		Autor a3 = new Autor("Milos", "Crnjanski");

		Knjiga k1 = new Knjiga("6546546544654", "Na Drini cuprija", 1945, a1);
		Knjiga k2 = new Knjiga("654454451321", "Seobe", 1929, a3);
		Knjiga k3 = new Knjiga("32154687684", "Roman o Londonu", 1971, a3);
		Knjiga k4 = new Knjiga("48494432132", "Zlatno runo I&II", 1978, a2);
		Knjiga k5 = new Knjiga("713213246", "Besnilo", 1983, a2);
		Knjiga k6 = new Knjiga("3213213247", "Vreme cuda", 1965, a2);
		Knjiga k7 = new Knjiga("54797654632", "Travnicka hronika", 1945, a1);

		ArrayList<Autor> listaAutora = new ArrayList<Autor>();
		listaAutora.add(a1);
		listaAutora.add(a2);
		listaAutora.add(a3);

		ArrayList<Knjiga> listaKnjiga = new ArrayList<Knjiga>();
		listaKnjiga.add(k1);
		listaKnjiga.add(k2);
		listaKnjiga.add(k3);
		listaKnjiga.add(k4);
		listaKnjiga.add(k5);
		listaKnjiga.add(k6);
		listaKnjiga.add(k7);

		for (int i = 0; i < listaAutora.size(); i++) {
			listaAutora.get(i).stampajAutora();
			for (int j = 0; j < listaKnjiga.size(); j++) {
				if (listaKnjiga.get(j).getAutor() == listaAutora.get(i)) {
					listaKnjiga.get(j).stampajKnjigu();
				}
			}
		}
		System.out.println();

	}

}
