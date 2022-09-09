package d06_09_2022.zadatak1;

public class SuperKartica {
	private String broj;
	private String punoIme;
	private int popust;

	public SuperKartica() {
		super();
	}

	public SuperKartica(String broj, String punoIme, int popust) {
		super();
		this.broj = broj;
		this.punoIme = punoIme;
		this.popust = popust;
	}

	public String getBroj() {
		return broj;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public int getPopust() {
		return popust;
	}

	public void stampajKarticu() {
		System.out.println(this.getBroj() + " - " + this.getPunoIme());
	}
}
