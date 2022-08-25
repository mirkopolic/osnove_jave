package d23_08_2022;

public class Transakcija {
	private int id;
	private Racun salje;
	private Racun prima;

	public Transakcija() {
		super();
	}

	public Transakcija(int id, Racun salje, Racun prima) {
		super();
		this.id = id;
		this.salje = salje;
		this.prima = prima;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Racun getSalje() {
		return salje;
	}

	public void setSalje(Racun salje) {
		this.salje = salje;
	}

	public Racun getPrima() {
		return prima;
	}

	public void setPrima(Racun prima) {
		this.prima = prima;
	}

	private double provizija(double iznos) {
		if (iznos <= 4500.00) {
			return 45;
		}
		return iznos * 0.01;
	}
//Metoda vraca true ako se izvrsila, a false ako nije
//Mogli smo i da u klasu dodamo boolean argument koji bi cuvao vrednost o izvrsenju metode 
	public boolean izvrsiTransakciju(double iznos) {
		if (this.salje.getStanje() >= iznos + this.provizija(iznos)) {
			this.salje.promenaStanja((iznos + this.provizija(iznos)) * -1);
			this.prima.promenaStanja(iznos);
			return true;
		}
		return false;
	}

	public void stampajTransakciju() {
		System.out.println("ID transakcije: " + this.id);
		System.out.println("Placa: " + this.salje.getPunoIme() + " - " + this.salje.getBroj() + " - Novo stanje: "
				+ this.getSalje().getStanje());
		System.out.println("Prima: " + this.prima.getPunoIme() + " - " + this.prima.getBroj() + " - Novo stanje: "
				+ this.getPrima().getStanje());
		System.out.println("----------------------");
	}

}
