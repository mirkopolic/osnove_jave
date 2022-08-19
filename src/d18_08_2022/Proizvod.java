package d18_08_2022;

public class Proizvod {
	public String naziv;
	public double cena;
	public double tezinaGr;

	public void stampaj() {
		System.out.println(this.naziv + ", " + this.cena + ", " + this.tezinaGr + "gr");
	}

	public void povecajCenu(int povecanje) {
		this.cena *= (1 + povecanje / 100.00);
	}

	public double vratiCenuSaPopustom(int popust) {
		return this.cena * (1 - popust / 100.00);
	}

	public int racunajPostarinu() {
		if (this.tezinaGr <= 100) {
			return 200;
		} else if (this.tezinaGr <= 500) {
			return 400;
		} else {
			return 1000;
		}
	}

}
