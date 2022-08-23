package d22_08_2022;

public class Vaga {

	private String mernaJedinica;
	private Proizvod proizvod;

	public Vaga() {

	}

	public String getMernaJedinica() {
		return mernaJedinica;
	}

	public void setMernaJedinica(String mernaJedinica) {
		this.mernaJedinica = mernaJedinica;
	}

	public Proizvod getProizvod() {
		return proizvod;
	}

	public void setProizvod(Proizvod proizvod) {
		this.proizvod = proizvod;
	}

	public double sracunajCenu(double tezinaP) {
		if (this.mernaJedinica.equals("kg")) {
			return tezinaP * proizvod.getCenaKg();
		} else {
			return tezinaP * proizvod.getCenaLb();
		}
	}

	public void stampaj(double tezina) {
		System.out.println(proizvod.getSifra() + " - " + proizvod.getNaziv());
		if (this.mernaJedinica.equals("kg")) {
			System.out.println(proizvod.getCenaKg() + " (" + this.mernaJedinica + ") x " + tezina);
			System.out.println("Ukupna cena: " + this.sracunajCenu(tezina));
		} else {
			System.out.println(proizvod.getCenaLb() + " (" + this.mernaJedinica + ") x " + tezina);
			System.out.println("Ukupna cena: " + this.sracunajCenu(tezina));
		}
		System.out.println();
	}

}
