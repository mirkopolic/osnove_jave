package d05_09_2022;

public class Zadatak1 {
	
//	Kreirati klasu Sektor koja ima:
//		 naziv sektora
//		 platu koja je za taj sektor
//
//		Kreirati abstraktnu klasu Radnik koja ima:
//		 ime i prezime
//		 niz sektora u kojima radi
//		 abstraktnu metodu koja vraca platu radnika
//		 metodu zaposli u sektor, kojoj se prosledjuje sektor u kom radnik pocinje sa radom
//
//		Kreirati klasu Menadzer koja nasledjuje klasu Radnik koja ima:
//		 override uje metodu za platu. Plata se racuna kao suma svih plata po sektorima.
//
//		Kreirati klasu Magacioner koja nasledjuje klasu Radnik koja:
//		 ima privatnu metodu koja racuna prosecnu platu za sektore u kojima radi radnik kao:
//		 suma plata svih sektor / broj sektora * 0.5
//		 override uje metodu za platu, tako da se plata racuna po formuli:
//		(prosecna plata za sve sektore u kojima radi) * (broj sektora).
//
//		U glavnom programu kreirati jednog magacionera i jednog menadzera, postaviti sektore u kojima rade i ispisati platu za svakog


	public static void main(String[] args) {
		
		Sektor s1 = new Sektor("Sektor 1", 10000.00);
		Sektor s2 = new Sektor("Sektor 2", 20000.00);
		Sektor s3 = new Sektor("Sektor 3", 30000.00);
		Sektor s4 = new Sektor("Sektor 4", 40000.00);
		
		Radnik menadzer = new Menadzer("Mirko Polic");
		menadzer.zaposliUSektor(s1);
		menadzer.zaposliUSektor(s2);
		menadzer.zaposliUSektor(s3);
		
		Radnik magacioner = new Magacioner("Janko Jankovic");
		magacioner.zaposliUSektor(s1);
		magacioner.zaposliUSektor(s2);
		magacioner.zaposliUSektor(s4);
		
		menadzer.stampaj();
		magacioner.stampaj();
		
	}

}
