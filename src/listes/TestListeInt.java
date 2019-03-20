package listes;

import java.util.*;

public class TestListeInt {

	public static void exo1() { 
		ArrayList <Integer> list = new ArrayList<>();
		list.add(-1);
		list.add(5);
		list.add(7);
		list.add(3);
		list.add(-2);
		list.add(4);
		list.add(8);
		list.add(5);
		
		for(int i : list) {
			System.out.println(i);
		}
		
		int max = 0;
		for(int i : list) {
			if(i > max)
				max = i;
		}
		System.out.println(max);
		
		int min = 1000;
		for(int i : list) {
			if(i < min) {
				min = i;
			}
		}
		list.remove(list.indexOf(min));
		
		for(int i : list) {
			if(i < 0) {
				int newInt = i*-1;
				list.set(list.indexOf(i), newInt);
			}
		}
		System.out.println(list);

	}
	
	

}
