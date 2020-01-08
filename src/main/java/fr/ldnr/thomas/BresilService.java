package fr.ldnr.thomas;

import java.time.LocalDate;

public class BresilService {

	private LocalDate aujourdhui;
	
	
	

	@Override
	public String toString() {
		return "BresilService [aujourdhui depart =" + aujourdhui + "]";
	}

	public LocalDate getAujourdhui() {
		return aujourdhui;
	}

	public void setAujourdhui(LocalDate aujourdhui) {
		this.aujourdhui = aujourdhui;
	}
	
	
	
}
