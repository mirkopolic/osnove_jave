package d26_08_2022;

public class Trener extends Osoba {
	private int godIskustva;
	private String tip;

	public Trener() {
		super();
	}

	public Trener(String punoIme, String jmbg, int godRodjenja, int godIskustva, String tip) {
		super(punoIme, jmbg, godRodjenja);
		this.godIskustva = godIskustva;
		this.tip = tip;
	}

	public int getGodIskustva() {
		return godIskustva;
	}

	public void setGodIskustva(int godIskustva) {
		this.godIskustva = godIskustva;
	}

	public String getTip() {
		return tip;
	}

	public void setTip(String tip) {
		this.tip = tip;
	}
	
	@Override
	public void stampajOsobu() {
		super.stampajOsobu();
		System.out.println("Godina iskustva: " + this.godIskustva + " - Tip trenera: " + this.tip);
		System.out.println();
	}

}
