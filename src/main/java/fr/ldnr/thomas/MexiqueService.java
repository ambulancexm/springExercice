package fr.ldnr.thomas;

public class MexiqueService {
	

	private double prix;
	
	public MexiqueService(double prix) {
		this.prix = prix;
	}
	
	@Override
	public String toString() {
		return "MexiqueService [prix=" + prix + "]";
	}


	public double getPrix() {
		return prix;
	}

	public void setPrix(double prix) {
		this.prix = prix;
	}
		
}
