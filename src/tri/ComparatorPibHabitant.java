package tri;

import java.util.Comparator;

import sets.Pays;

public class ComparatorPibHabitant implements Comparator<Pays>{

	@Override
	public int compare(Pays o1, Pays o2) {
		if(o1.getPibPerHabitant() < o2.getPibPerHabitant()) {
			return -1;
		}
		else if(o1.getPibPerHabitant() > o2.getPibPerHabitant())
		{
			return 1;
		}
		else {
			return 0;
		}	
	}

	
}
