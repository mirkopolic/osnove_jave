package d23_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {

		Racun mirko = new Racun("178-654354-85", "Mirko Polic", 30000.00);
		Racun milan = new Racun("250-11321654-65", "Milan Jovanovic", 10000.00);
		Racun ana = new Racun("325-325545-32", "Ana Bankovic", 64560.20);

		Transakcija plati1 = new Transakcija(1214, mirko, milan);
		Transakcija plati2 = new Transakcija(6544, milan, ana);

		if (plati1.izvrsiTransakciju(10000)) {
			plati1.stampajTransakciju();
		} else {
			System.out.println("Nemate dovoljno sredstava.");
			System.out.println("Transakcija je otkazana.");
		}

		if (plati2.izvrsiTransakciju(23000)) {
			plati2.stampajTransakciju();
		} else {
			System.out.println("Nemate dovoljno sredstava.");
			System.out.println("Transakcija je otkazana.");
			plati2.stampajTransakciju();
		}
		
		System.out.println();
		System.out.println("KRAJ PROGRAMA!");
	}

}
