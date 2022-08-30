package d23_08_2022;

public class Ringla {
	private String tip;
	private int jacina;
	private double jacinaGrejaca;

	public Ringla(String tip, double jacinaGrejaca) {
		this.tip = tip;
		this.jacinaGrejaca = jacinaGrejaca;
		this.jacina = 0;
	}

	public int getJacina() {
		return jacina;
	}

	private int maxPojacaj() {
		if (this.tip.equals("obicna")) {
			return 3 - this.jacina;
		}
		return 9 - this.jacina;
	}

	public void pojacaj() {
		if (this.maxPojacaj() > 0) {
			this.jacina++;
		}
	}

	public void smanji() {
		if (this.jacina > 0) {
			this.jacina--;
		}
	}

	public void iskljuci() {
		this.jacina = 0;
	}

	public boolean ukljucena() {
		if (this.jacina > 0) {
			return true;
		}
		return false;
	}

	public double potrosnja(int vreme) {
		return 1.0 * 100 / this.maxPojacaj() * this.jacina * this.jacinaGrejaca * vreme;
	}

	public void stampajRinglu() {
		if (this.ukljucena()) {
			System.out.println("Ringla je ukljucena.");
		} else {
			System.out.println("Ringla je iskljucena.");
		}
		System.out.println("Tip ringle: " + this.tip);
		System.out.println("Jacina: " + this.jacina);
		System.out.println("Grejac: " + this.jacinaGrejaca);
		System.out.println();
	}
}
