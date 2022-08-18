package d16_08_2022;

public class SmartAirConditioning {
	String markaKlime;
	int izabranaTemperatura;
	String mod;

	public void stampaj() {
		System.out.println("Klima uredjaj marke " + this.markaKlime + ", je u modu za " + this.mod);
		System.out.println("Izabrana temperatura je: " + this.izabranaTemperatura + "C");
	}

	public boolean temperatura(int spoljasnjaTemperatura) {
		return spoljasnjaTemperatura > this.izabranaTemperatura;
	}
}
