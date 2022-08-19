package d18_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
//		1.	Napisati klasu Proizvod koja ima atribute
//		a.	naziv proizvoda (String)
//		b.	cenu proizvoda (double)
//		c.	težinu proizvoda u gramima. (double)
//			i metode:
//		d.	stampaj - stampa podatke proizvoda u formatu {{naziv}}, {{cena}}, {{tezina}}
//		e.	povecajCenu - koja kao parametar funkcije prima vrednost povećanje za koju treba povećati cenu. Ova funkcija treba da menja atribut cena i ova funkcija nema povratnu vrednost.
//		f.	vratiCenuSaPopustom - koja kao ulazni parametar funkcije dobija popust, a povratnu vrednost je cena proizvoda kada se uračuna popust.Ova funkcije ne menja atribut cena. Smatrati da je parametar popust u opsegu od 0 do 100.
//		g.	racunajPostarinu - funkcije vraća koliko bi bila postarina da se proizvod šalje preko kurirske sluzbe. Funkcija je bez ulaznih parametara, a cena postarine se računa u zavisnosti od tezine:	
//		-	za tezinu do 100g, postarina iznosi 200din
//		-	za tezinu od 101g do 500g, postarina iznosi 400din
//		-	za tezinu preko 500g, postarina iznosi 1000din
//
//		U glavnom programu kreirati minimum 2 proizvoda i za svaki od njih pozvati svaku od definisanih funkcija.

		Footer footer = new Footer();// Stampa KRAJ PROGRAMA!

		Proizvod prvi = new Proizvod();
		prvi.naziv = "Televizor";
		prvi.cena = 23499.99;
		prvi.tezinaGr = 3480.0;

		Proizvod drugi = new Proizvod();
		drugi.naziv = "Mikser";
		drugi.cena = 10999.99;
		drugi.tezinaGr = 450.0;

		int povecanje = 0;
		int popust = 0;
		boolean slanjeKurirom = false;

		prvi.stampaj();
		drugi.stampaj();

		povecanje = 20;
		prvi.povecajCenu(povecanje);

		povecanje = 50;
		drugi.povecajCenu(povecanje);

		prvi.stampaj();
		drugi.stampaj();

		popust = 20;
		System.out.println("Cena nakon uracunatog popusta: " + prvi.vratiCenuSaPopustom(popust));
		popust = 30;
		System.out.println("Cena nakon uracunatog popusta: " + drugi.vratiCenuSaPopustom(popust));

		slanjeKurirom = true;
		if (slanjeKurirom) {
			System.out.println("Postarina za slanje kurirom: " + prvi.racunajPostarinu());
		} else {
			System.out.println("Nema postarine");
		}
		slanjeKurirom = true;
		if (slanjeKurirom) {
			System.out.println("Postarina za slanje kurirom: " + drugi.racunajPostarinu());
		} else {
			System.out.println("Nema postarine");
		}
		
//---------------------------------------------------------
		footer.print();
	}

}
