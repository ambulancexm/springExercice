package fr.ldnr.thomas;

import java.util.HashMap;
import java.util.Map;

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
	
	public void affiche() {
		
		String sql ="CREATE TABLE IF NOT EXISTS destination(id INTEGER PRIMARY KEY, nom TEXT, pays TEXT, jours INTEGER)";
		Map<String, Object> n = new HashMap<String, Object>();
		n.put("n", "Madrid");
		n.put("p", "Espagne");
		n.put("j", "10");
		sqlTemplate.getJdbcOperations().execute(sql);
		
		sql = "INSERT INTO destination(nom,pays,jours) VALUES(:n,:p,:j)";
		sqlTemplate.update(sql, n);
	}

	
	
	
	
}
