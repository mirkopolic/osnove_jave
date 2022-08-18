package d16_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {

		Proizvod prvi = new Proizvod();
		prvi.naziv = "Cigla";
		prvi.cena = 204.50;
		prvi.tezinaUGramima = 3200;

		Proizvod drugi = new Proizvod();
		drugi.naziv = "Kosilica";
		drugi.cena = 35600.0;
		drugi.tezinaUGramima = 43250.0;

		System.out.println();
		prvi.stampaj(prvi.konvertuj("kg"), "kg");
		prvi.stampaj(prvi.konvertuj("t"), "t");
		System.out.println();
		drugi.stampaj(drugi.konvertuj("kg"), "kg");
		drugi.stampaj(drugi.konvertuj("t"), "t");
		
		footer();
	}

	public static void footer() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

}
