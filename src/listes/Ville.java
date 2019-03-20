package listes;
import java.util.*;

public class Ville {
	private String nom;
	private int nbHabitants;
	
	public Ville() {
		this.nom="";
		this.nbHabitants=0;
	}
	public Ville(String nom, int nbHabitants) {
		this.nom = nom;
		this.nbHabitants = nbHabitants;
	}
	
	public void setNomVille(String newNomVille) {
		this.nom = newNomVille;
	}
	
	public int getNbHabitant() {
		return this.nbHabitants;
	}
	
	public String getNomVille() {
		return this.nom;
	}
	public String toString() {
		return this.nom+", "+this.nbHabitants+" hab.";
	}
	
	public static void main(String args[]) {
		Ville v1 = new Ville("Nice", 343000);
		Ville v2 = new Ville("Carcassone", 47800);
		Ville v3 = new Ville("Narbonne", 53400);
		Ville v4 = new Ville("Lyon", 484000);
		Ville v5 = new Ville("Foix", 9700);
		Ville v6 = new Ville("Pau", 77200);
		Ville v7 = new Ville("Marseille", 850700);
		Ville v8 = new Ville("Tarbes", 40600);
		
		ArrayList<Ville> villes = new ArrayList<Ville>();
		
		villes.add(v1);
		villes.add(v2);
		villes.add(v3);
		villes.add(v4);
		villes.add(v5);
		villes.add(v6);
		villes.add(v7);villes.add(v8);
		int maxi = 0;
		Ville p = new Ville();
		for(Ville v : villes) {
			if(v.getNbHabitant() > maxi) {
				maxi = v.getNbHabitant();
				p = v;
			}
		}
		System.out.println(p.getNomVille());
		
		int mini = 10000;
		Ville z = new Ville();
		for(Ville v : villes) {
			if(v.getNbHabitant() < mini) {
				mini = v.getNbHabitant();
				z = v;
			}
		}
		villes.remove(villes.indexOf(z));
		
		System.out.println(villes);
	

		for(Ville v : villes) {
			if(v.getNbHabitant() > 100000) {
				v.setNomVille(v.getNomVille().toUpperCase());
				villes.set(villes.indexOf(v),v);

			}
		}

		System.out.println(villes);
	}
	
}
