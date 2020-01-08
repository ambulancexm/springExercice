package fr.ldnr.thomas;

public abstract class UruguayVoyage {

	public void affiche() {
		UruguayService[] urs = new UruguayService[3];
		urs[0] = getService();
		urs[0].setDestination("Montevideo");
		urs[1] = getService();
		urs[1].setDestination("Mercedes");
		urs[2] = getService();
		urs[2].setDestination("Florida");
		for (UruguayService uruguayService : urs) {
			System.out.println(uruguayService.getDestination());
		}
	}
	
	public abstract UruguayService getService();
	
	

}
