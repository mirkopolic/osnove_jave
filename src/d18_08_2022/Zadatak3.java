package d18_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {

		Footer footer = new Footer();// Stampa KRAJ PROGRAMA!

		SmartAirConditioning prvi = new SmartAirConditioning();
		prvi.marka = "Samsung";
		prvi.potrosnjaHladjenje = 1.0;
		prvi.potrosnjaGrejanje = 2.0;
		prvi.izabranaTemperatura = 18;
		prvi.mod = "hladjenje";

		SmartAirConditioning drugi = new SmartAirConditioning();
		drugi.marka = "Toshiba";
		drugi.potrosnjaHladjenje = 0.8;
		drugi.potrosnjaGrejanje = 0.1;
		drugi.izabranaTemperatura = 28;
		drugi.mod = "grejanje";

		prvi.print();
		drugi.print();

//-----------------------------------------
		footer.print();
	}

}
