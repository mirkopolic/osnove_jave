package d06_09_2022.zadatak2;

public class Alpinista extends Planinar {

	private int poeni;
	private int maxUspon;

	public Alpinista(int id, String punoIme) {
		super(id, punoIme);
		this.maxUspon = 4000;
		this.poeni = 0;
	}

	public int getPoeni() {
		return poeni;
	}

	public void setPoeni(int poeni) {
		this.poeni = poeni;
	}

	public int getMaxUspon() {
		return maxUspon;
	}

	@Override
	public void stampaj() {
		System.out.println("Alpinista, id: " + this.getId());
		System.out.println("Ime: " + this.getPunoIme());
		System.out.println("Broj poena: " + this.getPoeni());
		System.out.println();
	}

	@Override
	public double clanarina() {
		return 1500 - this.poeni * 50;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		return (planina.getVisina() <= this.getMaxUspon());
	}

}
