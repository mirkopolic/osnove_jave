package mini_projekat;

import java.util.Scanner;

public class Glavni {

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		Player x = new Player("Mirko Polic");
		Player o = new Player();
		o.setPunoIme("Marko Markovic");

		XandOGame igra = new XandOGame(x, o);

		igra.startGame();
		
		String pobednik = "";

		while (!igra.isGameOver()) {

			System.out.print("Unesite poziciju: ");
			int pozicija = s.nextInt();

			while (!igra.isValidMove(pozicija) || !igra.isFieldFree(pozicija)) {
				System.out.println();

				if (!igra.isValidMove(pozicija)) {
					System.out.println("Ova pozicija nije dozvoljena!");
				} else if (!igra.isFieldFree(pozicija)) {
					System.out.println("Polje nije slobodno!");
				}
				System.out.print("Unesite novu poziciju iz opsega (0-8): ");
				pozicija = s.nextInt();
			}

			igra.makeAMove(pozicija);
			igra.printTable();

			if (igra.isWinner(igra.getNextPlayer())) {
				pobednik = igra.getNextPlayer();
				break;
			}

			igra.playNext();

		}

		System.out.println();
		System.out.println("Konacni skor igre: " + igra.gameScore(pobednik));
		System.out.print("Igrac X: ");
		x.printPlayer();
		System.out.print("Igrac O: ");
		o.printPlayer();

		s.close();
		System.out.println();
		System.out.println("--------------------------");
		System.out.println("KRAJ PROGRAMA!");

	}

}
