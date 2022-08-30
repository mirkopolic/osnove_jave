package d25_08_2022;

import java.util.ArrayList;

public class Kombinacija {
	private String id;
	private ArrayList<Integer> kombinacija = new ArrayList<Integer>();

	public Kombinacija(String id, int a1, int a2, int a3, int a4, int a5, int a6, int a7) {
		this.id = id;
		this.kombinacija.add(a1);
		this.kombinacija.add(a2);
		this.kombinacija.add(a3);
		this.kombinacija.add(a4);
		this.kombinacija.add(a5);
		this.kombinacija.add(a6);
		this.kombinacija.add(a7);
	}

	public String getId() {
		return id;
	}

	public int getBrojevi1() {
		return kombinacija.get(0);
	}

	public int getBrojevi2() {
		return kombinacija.get(1);
	}

	public int getBrojevi3() {
		return kombinacija.get(2);
	}

	public int getBrojevi4() {
		return kombinacija.get(3);
	}

	public int getBrojevi5() {
		return kombinacija.get(4);
	}

	public int getBrojevi6() {
		return kombinacija.get(5);
	}

	public int getBrojevi7() {
		return kombinacija.get(6);
	}

	public boolean daLiJeIstaKombinacija(Kombinacija izvucena) {
		if ((this.getBrojevi1() == izvucena.getBrojevi1()) && (this.getBrojevi2() == izvucena.getBrojevi2())
				&& (this.getBrojevi3() == izvucena.getBrojevi3()) && (this.getBrojevi4() == izvucena.getBrojevi4())
				&& (this.getBrojevi5() == izvucena.getBrojevi5()) && (this.getBrojevi6() == izvucena.getBrojevi6())
				&& (this.getBrojevi7() == izvucena.getBrojevi7())) {
			return true;
		}
		return false;
	}
// metoda "pogodak" radi isto sto i "daLiJeIstaKombinacija"
	public boolean pogodak(Kombinacija izvucena) {
		int brojac = 0;
		for (int i = 0; i < 7; i++) {
			if (this.kombinacija.get(i) == izvucena.kombinacija.get(i)) {
				brojac++;
			}
		}
		return (brojac == 7) ? true : false;
	}

	public void stampajKombinaciju() {
		System.out.println("ID: " + this.id);
		System.out.print("Brojevi: " + this.kombinacija);
		System.out.println();
	}

}
