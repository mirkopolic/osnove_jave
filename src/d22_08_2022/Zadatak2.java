package d22_08_2022;

public class Zadatak2 {
//	(Za vezbanje) Kreirati klasu Proizvod koja ima:
//		sifru proizvoda
//		naziv proizvoda
//		cenu po kilogramu (cena po funti se ne cuva, ona se racuna)
//		konstuktor koji prima sva tri parametra (sifra, naziv, cena po kilogramu)
//		gettere i settere za sifru i naziv
//		setter za cenu po kilogramu
//		metodu getCenaKg koja vraca cenu za 1 kg proizvoda
//		metodu getCenaLb koja vraca cenu za 1lb prozvoda
//		 		konverzija: 1 kg = 2.2046 lb
//		metodu koja stampa proizvod u formatu:
//		(sifra) - (naziv)
//
//			Kreirati klasu Vaga koja ima:
//		merna jedinica (kg ili lb)
//		proizvod (proizvod koji se meri)
//		TEZINA SE NE CUVA KAO ATRIBUT!!!!!!!!!
//		default-ni konstuktor
//		getteri i setteri za sve atribute
//		metodu sracunajCenu koja vraca cenu proizvoda za unetu tezinu (tezina je parametar funkcije). Na racunanje cene utice i merna jedinica na koju je vaga podesena. 
//		metodu stampaj koja stampa racun u formatu. POMOC: trebace vam tezina kao parametar u ovoj metodi
//		               (sifra) - (naziv)
//		   (cena za odgovarajucu mernu jedinicu) (merna jedinica) x (tezina) 
//		   Ukupno: (ukupna cena) 	      


	public static void main(String[] args) {


		Proizvod ugalj = new Proizvod("123456", "Lignit - Kolubara", 450.30);
		Proizvod drvo = new Proizvod("654654", "Cerovina - susena", 320.70);
		Proizvod pelet = new Proizvod("6544778", "Pelet - mesani", 600.00);
		
		Vaga a1 = new Vaga();
		a1.setProizvod(ugalj);
		a1.setMernaJedinica("kg");
		Vaga a2 = new Vaga();
		a2.setProizvod(drvo);
		a2.setMernaJedinica("lb");
		Vaga a3 = new Vaga();
		a3.setProizvod(pelet);
		a3.setMernaJedinica("kg");
		
		a1.stampaj(750);
		a2.stampaj(350.50);
		a3.stampaj(200);
		

	}

}
