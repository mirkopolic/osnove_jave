package d18_08_2022;

public class Facebookpost {
	public String imeIPrezimeObjava;
	public String imeIPrezimeProfil;
	public String tekstObjave;
	public int brojLajkova;
	public int brojDeljenja;

	public void like() {
		this.brojLajkova++;
	}

	public void dislike() {
		if (this.brojLajkova > 0) {
			this.brojLajkova--;
		}
	}
	
	public void share() {
		this.brojDeljenja++;
	}
	
	public void print() {
		System.out.println(this.imeIPrezimeObjava + " >>> " + this.imeIPrezimeProfil);
		System.out.println(this.tekstObjave);
		System.out.println("Likes " + this.brojLajkova + " | Shares " + this.brojDeljenja);
		System.out.println();
	}
}
