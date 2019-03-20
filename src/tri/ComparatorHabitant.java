package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays arg0, Pays arg1) {
		// TODO Auto-generated method stub
		if(arg0.getNbHabitants() < arg1.getNbHabitants()) {
			return -1;
		}
		else if (arg0.getNbHabitants() > arg1.getNbHabitants()) {
			return 1;
		}
		else {
			return 0;
		}
	}

	
}
