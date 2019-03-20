package entites;

public class Personne {

	String nom;
	String prenom;
	AdressePostale adressePostale;
	
	public Personne(String nom, String prenom, AdressePostale adressePostale) {
		this.nom = nom;
		this.prenom = prenom;
		this.adressePostale = adressePostale;
	}
	
	public void affiche(){
		System.out.println(this.nom.toUpperCase());
		System.out.println(this.prenom);
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public void setAdressePostale(AdressePostale adressePostale){
		this.adressePostale = adressePostale;
	}
	
	public String getNom() {
		return this.nom;
	}
	
	public String getPrenom() {
		return this.prenom;
	}
	
	public AdressePostale getAdressePostale() {
		return this.adressePostale;
	}
}
