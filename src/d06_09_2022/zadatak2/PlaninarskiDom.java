package d06_09_2022.zadatak2;

import java.util.ArrayList;

public class PlaninarskiDom {
	private String naziv;
	private int godinaOsnivanja;
	private ArrayList<Planinar> clanovi = new ArrayList<Planinar>();

	public PlaninarskiDom() {
		super();
	}

	public PlaninarskiDom(String naziv, int godinaOsnivanja) {
		super();
		this.naziv = naziv;
		this.godinaOsnivanja = godinaOsnivanja;
	}

	public String getNaziv() {
		return naziv;
	}

	public int getGodinaOsnivanja() {
		return godinaOsnivanja;
	}

	public void uclaniPlaninara(Planinar planinar) {
		this.clanovi.add(planinar);
	}

	public int uspesnoCeSePopeti(Planina planina) {
		int brojac = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (this.clanovi.get(i).uspesanUspon(planina)) {
				brojac++;
			}
		}
		return brojac;
	}

	public void izbaciPlaninara(int id) {
		for (int i = 0; i < this.clanovi.size(); i++) {
			if (this.clanovi.get(i).getId() == id) {
				this.clanovi.remove(i);
				break;
			}
		}
	}

	public void stampajDom() {
		System.out.println("Dom: " + this.getNaziv() + " - Osnovan: " + this.getGodinaOsnivanja() + " god.");
		System.out.println("Mesecni prihod od clanarine, iznosi: " + this.mesecniPrihod());
		System.out.println();
		System.out.println("Clanovi:");
		for (int i = 0; i < this.clanovi.size(); i++) {
			this.clanovi.get(i).stampaj();
		}
	}

	public int mesecniPrihod() {
		int prihod = 0;
		for (int i = 0; i < this.clanovi.size(); i++) {
			prihod += this.clanovi.get(i).clanarina();
		}
		return prihod;
	}
}
