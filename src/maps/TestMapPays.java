package maps;

import java.util.HashMap;

import sets.Pays;

public class TestMapPays {

	public static void main(String args[]) {
		HashMap<String,Pays> map = new HashMap<>();
		
		map.put("USA",new Pays("USA",67795000,38476.7));
		map.put("France", new Pays("France", 67795000, 38476.7));
		map.put("Allemagne", new Pays("Allemagne", 82979100, 47589.972));
		map.put("UK",new Pays("UK", 65105246, 43770.688));
	}
}
