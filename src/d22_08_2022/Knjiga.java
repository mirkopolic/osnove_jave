package d22_08_2022;

public class Knjiga {

	private String isbn;
	private String naziv;
	private int godinaIzdanja;
	private Autor autor;

	public Knjiga(String isbn, String naziv, int godinaIzdanja, Autor autor) {
		this.isbn = isbn;
		this.naziv = naziv;
		this.godinaIzdanja = godinaIzdanja;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public int getGodinaIzdanja() {
		return godinaIzdanja;
	}

	public void setGodinaIzdanja(int godinaIzdanja) {
		this.godinaIzdanja = godinaIzdanja;
	}

	public Autor getAutor() {
		return autor;
	}

	public void setAutor(Autor autor) {
		this.autor = autor;
	}

	public void stampajKnjigu() {
		System.out.println(this.isbn);
		System.out.println(this.naziv + " - " + this.godinaIzdanja + " god.");
		System.out.println();

	}
}
