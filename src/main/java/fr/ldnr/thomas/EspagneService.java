package fr.ldnr.thomas;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EspagneService {

	private NamedParameterJdbcTemplate sqlTemplate;
	
	public EspagneService(NamedParameterJdbcTemplate sqlTemplate) {
		this.sqlTemplate = sqlTemplate;
	}

	@Override
	public String toString() {
		return "EspagneService [sqlTemplate=" + sqlTemplate + "]";
	}

	
	
	
	
}
