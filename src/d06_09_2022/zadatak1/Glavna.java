package d06_09_2022.zadatak1;

public class Glavna {

	public static void main(String[] args) {


		Tetrapak t1 = new Tetrapak("323122-56565", "Moja kravica 1l", 0.36, 0.46, false, 136.21);
		Tetrapak t2 = new Tetrapak("323122-56562", "Moja kravica 0,5l", 0.26, 0.46, true, 240.21);
		Tetrapak t3 = new Tetrapak("323122-565445", "Cokoladnoo ml 1l", 0.50, 0.96, false,250.21);
		Tetrapak t4 = new Tetrapak("323122-56522", "Cokoladno ml 0,5l", 0.77, 0.96, true, 160.21);
				
		StaklenaAmbalaza s1 = new StaklenaAmbalaza("444567-98227", "Koka kola", 0.96, 1.22, 12.00, true, 133.50);
		StaklenaAmbalaza s2 = new StaklenaAmbalaza("444567-98733", "Pepsi kola", 1.96, 4.22, 12.00, true, 133.50);
		StaklenaAmbalaza s3 = new StaklenaAmbalaza("444567-98744", "Sok", 2.96, 5.22, 15.00, true, 233.50);
		
		
		SuperKartica mirkopolic = new SuperKartica("1111-2222-3333-4444", "Mirko Polic", 300);
		
		Korpa mirko = new Korpa(mirkopolic);
		mirko.dodajAmbalazu(s1);
		mirko.dodajAmbalazu(s1);
		mirko.dodajAmbalazu(s2);
		mirko.dodajAmbalazu(s3);
		mirko.dodajAmbalazu(t1);
		mirko.dodajAmbalazu(t2);
		mirko.dodajAmbalazu(t3);
		mirko.dodajAmbalazu(t4);
		mirko.izbaciAmbalazu("323122-56565");
		
		mirko.stampajKorpu();
		
	}

}
