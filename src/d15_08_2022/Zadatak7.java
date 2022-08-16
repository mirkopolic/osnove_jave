package d15_08_2022;

import java.util.Scanner;

public class Zadatak7 {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.print("Unesite broj: ");
		int brojA = s.nextInt();
		System.out.print("Unesite broj: ");
		int brojB = s.nextInt();
		System.out.print("Unesite broj: ");
		int brojC = s.nextInt();
		System.out.println();
		s.close();

		System.out.println("Najmanji broj je: " + najmanjiBroj(brojA, brojB, brojC));

//---------------------------------------------------------		
		System.out.println();
		System.out.println("--------------------");
		System.out.println("KRAJ PROGRAMA!");
	}

	public static int najmanjiBroj(int a, int b, int c) {
		int min = a;
		if (min > b) {
			min = b;
		}
		if (min > c) {
			min = c;
		}
		return min;
	}
}
