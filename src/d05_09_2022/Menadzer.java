package d05_09_2022;

public class Menadzer extends Radnik {

	public Menadzer(String punoIme) {
		super(punoIme);
	}

	@Override
	public double plata() {
		double suma = 0.0;
		for (int i = 0; i < this.nizSektora.size(); i++) {
			suma += this.nizSektora.get(i).getPlata();
		}
		return suma;
	}

}
