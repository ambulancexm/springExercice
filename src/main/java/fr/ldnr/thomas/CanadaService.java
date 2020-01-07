package fr.ldnr.thomas;

public class CanadaService {

	public int getPrix(int jour) {
		int total = -1;
		if (jour != 0) {
			total = ((jour*48)+934);
		}
		return total;
	}
	
}
