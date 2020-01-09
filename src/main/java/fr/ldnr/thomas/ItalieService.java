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
		
		monumentRepository.save(new Monument("Tour1", "Pise", 60));
		monumentRepository.save(new Monument("Tour2", "Pise", 60));
		Monument test = monumentRepository.save(new Monument("Tour3", "Pise", 60));
		Monument test1 = monumentRepository.save(new Monument("Tour2", "Pise", 61));
		System.out.println("test_retour" + test);
		System.out.println("test_retour" + test1);
		for (Monument m : monumentRepository.findAll()) {
			System.out.println(m.toString());
		}
	}
}
