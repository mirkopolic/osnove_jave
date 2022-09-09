package d06_09_2022.zadatak2;

public class RekreativniPlaninar extends Planinar {

	private int tezinaOpreme;
	private String okrug;
	private int maxUspon;

	public RekreativniPlaninar(int id, String punoIme, int tezinaOpreme, String okrug) {
		super(id, punoIme);
		this.maxUspon = 2000;
		this.okrug=okrug;
		this.tezinaOpreme=tezinaOpreme;
	}

	public int getTezinaOpreme() {
		return tezinaOpreme;
	}

	public String getOkrug() {
		return okrug;
	}

	public int getMaxUspon() {
		return maxUspon;
	}

	@Override
	public void stampaj() {
		System.out.println("Rekreativac, id: " + this.getId());
		System.out.println("Ime: " + this.getPunoIme());
		System.out.println("Okrug: " + this.getOkrug());
		System.out.println();
	}

	@Override
	public double clanarina() {
		return 1000;
	}

	@Override
	public boolean uspesanUspon(Planina planina) {
		return (planina.getVisina() <= 2000 - this.getTezinaOpreme() * 50);
	}

}
