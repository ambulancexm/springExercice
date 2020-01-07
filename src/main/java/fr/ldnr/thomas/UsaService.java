package fr.ldnr.thomas;

public class UsaService {
	 private int journee;
	 private int avion;
	 private int promo;
	 
	 public double getPrix(int jour) {
		 double total = -1;
			if (jour != 0) {
				total = ((jour*journee)+avion);
				total -= total*promo/100;
			}
			return total;
		 
	 }
	 
	public int getJournee() {
		return journee;
	}
	public void setJournee(int journee) {
		this.journee = journee;
	}
	public int getAvion() {
		return avion;
	}
	public void setAvion(int avion) {
		this.avion = avion;
	}
	public int getPromo() {
		return promo;
	}
	public void setPromo(int promo) {
		this.promo = promo;
	}
	 
	 
}
