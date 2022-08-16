package d15_08_2022;

import java.util.Scanner;

public class Zadatak8 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite prvi broj: ");
		int brojA = s.nextInt();
		System.out.print("Unesite drugi broj: ");
		int brojB = s.nextInt();
		System.out.print("Unesite treci broj: ");
		int brojC = s.nextInt();
		System.out.println();
		s.close();

		int rezultat = sabiranjeDvaBroja(sabiranjeDvaBroja(10, brojA), sabiranjeDvaBroja(brojB, brojC));
		System.out.println("Rezultat operacije x=10+a+b+c je: " + rezultat);

//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

	public static int sabiranjeDvaBroja(int a, int b) {
		return a + b;
	}
}
