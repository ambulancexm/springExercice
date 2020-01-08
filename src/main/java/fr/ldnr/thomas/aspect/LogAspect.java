package fr.ldnr.thomas.aspect;

import java.time.LocalDateTime;

public class LogAspect {

	public void ecrire() {
		System.out.println(LocalDateTime.now() + ": ici");
	}
}
