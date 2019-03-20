package sets;
import java.util.*;
public class TestSetDouble {

	public static void main(String args[]) {
		HashSet<Double> set = new HashSet<>();
		set.add(1.5);set.add(8.25);set.add(-7.32);set.add(13.3);set.add(-12.45);set.add(48.5);set.add(0.01);
		
		for(double i : set) {
			System.out.println(i);
		}
		
		double max = 0;
		for(double i : set) {
			if(i > max)
				max = i;
		}
		System.out.println(max);
		
		
		double min = 1000;
		for(double i : set) {
			if(i < min) {
				min = i;
			}
		}
		set.remove(min);
		System.out.println(set);
		
		for(double i : set) {
			if(i < 0) {
				double newInt = i*-1;
				set.remove(i);
				set.add(newInt);
			}
		}
		System.out.println(set);
	}
}
