package d15_08_2022;

import java.util.Scanner;

public class Zadatak6 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite prvi broj: ");
		int brojA = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int brojB = s.nextInt();
		System.out.println();
		s.close();

		System.out.println("Rezultat je: " + imaCelihBrojeva(brojA, brojB));

//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

	public static int imaCelihBrojeva(int a, int b) {

		int rezultat = 0;
		if (a == b) {
			return rezultat;
		}
		if ((a < 0 && b < 0) || (a > 0 && b > 0)) {
			rezultat = a - b;
		} else {
			if (a < 0) {
				a = -a;
			}
			if (b < 0) {
				b = -b;
			}
			rezultat = a + b;
		}
		if (rezultat < 0) {
			rezultat = -rezultat;
		}
		return rezultat - 1;
	}

}
