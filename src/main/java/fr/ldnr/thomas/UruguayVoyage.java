package fr.ldnr.thomas;

public class UruguayVoyage {

	public void affiche() {
		UruguayService[] urs = new UruguayService[3];
		urs[0] = new UruguayService();
		urs[0].setDestination("Montevideo");
		urs[1] = new UruguayService();
		urs[1].setDestination("Mercedes");
		urs[2] = new UruguayService();
		urs[2].setDestination("Florida");
		for (UruguayService uruguayService : urs) {
			System.out.println(uruguayService.getDestination());
		}
	}
	
	

}
