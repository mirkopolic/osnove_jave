package d15_08_2022;

import java.util.Scanner;

public class Zadatak3 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		System.out.print("Unesite prvi jednocifren broj: ");
		int brojA = s.nextInt();
		System.out.print("Unesite drugi jednocifren broj: ");
		int brojB = s.nextInt();
		System.out.println();
		s.close();

		System.out.println("Nova vrednost je: " + spojiBrojeve(brojA, brojB));

//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");

	}

	public static int spojiBrojeve(int a, int b) {
		return a * 10 + b;
	}
}
