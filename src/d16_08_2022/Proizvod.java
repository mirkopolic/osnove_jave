package d16_08_2022;

public class Proizvod {
	String naziv;
	double cena, tezinaUGramima;

	public double konvertuj(String jedinicaMere) {
		if (jedinicaMere.equals("kg")) {
			return this.tezinaUGramima / 1000.00;
		} else {
			return this.tezinaUGramima / 1000000.00;
		}
	}

	public void stampaj(double tezina, String jedinicaMere) {
		System.out.println(this.naziv + ", " + cena + " dinara, " + tezina + jedinicaMere);
	}

}
