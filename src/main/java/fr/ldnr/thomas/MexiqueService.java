package fr.ldnr.thomas;

import java.time.LocalDate;

public class MexiqueService {
	

	private double prix;
	private LocalDate depart;
	
	public MexiqueService(double prix) {
		this.prix = prix;
	}
	
	public MexiqueService(double prix, LocalDate depart) {
		this.prix = prix;
		this.depart = depart;
	}

	


	@Override
	public String toString() {
		return "MexiqueService [prix=" + prix + ", depart=" + depart + "]";
	}

	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}

	public LocalDate getDepart() {
		return depart;
	}

	public void setDepart(LocalDate depart) {
		this.depart = depart;
	}
		
}
