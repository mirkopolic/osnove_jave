package d19_08_2022;

public class Zadatak1 {

	public static void main(String[] args) {
		
		FacebookPost prvi = new FacebookPost();
		prvi.setImeIPrezimeObjavio("Mirko Polic");
		prvi.setImeIPrezimeProfil("Milan Jovanovic");
		prvi.setTekst("Ovde ide neki smisleni tekst. Kao ja te hvalim \n"
				+ "kako si dobar predavac, a to se svima svidi \n" + "pa lupaju lajkove :)");
		
		FacebookPost drugi = new FacebookPost("Mirko Polic", "Vlada Minic", "I ovde ide neki smisleni tekst. Kao i tebe hvalim \n"
				+ "kako si dobar predavac, a to se vec ne svidja svima \n"
				+ "pa ti lupaju lajkove, ali i dislajkove :) \n"
				+ "Da ne bude zabune, uglavnom te minira Anina grupa :) :) :)");
		
		prvi.like();
		prvi.like();
		prvi.share();
		prvi.like();
		prvi.share();
		prvi.like();
		prvi.dislike();

		prvi.stampaj();
		
		drugi.like();
		drugi.share();
		drugi.share();
		drugi.dislike();
		drugi.dislike();
		
		drugi.stampaj();

//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

}
