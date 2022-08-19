package d18_08_2022;

public class Zadatak2 {

	public static void main(String[] args) {

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
