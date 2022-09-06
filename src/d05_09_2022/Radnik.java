package d05_09_2022;

import java.util.ArrayList;

public abstract class Radnik {
	protected String punoIme;
	protected ArrayList<Sektor> nizSektora = new ArrayList<Sektor>();

	public Radnik(String punoIme) {
		super();
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public abstract double plata();

	public void zaposliUSektor(Sektor sektor) {
		this.nizSektora.add(sektor);
	}

	public void stampaj() {
		System.out.println(this.getPunoIme() + " ima ukupnu platu: " + this.plata());
		System.out.println();
	}
}
