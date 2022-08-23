package d22_08_2022;

public class Proizvod {

	private String sifra;
	private String naziv;
	private double cenaPoKg;

	public Proizvod(String sifra, String naziv, double cenaPoKg) {
		this.sifra = sifra;
		this.naziv = naziv;
		this.cenaPoKg = cenaPoKg;

	}

	public String getSifra() {
		return sifra;
	}

	public void setSifra(String sifra) {
		this.sifra = sifra;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public void setCenaPoKg(double cenaPoKg) {
		this.cenaPoKg = cenaPoKg;
	}

	public double getCenaKg() {
		return this.cenaPoKg;
	}

	public double getCenaLb() {
		return this.cenaPoKg / 2.2046;
	}

	public void stampajProizvod() {
		System.out.println(this.naziv + " - " + this.sifra);
	}

}
