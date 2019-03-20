package maps;

import java.util.*;

import sets.Pays;

public class TestMapPays {

	public static void main(String args[]) {
		HashMap<String,Pays> map = new HashMap<>();
		
		map.put("USA",new Pays("USA",67795000,38476.7));
		map.put("France", new Pays("France", 67795000, 38476.7));
		map.put("Allemagne", new Pays("Allemagne", 82979100, 47589.972));
		map.put("UK",new Pays("UK", 65105246, 43770.688));
		map.put("Italie",new Pays("Italie", 60483973, 29866));
		map.put("Japon",new Pays("Japon", 126168156, 39058.5));
		map.put("Chine",new Pays("Chine", 1417913092, 7989.72));
		map.put("Russie",new Pays("Russie", 146880400, 11099.20));
		map.put("Inde",new Pays("Inde", 1296834042, 1626.982));
		
		Iterator<String> key = map.keySet().iterator();
		
		while (key.hasNext()) {
			System.out.println(key.next());
		}
		
		Iterator<Pays> val = map.values().iterator();
		
		while(val.hasNext()) {
			System.out.println(val.next());
		}
		
		Iterator<Pays> val1 = map.values().iterator();
		int mini = Integer.MAX_VALUE;
		Pays p = new Pays();
		Pays keys = new Pays();
		while(val1.hasNext()) {
			p = val1.next();
			if(p.getNbHabitants() < mini) {
				mini = p.getNbHabitants();
				keys = p;
				
			}
		}
		System.out.println("bla"+keys);
		map.remove(keys.getNom());
		
		Iterator<String> cle = map.keySet().iterator();
		
		while (cle.hasNext()) {
			System.out.println(cle.next());
		}
		
	}
	
	
	
	
}
