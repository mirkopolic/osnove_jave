package d16_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		SmartAirConditioning prvi = new SmartAirConditioning();
		prvi.markaKlime = "Samsung";
		prvi.izabranaTemperatura = 22;
		int spoljasnjaTemperatura = 32;

		if (prvi.temperatura(spoljasnjaTemperatura)) {
			prvi.mod = "hladjenje";
		} else {
			prvi.mod = "grejanje";
		}

		prvi.stampaj();

		footer();
	}

	public static void footer() {
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}
}
