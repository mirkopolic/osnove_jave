package d23_08_2022;

public class Zadatak3 {

	public static void main(String[] args) {


		Ringla a1 = new Ringla("obicna", 0.8);
		Ringla a2 = new Ringla("obicna", 1.0);
		Ringla a3 = new Ringla("ekspres", 1.4);
		Ringla a4 = new Ringla("ekspres", 1.8);
		
		ElektricniSporet sporet1 = new ElektricniSporet("Bosh", 5, 2, a1, a2, a3, a4);
		
		sporet1.iskljuciRinglu("pozicija 1");
		sporet1.iskljuciRinglu("pozicija 2");
		sporet1.iskljuciRinglu("pozicija 3");
		sporet1.iskljuciRinglu("pozicija 4");
		
		sporet1.pojacajRinglu("pozicija 2");
		sporet1.pojacajRinglu("pozicija 2");
		sporet1.pojacajRinglu("pozicija 3");
		sporet1.pojacajRinglu("pozicija 4");
		sporet1.pojacajRinglu("pozicija 2");
		sporet1.pojacajRinglu("pozicija 2");
		sporet1.pojacajRinglu("pozicija 4");
		sporet1.pojacajRinglu("pozicija 4");
		sporet1.pojacajRinglu("pozicija 4");
		
		
		
		sporet1.stampaj();
		
		System.out.println();
		System.out.println("Ukupna potrosnja sporeta je: " + sporet1.potrosnja(3, 2, 0, 4));
		
		
	}

}
