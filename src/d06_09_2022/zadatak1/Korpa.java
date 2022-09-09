package d06_09_2022.zadatak1;

import java.util.ArrayList;

public class Korpa {
	private ArrayList<Ambalaza> nizAmb = new ArrayList<Ambalaza>();
	private SuperKartica kartica;

	public Korpa(SuperKartica kartica) {
		super();
		this.kartica = kartica;
	}

	public SuperKartica getKartica() {
		return kartica;
	}

	public void dodajAmbalazu(Ambalaza artikal) {
		this.nizAmb.add(artikal);
	}

	public void izbaciAmbalazu(String barkod) {

		for (int i = 0; i < this.nizAmb.size(); i++) {
			if (this.nizAmb.get(i).getBarkod() == barkod) {
				this.nizAmb.remove(i);
				break;
			}
		}
	}

	private double cenaSvihAmbalaza() {
		double cena = 0.0;
		for (int i = 0; i < this.nizAmb.size(); i++) {
			cena += this.nizAmb.get(i).cenaArtikla();
		}
		return cena;
	}
	
	private double cenaSvihAmbalazaSaPopustom(int popust) {
		double cena = 0.0;
		for (int i = 0; i < this.nizAmb.size(); i++) {
			cena += this.nizAmb.get(i).cenaArtikla();
		}
		return cena - popust;
	}

	public double cenaKorpe(SuperKartica kartica) {

		return this.cenaSvihAmbalazaSaPopustom(this.getKartica().getPopust());
	}
	
	public void stampajKorpu() {
		for (int i = 0; i < this.nizAmb.size(); i++) {
			this.nizAmb.get(i).stampaj();
		}
		System.out.println("Ukupna cena: " + this.cenaSvihAmbalaza());
		System.out.println("Popust: " + this.getKartica().getPopust());
		System.out.println("-------------------");
		System.out.println("Ukupna cena sa popustom: " + this.cenaKorpe(this.getKartica()));
	}
}
