package entites;

public class AdressePostale {
	
	int numRue;
	String typeVoie;
	String nomRue;
	int codePostale;

	public AdressePostale() {
		numRue = 4;
		typeVoie = "Boulevard";
		nomRue = "François Miterrand";
		codePostale = 44800;
	}
	
	public AdressePostale(int nRue, String tVoie, String nameRue, int codePost) {
		numRue = nRue;
		typeVoie = tVoie;
		nomRue = nameRue;
		codePostale = codePost;
	}
	
	
}
