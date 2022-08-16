package d15_08_2022;

import java.util.ArrayList;
import java.util.Random;

public class Zadatak1 {

	public static void main(String[] args) {
		
		ArrayList<Integer> niz = new ArrayList<Integer>();
		Random randomNo = new Random();
		for (int i = 0; i < 10; i++) {
			niz.add(randomNo.nextInt(20) - 10);
		}
		
		for (int i = 0; i < niz.size(); i++) {
			stampajVrednostZa10Vecu(niz.get(i));
		}

		
//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}
	
	public static void stampajVrednostZa10Vecu(int a) {
		System.out.println("Pocetna vrednost: " + a + "  Uvecana vrednost: " + (a+10));
	}

}
