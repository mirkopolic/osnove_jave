package d06_09_2022.zadatak2;

public class PlaninarskiDomMain {

	public static void main(String[] args) {

		
		Planina rtanj = new Planina("Rtanj", "Srbija", 1800);
		Planina durmitor = new Planina("Durmitor", "Crna Gora", 2523);

		RekreativniPlaninar mirko = new RekreativniPlaninar(15646, "Mirko Polic", 7, "Grad Beograd");
		RekreativniPlaninar ana = new RekreativniPlaninar(15222, "Ana Jovic", 4, "Nisavski");
		RekreativniPlaninar darko = new RekreativniPlaninar(13221, "Darko Stevic", 5, "Jablanicki");

		Alpinista dragan = new Alpinista(16444, "Darko Tosic");
		Alpinista jagoda = new Alpinista(11444, "Jagoda Peric");
		Alpinista maja = new Alpinista(17555, "Maja Lazic");

		PlaninarskiDom pd = new PlaninarskiDom("Rtanj", 1964);

		pd.uclaniPlaninara(ana);
		pd.uclaniPlaninara(jagoda);
		pd.uclaniPlaninara(darko);
		pd.uclaniPlaninara(mirko);
		pd.uclaniPlaninara(maja);
		pd.uclaniPlaninara(dragan);

		pd.izbaciPlaninara(16444);

		System.out.println("Na " + rtanj.getIme() + " (" + rtanj.getVisina() + ") uspesno ce se popeti "
				+ pd.uspesnoCeSePopeti(rtanj) + " planinara");
		System.out.println();
		
		System.out.println("Na " + durmitor.getIme() + " (" + durmitor.getVisina() + ") uspesno ce se popeti "
				+ pd.uspesnoCeSePopeti(durmitor) + " planinara");
		System.out.println();
		
		pd.stampajDom();
		
		
	}

}
