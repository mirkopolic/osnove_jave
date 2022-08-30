package d25_08_2022;

import java.util.ArrayList;

public class Listic {
	private ArrayList<Kombinacija> kombinacije = new ArrayList<Kombinacija>();

	public Listic() {

	}
	
	public void setKombinacije(Kombinacija komb) {
		this.kombinacije.add(komb);
	}



	public ArrayList<Kombinacija> getKombinacije() {
		return kombinacije;
	}

	public boolean dobitna(Kombinacija izvucena) {
		for (int i = 0; i < this.kombinacije.size(); i++) {
//			if (this.kombinacije.get(i).daLiJeIstaKombinacija(izvucena)) {
				if (this.kombinacije.get(i).pogodak(izvucena)) {	
				return true;
			}

		}
		return false;
	}

	public void stampajListic() {
		for (int i = 0; i < this.kombinacije.size(); i++) {
			this.kombinacije.get(i).stampajKombinaciju();
		}
		System.out.println();
	}

}
