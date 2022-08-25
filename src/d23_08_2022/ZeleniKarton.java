package d23_08_2022;

public class ZeleniKarton {
	private String imeStudent;
	private String brojIndeksa;
	private String nazivPredmeta;
	private String imeProfesor;
	private int ocena;

	public ZeleniKarton() {
		super();
	}

	public ZeleniKarton(String imeStudent, String brojIndeksa, String nazivPredmeta, String imeProfesor, int ocena) {
		super();
		this.imeStudent = imeStudent;
		this.brojIndeksa = brojIndeksa;
		this.nazivPredmeta = nazivPredmeta;
		this.imeProfesor = imeProfesor;
		this.ocena = ocena;
	}

	public String getImeStudent() {
		return imeStudent;
	}

	public void setImeStudent(String imeStudent) {
		this.imeStudent = imeStudent;
	}

	public String getBrojIndeksa() {
		return brojIndeksa;
	}

	public void setBrojIndeksa(String brojIndeksa) {
		this.brojIndeksa = brojIndeksa;
	}

	public String getNazivPredmeta() {
		return nazivPredmeta;
	}

	public void setNazivPredmeta(String nazivPredmeta) {
		this.nazivPredmeta = nazivPredmeta;
	}

	public String getImeProfesor() {
		return imeProfesor;
	}

	public void setImeProfesor(String imeProfesor) {
		this.imeProfesor = imeProfesor;
	}

	public int getOcena() {
		return ocena;
	}

	public void setOcena(int ocena) {
		this.ocena = ocena;
	}

	public boolean polozen() {
		if (this.ocena > 5) {
			return true;
		}
		return false;
	}

	public void stampaj() {
		System.out.println(this.nazivPredmeta + " - " + this.ocena);
		System.out.println("Student: " + this.imeStudent + ", " + this.brojIndeksa);
		System.out.println("Profesor: " + this.imeProfesor);
		System.out.println("-----------------------");
		System.out.println();
	}
	
	

}
