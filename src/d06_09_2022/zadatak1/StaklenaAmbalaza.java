package d06_09_2022.zadatak1;

public class StaklenaAmbalaza extends Ambalaza {
	private double kaucijaIznos;
	private boolean kaucija;

	public StaklenaAmbalaza(String barkod, String nazivArtikla, double netoTezina, double brutoTezina,
			double kaucijaIznos, boolean kaucija, double osnovnaCena) {
		super(barkod, nazivArtikla, netoTezina, brutoTezina, osnovnaCena);
		this.kaucijaIznos = kaucijaIznos;
		this.kaucija = kaucija;
	}

	public double getKaucijaIznos() {
		return kaucijaIznos;
	}

	public boolean isKaucija() {
		return kaucija;
	}

	@Override
	public double cenaArtikla() {
		return (this.isKaucija()) ? this.getOsnovnaCena() * 1.2 + this.getKaucijaIznos() : this.getOsnovnaCena();
	}

	@Override
	public void stampaj() {
		System.out.println(this.getBarkod());
		System.out.println(
				this.getNazivArtikla() + " - Neto: " + this.getNetoTezina() + " - Bruto: " + this.getBrutoTezina());
		System.out.println("Tezina: " + this.tezinaPakovanja());
		System.out.println("Iznos kaucije: " + this.getKaucijaIznos());
		System.out.println("Cena artikla je: " + this.cenaArtikla() + " RSD");
		System.out.println();
	}

}
