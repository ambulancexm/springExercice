package fr.ldnr.thomas;

import javax.persistence.Column;
import javax.persistence.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.gemfire.mapping.annotation.Region;

@Entity
@Region("gemfireRegion")
public class Monument {


	private String nom;
	private String ville;
	private int accueil;
	
	public Monument() {
	}
	
	public Monument(String nom, String ville, int accueil) {
		this.nom = nom;
		this.ville = ville;
		this.accueil = accueil;
	}
	
	@Id
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	@Column
	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}
	@Column
	public int getAccueil() {
		return accueil;
	}

	public void setAccueil(int accueil) {
		this.accueil = accueil;
	}
	
}
