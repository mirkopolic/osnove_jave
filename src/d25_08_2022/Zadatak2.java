package d25_08_2022;

public class Zadatak2 {
	
//	Zadatak (Za vezbanje)
//	Napomena: U zadacima su brojevi od 1 do 39, i smatrajte da se brojevi unose u tim granicama. Znaci nije vam potrebna provera za opseg brojeva.
//
//	Za potrebe Lotto igre na srecu potrebno je 
//	Kreirati klasu Kombinacija koja ima:
//	id kombinacije (String)
//	niz brojeva - niz je od 7 broja (ArrayList<Integer>)
//	konstruktor koji prima id i 7 broja koji se u konstruktoru dodaju u niz.
//	gettere za atribute Kombinacija(String id, int jedan, int dva, …)
//	metodu koja proverava da li this kombinacija ima iste brojeve kao prosledjena kombinacija. 
//	Zaglavlje metode je:
//	public boolean daLiJeIstaKombinacija( Kombinacija k)
//	metoda vraca true ako su svi elementi na istim pozicija isti
//	npr: this [0] == k [0], this [1] == k [1] …. 
//	metodu za stampu koja stampa podatke u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
//
//
//		Kreirati klasu Listic koja ima: 
//	niz kombinacija - maksimalno 7 kombinacija
//	metodu dodaj kombinaciju, koja dodaje kombinaciju u niz
//	metodu koja vraca da li je kombinacija dobitna. Kao parametar se prosledjuje kombinacija za proveru. Metoda prolazi kroz sve elemente niza i proverava da li u nizu postoji prosledjena kombinacija. Za proveru jednakosti kombinacja koristi se metoda daLiJeIstaKombinacija
//	Zaglavlje metode 
//	public boolean dobitna(Kombinacija dobitnaKombinacija)
//	metodu koja stampa listic u formatu
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
//
//	ID: id kombinacije
//	brojevi: 1, 3, 5, 14, 15, 21, 23
//
//	…… i tako za sve kombinacije


	public static void main(String[] args) {

		Kombinacija izvucena = new Kombinacija("0000", 4, 11, 15, 19, 20, 25, 32);
		Kombinacija k1 = new Kombinacija("1112", 4, 11, 15, 16, 20, 25, 32);
		Kombinacija k2 = new Kombinacija("1113", 6, 11, 15, 16, 20, 25, 32);
		Kombinacija k3 = new Kombinacija("1114", 7, 11, 15, 16, 20, 25, 32);
		Kombinacija k4 = new Kombinacija("1115", 4, 11, 15, 19, 20, 25, 32);
		Kombinacija k5 = new Kombinacija("1116", 4, 11, 12, 18, 20, 25, 35);

		Listic l1 = new Listic();
		Listic l2 = new Listic();
		l1.setKombinacije(k1);
		l1.setKombinacije(k2);
		l1.setKombinacije(k4);
		l2.setKombinacije(k3);
		l2.setKombinacije(k5);

		if (l1.dobitna(izvucena)) {
			System.out.println("JEEEE imate dobitnu kombinaciju!");
		} else {
			System.out.println("Nemate dobitnu kombinaciju!");
		}
		System.out.println();
		l1.stampajListic();

		if (l2.dobitna(izvucena)) {
			System.out.println("JEEEE imate dobitnu kombinaciju!");
		} else {
			System.out.println("Nemate dobitnu kombinaciju!");
		}
		System.out.println();
		l2.stampajListic();

	}

}
