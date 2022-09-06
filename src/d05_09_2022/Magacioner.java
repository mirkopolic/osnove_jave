package d05_09_2022;

public class Magacioner extends Radnik {

	public Magacioner(String punoIme) {
		super(punoIme);
	}

	@Override
	public double plata() {
		return this.prosecnaPlata() * this.nizSektora.size()*0.5;
	}

	private double prosecnaPlata() {
		double suma = 0.0;
		for (int i = 0; i < this.nizSektora.size(); i++) {
			suma += this.nizSektora.get(i).getPlata();
		}
		return 1.0*suma / this.nizSektora.size();
	}

}
