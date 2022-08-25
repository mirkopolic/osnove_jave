package d23_08_2022;

public class Racun {
	private String broj;
	private String punoIme;
	private double stanje;

	public Racun(String broj, String punoIme, double stanje) {
		this.broj = broj;
		this.punoIme = punoIme;
		this.stanje = stanje;
	}

	public String getBroj() {
		return broj;
	}

	public void setBroj(String broj) {
		this.broj = broj;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public double getStanje() {
		return stanje;
	}

	// Uslov da li ima dovoljno sredstava na racunu sa koga se placa se
	// proverava u metodi izvrsiTransakciju u klasi Transakcija
	public void promenaStanja(double iznos) {
					this.stanje += iznos;
			}

	public void stampajRn() {
		System.out.println(this.punoIme + " - " + this.broj);
		System.out.println(this.stanje + " rsd");
		System.out.println();
	}
}
