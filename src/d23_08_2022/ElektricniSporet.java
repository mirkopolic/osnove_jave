package d23_08_2022;

public class ElektricniSporet {
	private String marka;
	private int garancija;
	private int maxRingli;
	private Ringla gl;
	private Ringla gd;
	private Ringla dl;
	private Ringla dd;

	public ElektricniSporet(String marka, int garancija, int maxRingli, Ringla gl, Ringla gd, Ringla dl, Ringla dd) {
		this.marka = marka;
		this.garancija = garancija;
		this.maxRingli = maxRingli;
		this.gl = gl;
		this.gd = gd;
		this.dl = dl;
		this.dd = dd;
	}

	public String getMarka() {
		return marka;
	}

	public int getGarancija() {
		return garancija;
	}

	public int getMaxRingli() {
		return maxRingli;
	}

	public Ringla getGl() {
		return gl;
	}

	public Ringla getGd() {
		return gd;
	}

	public Ringla getDl() {
		return dl;
	}

	public Ringla getDd() {
		return dd;
	}

	public void iskljuciRinglu(String pozicija) {
		if (pozicija.equals("pozicija 1")) {
			this.gl.iskljuci();
		} else if (pozicija.equals("pozicija 2")) {
			this.gd.iskljuci();
		} else if (pozicija.equals("pozicija 3")) {
			this.dl.iskljuci();
		} else if (pozicija.equals("pozicija 4")) {
			this.dd.iskljuci();
		}
	}

	public void pojacajRinglu(String pozicija) {

		int brojUkljucenih = 0;
		if (this.gl.ukljucena()) {
			brojUkljucenih++;
		}
		if (this.gd.ukljucena()) {
			brojUkljucenih++;
		}
		if (this.dl.ukljucena()) {
			brojUkljucenih++;
		}
		if (this.dd.ukljucena()) {
			brojUkljucenih++;
		}

		if (pozicija.equals("pozicija 1")) {
			if (!this.gl.ukljucena()) {
				if (brojUkljucenih == maxRingli) {
					this.gd.iskljuci();
					this.dl.iskljuci();
					this.dd.iskljuci();
				}
			}
			this.gl.pojacaj();
		} else if (pozicija.equals("pozicija 2")) {
			if (!this.gd.ukljucena()) {
				if (brojUkljucenih == maxRingli) {
					this.gl.iskljuci();
					this.dl.iskljuci();
					this.dd.iskljuci();
				}
			}
			this.gd.pojacaj();
		} else if (pozicija.equals("pozicija 3")) {
			if (!this.dl.ukljucena()) {
				if (brojUkljucenih == maxRingli) {
					this.gl.iskljuci();
					this.gd.iskljuci();
					this.dd.iskljuci();
				}
			}
			this.dl.pojacaj();
		} else if (pozicija.equals("pozicija 4")) {
			if (!this.dd.ukljucena()) {
				if (brojUkljucenih == maxRingli) {
					this.gl.iskljuci();
					this.gd.iskljuci();
					this.dl.iskljuci();
				}
			}
			this.dd.pojacaj();
		}

	}

	public double potrosnja(int a, int b, int c, int d) {
		return this.gl.potrosnja(a) + this.gd.potrosnja(b) + this.dl.potrosnja(c) + this.dd.potrosnja(d);
	}

	public void stampaj() {
		System.out.println(this.marka + " - " + this.garancija);
		System.out.println();
		System.out.println("Ringle:");
		System.out.println();
		System.out.println("Gore levo: ");
		this.gl.stampajRinglu();
		System.out.println("Gore desno: ");
		this.gd.stampajRinglu();
		System.out.println("Dole levo: ");
		this.dl.stampajRinglu();
		System.out.println("Dole desno: ");
		this.dd.stampajRinglu();
	}
}
