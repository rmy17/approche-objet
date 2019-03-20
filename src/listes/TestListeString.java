package listes;

import java.util.*;

public class TestListeString {

	public static void main(String args[]) {
		
		ArrayList<String> list = new ArrayList<>();
		list.add("Nice");
		list.add("Carcassone");
		list.add("Narbonne");
		list.add("Lyon");
		list.add("Foix");
		list.add("Pau");
		list.add("Marseille");
		list.add("Tarbes");
		int max = 0;
		String res =" ";
		for (String s : list) {
			if( max < s.length()) {
				max = s.length();
				res = s;
			}
		}
		System.out.println(res);
		
		for (String s : list) {
			String newStr = s.toUpperCase();
			list.set(list.indexOf(s), newStr);
		}

		Iterator<String> iter = list.iterator();
		while (iter.hasNext()) {
			if(iter.next().charAt(0) == 'N') {
				iter.remove();
			}
		}
		System.out.println(list);
	
		
		
	}
	
}
