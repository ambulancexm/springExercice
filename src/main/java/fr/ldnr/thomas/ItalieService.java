package fr.ldnr.thomas;

import org.springframework.data.gemfire.repository.config.EnableGemfireRepositories;

@EnableGemfireRepositories("fr.ldnr.thomas")
public class ItalieService {

	private MonumentRepository monumentRepository;
	
	
	
	public MonumentRepository getMonumentRepository() {
		return monumentRepository;
	}



	public void setMonumentRepository(MonumentRepository monumentRepository) {
		this.monumentRepository = monumentRepository;
	}



	public void Affiche() {
		System.out.println("voyage en Italie");
		System.out.println(monumentRepository);
	}
}
