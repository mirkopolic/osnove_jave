package d06_09_2022.zadatak1;

public class Tetrapak extends Ambalaza {
	private boolean reciklaza;

	public Tetrapak(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, boolean reciklaza,
			double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina, osnovnaCena);
		this.reciklaza = reciklaza;
		this.osnovnaCena = osnovnaCena;
	}

	public boolean isReciklaza() {
		return reciklaza;
	}

	public void setReciklaza(boolean reciklaza) {
		this.reciklaza = reciklaza;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public void setOsnovnaCena(double osnovnaCena) {
		this.osnovnaCena = osnovnaCena;
	}

	@Override
	public double cenaArtikla() {
		return (this.isReciklaza() ? this.tezinaPakovanja() * 1.5 + this.getOsnovnaCena() : this.getOsnovnaCena());
	}

	@Override
	public void stampaj() {
		System.out.println(this.getBarkod());
		System.out.println(
				this.getNazivArtikla() + " - Neto: " + this.getNetoTezina() + " - Bruto: " + this.getBrutoTezina());
		System.out.println("Tezina: " + this.tezinaPakovanja());
		if (this.isReciklaza()) {
			System.out.println("Ambalaza je od recikliranog materijala.");
		} else {
			System.out.println("Ambalaza nije od recikliranog materijala.");
		}
		System.out.println("Cena artikla je: " + this.cenaArtikla() + " RSD");
		System.out.println();

	}

}
