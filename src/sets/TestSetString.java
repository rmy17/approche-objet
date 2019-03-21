package sets;

import java.util.*;

import listes.Ville;
public class TestSetString {

	public static void main(String args[]) {
		HashSet<String> set = new HashSet<>();  

		set.add("USA");set.add("France");set.add("Allemagne");set.add("UK");set.add("Italie");set.add("Japon");set.add("Chine");set.add("Russie");set.add("Inde");

		int max = 0;
		String res =" ";
		for (String s : set) {
			if( max < s.length()) {
				max = s.length();
				res = s;
			}
		}
		System.out.println(res);
		set.remove(res);
		HashSet<String> setNew = new HashSet<>(); 
		for (String s : set) {
			String newStr = s.toUpperCase();
			setNew.add(newStr);
		}
		set=setNew;

		System.out.println(set);

		HashSet<Pays> pays = new HashSet<>();  

		pays.add(new Pays("USA",67795000,38476.7));
		pays.add(new Pays("France", 67795000, 38476.7));
		pays.add(new Pays("Allemagne", 82979100, 47589.972));
		pays.add(new Pays("UK", 65105246, 43770.688));
		pays.add(new Pays("Italie", 60483973, 29866));
		pays.add(new Pays("Japon", 126168156, 39058.5));
		pays.add(new Pays("Chine", 1417913092, 7989.72));
		pays.add(new Pays("Russie", 146880400, 11099.20));
		pays.add(new Pays("Inde", 1296834042, 1626.982));
		
		double maxi = 0;
		Pays pa = new Pays();
		for(Pays p : pays) {
			if(p.getPibPerHabitant() > maxi) {
				maxi = p.getPibPerHabitant();
				pa = p;
			}
		}
		System.out.println(pa.getNom());

		maxi = 0;
		Pays pay = new Pays();
		for(Pays p : pays) {
			double  pib = p.getNbHabitants()*p.getNbHabitants();
			if(pib > maxi) {
				maxi = pib;
				pay = p;
			}
		}
		
		System.out.println(pay);
		
		
		double mini = Double.MAX_VALUE;
		Pays paa = new Pays();
		for(Pays p : pays) {
			double  pib = p.getNbHabitants()*p.getPibPerHabitant();
			if(pib < mini) {
				mini = pib;
				paa = p;
			}
		}
		pays.remove(paa);
		paa.setNom(paa.getNom().toUpperCase());
		System.out.println("PAYS"+paa);
		pays.add(paa);
		
		System.out.println("Maj :"+pays);
		
		
		
		
		mini = Double.MAX_VALUE;
		Pays par = new Pays();
		for(Pays p : pays) {
			double  pib = p.getNbHabitants()*p.getPibPerHabitant();
			if(pib < mini) {
				mini = pib;
				par = p;
			}
		}
		pays.remove(par);

		System.out.println(pays);
		
	}
}
