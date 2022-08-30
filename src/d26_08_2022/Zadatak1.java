package d26_08_2022;

public class Zadatak1 {
	
//		Kreirati klasu Osoba koja ima:
//		ime i prezime
//		jmbg
//		godinu rodjenja
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere 
//		metodu stampaj koja stampa u formatu:
//		(ime i prezime), (jmbg), (godina rodjenja)
//
//		Kreirati klasu Igrac koja nasledjuje klasu Osoba i koja ima:
//		broj (broj koji igrac nosi)
//		poziciju koju igra (odbrambeni, napadac, … )
//		kapiten (promenljiva koja kaze da li je igrac kapiten tima, i tipa je boolean)
//		default-ni konstuktor
//		konstuktor sa parametrima
//		gettere i settere za broj, kapiten i poziciju
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o igracu
//
//		Kreirati klasu Trener koja nasledjuje klasu Osoba i koja ima:
//		godine iskustva
//		tip trenera (kondicioni, za igru, pomocni, personalni)
//		metodu stampaj, koju prepisuje iz glavne klase, tako da stampa sve informacije o treneru.
//
//		U glavnom programu kreirati 2 igraca i 2 trenera, i istestirati metode.



	public static void main(String[] args) {
		
		
		Igrac mirko = new Igrac("Mirko Polic", "12121324654", 1999, 9, "napadac", true);
		Igrac slavko = new Igrac("Slavko Tomic", "21546546546", 1998, 1, "golman", false);

		mirko.stampajOsobu();
		slavko.stampajOsobu();
		
		Trener milan = new Trener("Milan Jovanovic", "032354845454", 1980, 11, "za igru");
		Trener vlada = new Trener("Vladimir Minic", "214547796544", 1976, 15, "kondicioni");
		
		milan.stampajOsobu();
		vlada.stampajOsobu();
		
		
	}

}
