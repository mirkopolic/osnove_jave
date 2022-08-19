package d19_08_2022;

public class FacebookPost {

	private String imeIPrezimeObjavio;
	private String imeIPrezimeProfil;
	private String tekst;
	private int brojLajkova;
	private int brojDeljenja;

	public FacebookPost() {

	}

	public FacebookPost(String imeIPrezimeObjavio, String imeIPrezimeProfil, String tekst) {
		this.imeIPrezimeObjavio = imeIPrezimeObjavio;
		this.imeIPrezimeProfil = imeIPrezimeProfil;
		this.tekst = tekst;
		this.brojLajkova = 0;
		this.brojDeljenja = 0;
	}
	
	public String getImeIPrezimeObjavio() {
		return imeIPrezimeObjavio;
	}

	public void setImeIPrezimeObjavio(String imeIPrezimeObjavio) {
		this.imeIPrezimeObjavio = imeIPrezimeObjavio;
	}

	public String getImeIPrezimeProfil() {
		return imeIPrezimeProfil;
	}

	public void setImeIPrezimeProfil(String imeIPrezimeProfil) {
		this.imeIPrezimeProfil = imeIPrezimeProfil;
	}

	public String getTekst() {
		return tekst;
	}

	public void setTekst(String tekst) {
		this.tekst = tekst;
	}

	public int getBrojLajkova() {
		return brojLajkova;
	}

	public int getBrojDeljenja() {
		return brojDeljenja;
	}
	
//-------------------------------------------
	
	public void like() {
		this.brojLajkova++;
	}
	
	public void dislike() {
		if (this.brojLajkova>0) {
			this.brojLajkova--;}
	}

	public void share() {
		this.brojDeljenja++;
	}
	
	public void stampaj() {
		System.out.println(this.imeIPrezimeObjavio + " >>> " + this.imeIPrezimeProfil);
		System.out.println(this.tekst);
		System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
		System.out.println();
	}
	
	
}
