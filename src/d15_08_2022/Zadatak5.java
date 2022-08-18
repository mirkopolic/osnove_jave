package d15_08_2022;

import java.util.Scanner;

public class Zadatak5 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite broj karaktera: ");
		int brojKaraktera = s.nextInt();
		System.out.print("Unesite karakter: ");
		char karakter = s.next().charAt(0);
		System.out.println();
		s.close();

		stampajKarakter(karakter, brojKaraktera);

//---------------------------------------------------------
//Ovo dole je nebitan deo, čisto da na kraju ispiše KRAJ PROGRAMA	
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

	public static void stampajKarakter(char prosledjenKarakter, int broj) {
		for (int i = 0; i < broj; i++) {
			System.out.print(prosledjenKarakter);
		}

	}
}
