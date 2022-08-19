package d18_08_2022;

public class SmartAirConditioning {

	public String marka;
	public double potrosnjaHladjenje;
	public double potrosnjaGrejanje;
	public int izabranaTemperatura;
	public String mod;

	public void print() {
		System.out.println(this.marka + " - " + this.mod + " - " + this.izabranaTemperatura);
		System.out.println("Mesecna potrosnja: " + this.mesecnaPotrosnja() + " kW/h");
		System.out.println("Cena mesecne potrosnje: " + this.mesecnaCena() + " RSD");
		System.out.println();
	}

	public double mesecnaPotrosnja() {
		if (this.mod.equals("hladjenje")) {
			return 30 * 15 * this.potrosnjaHladjenje;
		} else {
			return 30 * 15 * this.potrosnjaGrejanje;
		}
	}

	public double mesecnaCena() {
		if (mesecnaPotrosnja() >= 350) {
			return 350 * 6 + (mesecnaPotrosnja() - 350) * 9;
		} else {
			return mesecnaPotrosnja() * 6;
		}
	}

}
