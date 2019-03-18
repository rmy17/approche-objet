package essais;

import entites.*;

public class TestPersonne {
	
	public static void main(String []args) {
		AdressePostale a = new AdressePostale(232,"Rue", "de Suzon", 33400);
		Personne p = new Personne("Rémy","VIANNAIS", a);
		}

}
