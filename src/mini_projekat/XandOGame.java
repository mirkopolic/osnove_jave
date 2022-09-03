package mini_projekat;

import java.util.ArrayList;

public class XandOGame {
	private ArrayList<String> table = new ArrayList<String>();
	private String nextPlayer;
	private Player playerX;
	private Player playerO;

	public XandOGame() {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
	}

	public XandOGame(Player playerX, Player playerO) {
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
		this.playerX = playerX;
		this.playerO = playerO;
	}

	public Player getPlayerX() {
		return playerX;
	}

	public void setPlayerX(Player playerX) {
		this.playerX = playerX;
	}

	public Player getPlayerO() {
		return playerO;
	}

	public void setPlayerO(Player playerO) {
		this.playerO = playerO;
	}

	public String getNextPlayer() {
		return nextPlayer;
	}

	public void printTable() {
		int brojac = 0;
		int pomocni = 0;
		System.out.println();
		for (int i = 0; i < 3; i++) {
			pomocni = brojac + 3;
			for (int j = brojac; j < pomocni; j++) {
				System.out.print(this.table.get(j));
				System.out.print(" | ");
				brojac++;
			}
			System.out.println();
		}
		System.out.println();
	}

	public void startGame() {
		this.table.clear();
		for (int i = 0; i < 9; i++) {
			this.table.add(" ");
		}
		this.nextPlayer = "x";
	}

	public boolean isGameOver() {
		int brojac = 0;
		for (int i = 0; i < this.table.size(); i++) {
			if (this.table.get(i).equals("x") || this.table.get(i).equals("o")) {
				brojac++;
			}
		}
		return (brojac == this.table.size()) ? true : false;
	}

	public boolean isFieldFree(int pozicija) {
		return (this.table.get(pozicija).equals("x") || this.table.get(pozicija).equals("o")) ? false : true;
	}

	public void playNext() {
		if (this.nextPlayer.equals("x")) {
			this.nextPlayer = "o";
		} else if (this.nextPlayer.equals("o")) {
			this.nextPlayer = "x";
		}
	}

	public void makeAMove(int pozicija) {
		this.table.set(pozicija, this.nextPlayer);
	}

	public boolean isValidMove(int pozicija) {
		return (pozicija >= 0 && pozicija < 9) ? true : false;
	}

	// Ova metoda prosledjuje moguce pobednicke kombinacije i igraca koji je odigrao
	// poslednji potez u metodu "isThreeInLine"
	public boolean isWinner(String player) {
		return (isThreeInLine(player, 0, 1, 2) || isThreeInLine(player, 3, 4, 5) || isThreeInLine(player, 6, 7, 8)
				|| isThreeInLine(player, 0, 4, 8) || isThreeInLine(player, 2, 4, 6) || isThreeInLine(player, 0, 3, 6)
				|| isThreeInLine(player, 1, 4, 7) || isThreeInLine(player, 2, 5, 8)) ? true : false;
	}

	// Ovde se vrsi provera da li su sve tri prosledjene pozicije jednake
	// prosledjenom igracu (x ili o)
	public boolean isThreeInLine(String player, int a, int b, int c) {
		return (this.table.get(a).equals(player) && this.table.get(b).equals(player)
				&& this.table.get(c).equals(player)) ? true : false;
	}

	public int gameScore(String pobednik) {
		if (pobednik.equals("x")) {
			return 1;
		} else if (pobednik.equals("o")) {
			return 2;
		}
		return 0;
	}

}
