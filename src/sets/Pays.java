package sets;

import java.util.HashSet;

public class Pays implements Comparable<Pays>{

	private String nom;
	private int nbHabitants;
	private double pibPerHabitant;
	
	
	public Pays() {
		this.nom="";
		this.nbHabitants = 0;
		this.pibPerHabitant = 0;
	}
	
	public Pays(String nom, int nbHabitants, double pibPerHabitant) {
		this.nom=nom;
		this.nbHabitants = nbHabitants;
		this.pibPerHabitant = pibPerHabitant;
	}
	
	/**
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * @param nom the nom to set
	 */
	public void setNom(String nom) {
		this.nom = nom;
	}

	/**
	 * @return the nbHabitants
	 */
	public int getNbHabitants() {
		return nbHabitants;
	}

	/**
	 * @param nbHabitants the nbHabitants to set
	 */
	public void setNbHabitants(int nbHabitants) {
		this.nbHabitants = nbHabitants;
	}

	/**
	 * @return the pibPerHabitant
	 */
	public double getPibPerHabitant() {
		return pibPerHabitant;
	}

	/**
	 * @param pibPerHabitant the pibPerHabitant to set
	 */
	public void setPibPerHabitant(int pibPerHabitant) {
		this.pibPerHabitant = pibPerHabitant;
	}
	
	public String toString() {
		Double pib = this.nbHabitants*this.pibPerHabitant;
		return "\n"+this.nom+" : "+this.nbHabitants+" habs. "+pib+" PIB";
	}

	@Override
	public int compareTo(Pays arg0) {
		if(this.pibPerHabitant < arg0.getPibPerHabitant()) {
			return -1;
		}
		else if(this.pibPerHabitant > arg0.getPibPerHabitant()) {
			return 1;
		}else {
			return 0;
		}
	}
	
	
}
