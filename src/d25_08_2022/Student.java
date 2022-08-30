package d25_08_2022;

import java.util.ArrayList;

public class Student {
	private String brojIndeksa;
	private String punoIme;
	private String tipStudija;
	private ArrayList<Ispit> ispiti = new ArrayList<Ispit>();

	public Student(String brojIndeksa, String punoIme, String tipStudija) {
		super();
		this.brojIndeksa = brojIndeksa;
		this.punoIme = punoIme;
		this.tipStudija = tipStudija;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public String getTipStudija() {
		return tipStudija;
	}

	public void setTipStudija(String tipStudija) {
		this.tipStudija = tipStudija;
	}

	public ArrayList<Ispit> getIspiti() {
		return ispiti;
	}

	public void dodajIspit(Ispit ispit) {
		this.ispiti.add(ispit);
	}

	public double prosek() {
		int sum = 0;
		int brojac = 0;
		for (int i = 0; i < this.ispiti.size(); i++) {
			if (this.ispiti.get(i).getOcena() > 5) {
				sum += this.ispiti.get(i).getOcena();
				brojac++;
			}
		}
		return 1.0 * sum / brojac;
	}

	public void stampaj() {
		System.out.println(this.brojIndeksa + " - " + this.punoIme + " - " + this.tipStudija);
		System.out.println("Predmeti:");
		for (int i = 0; i < this.ispiti.size(); i++) {
			this.ispiti.get(i).stampajIspit();
		}
		System.out.println("Prosecna ocena: " + this.prosek());
	}
}
