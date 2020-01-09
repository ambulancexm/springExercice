package fr.ldnr.thomas;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

public class EspagneService {
	
	public static final String CREATE_DESTINATION = "CREATE TABLE IF NOT EXISTS destination(id INTEGER PRIMARY KEY, nom TEXT, pays TEXT, jours INTEGER)";
	public static final String INSERT_DESTINATION = "INSERT INTO destination(nom,pays,jours) VALUES(:n,:p,:j)";
	public static final String LIST_DESTINATION = "SELECT * FROM destination";
	public static final String COUNT_DESTINATION = "SELECT COUNT(*) FROM destination";
	private NamedParameterJdbcTemplate sqlTemplate;
	
	public EspagneService(NamedParameterJdbcTemplate sqlTemplate) {
		this.sqlTemplate = sqlTemplate;
	}

	@Override
	public String toString() {
		
		
		return "EspagneService [sqlTemplate=" + sqlTemplate + "]";
	}
	
	public void addDestination() {
		
		sqlTemplate.getJdbcOperations().execute(CREATE_DESTINATION);
//		String sql ="CREATE TABLE IF NOT EXISTS destination(id INTEGER PRIMARY KEY, nom TEXT, pays TEXT, jours INTEGER)";
		Map<String, Object> n = new HashMap<String, Object>();
		n.put("n", "Madrid");
		n.put("p", "Espagne");
		n.put("j", "10");
		
//		sql = "INSERT INTO destination(nom,pays,jours) VALUES(:n,:p,:j)";
		sqlTemplate.update(INSERT_DESTINATION, n);
		
		n.put("n", "Barcelone");
		n.put("p", "Espagne");
		n.put("j", "22");
		
		sqlTemplate.update(INSERT_DESTINATION, n);
	}
	
	public void afficheList() {
		List<Map<String, Object>> tout = sqlTemplate.getJdbcOperations()
													.queryForList(LIST_DESTINATION);
		int count = sqlTemplate.getJdbcOperations().queryForObject(COUNT_DESTINATION, Integer.class);
		System.out.println("count" + count);
		for (int index=0; index< count; index++) {
			System.out.println(tout.get(index).get("id")+
					" \t| " + tout.get(index).get("nom")+
					" \t| " + tout.get(index).get("pays")+ 
					" \t| " + tout.get(index).get("jours") );
		}
//		while (tout.get(index).get("id") != null) {
//			System.out.println(tout.get(index).get("id")+" | " + tout.get(index).get("nom")+" | " + tout.get(index).get("pays") + " | " + tout.get(index).get("jours") );
//			index++;
//		}
		
	}
		
	
	
	
	
	
}
