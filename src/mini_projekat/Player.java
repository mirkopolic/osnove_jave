package mini_projekat;

public class Player {
	private String punoIme;

	public Player() {
		super();
	}

	public Player(String punoIme) {
		super();
		this.punoIme = punoIme;
	}

	public String getPunoIme() {
		return punoIme;
	}

	public void setPunoIme(String punoIme) {
		this.punoIme = punoIme;
	}

	public void printPlayer() {
		System.out.println(this.punoIme);
	}

}
