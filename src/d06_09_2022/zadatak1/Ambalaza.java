package d06_09_2022.zadatak1;

public abstract class Ambalaza {
	protected String barkod;
	protected String nazivArtikla;
	protected double netoTezina;
	protected double brutoTezina;
	protected double osnovnaCena;

	public Ambalaza() {
		super();
	}

	public Ambalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina, double osnovnaCena) {
		super();
		this.barkod = barkod;
		this.nazivArtikla = nazivArtikla;
		this.netoTezina = netoTezina;
		this.brutoTezina = brutoTezina;
		this.osnovnaCena=osnovnaCena;
	}

	public String getBarkod() {
		return barkod;
	}

	public String getNazivArtikla() {
		return nazivArtikla;
	}

	public double getNetoTezina() {
		return netoTezina;
	}

	public double getBrutoTezina() {
		return brutoTezina;
	}

	public double getOsnovnaCena() {
		return osnovnaCena;
	}

	public double tezinaPakovanja() {
		return this.getBrutoTezina() - this.getNetoTezina();
	}

	public abstract double cenaArtikla();

	public abstract void stampaj();
}
