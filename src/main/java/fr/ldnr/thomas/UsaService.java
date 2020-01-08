package fr.ldnr.thomas;

public class UsaService {
	private int journee;
	private int avion[];
	private int promo;

	public double getPrix(int jour) {
		double total = (avion[getCompagnie(jour)] + jour * journee) * (1 - promo / 100.0);
		if(total == -1) {
		System.out.println("test" + total);
			return total;
		}
		return total;

	}

	int getCompagnie(int jour) {
		int comp = 0;
		if (jour <= 0 || jour > 28) {
			comp = -1;
		} else {
			if (jour < 6 && jour > 0) {
				comp = 2;
			} else if (jour % 7 == 0) {
				comp = 1;
			}
//			 else
//				 comp = 0;

		}
		return comp;
	}

	public int getJournee() {
		return journee;
	}

	public void setJournee(int journee) {
		this.journee = journee;
	}

	public int[] getAvion() {
		return avion;
	}

	public void setAvion(int[] avion) {
		this.avion = avion;
	}

	public int getPromo() {
		return promo;
	}

	public void setPromo(int promo) {
		this.promo = promo;
	}

}
