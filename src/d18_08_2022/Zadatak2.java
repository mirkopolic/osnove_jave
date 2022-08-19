package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {
		
//		.Kreirati klasu FacebookPost koja ima:
//			   Od atributa:
//			-	ime i prezime korisnika koji je objavio post
//			-	ime i prezime korisnika na kom je profilu objavljen post (posto na fejsbuku mozete da postavite objavu na tudjem profilu)
//			-	tekst objave
//			-	broj lajkova
//			-	broj deljenja
//			  Od metoda:
//			-	like(), koja povecava broj lajkova za 1.
//			-	dislike(), koja smanjuje broj lajkova za 1 (broj lajkova ne moze da bude manji od nule)
//			-	share(), koja povecava broj deljenja za 1
//			-	print(), koja stampa objavu u formatu:
//			(ime i prezime osobe koja je objavila) >>> (ime i prezime na cijem profilu)
//			(tekst objave)
//			Likes (broj lajkova) | Shares (broj deljenja)
//
//			U glavnoj klasi napraviti minimum dva FacebookPost-a i nad svakim pozvati svaku funkciju.


		Footer footer = new Footer();//Stampa KRAJ PROGRAMA!

		Facebookpost prvi = new Facebookpost();
		prvi.imeIPrezimeObjava = "Mirko Polic";
		prvi.imeIPrezimeProfil = "Milan Jovanovic";
		prvi.tekstObjave = "Ovde ide neki smisleni tekst. Kao ja te hvalim \n"
				+ "kako si dobar predavac, a to se svima svidi \n" + "pa lupaju lajkove :)";
		prvi.brojLajkova = 0;
		prvi.brojDeljenja = 0;

		Facebookpost drugi = new Facebookpost();
		drugi.imeIPrezimeObjava = "Mirko Polic";
		drugi.imeIPrezimeProfil = "Vlada Minic";
		drugi.tekstObjave = "I ovde ide neki smisleni tekst. Kao i tebe hvalim \n"
				+ "kako si dobar predavac, a to se vec ne svidja svima \n"
				+ "pa ti lupaju lajkove, ali i dislajkove :) \n"
				+ "Da ne bude zabune, uglavnom te minira Anina grupa :) :) :)";
		drugi.brojLajkova = 0;
		drugi.brojDeljenja = 0;

		prvi.like();
		prvi.like();
		prvi.like();
		prvi.share();
		prvi.share();
		prvi.dislike();

		drugi.like();
		drugi.dislike();
		drugi.dislike();
		drugi.share();

		prvi.print();
		drugi.print();

// ---------------------------------------------------------
		footer.print();
	}

}
