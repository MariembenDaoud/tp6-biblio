package tp6;

public class article extends document{
	String nomauteur;
	public article(String titre, int numid, int nbpage, String nomauteur) {
    super(titre,numid,nbpage); 
    this.nomauteur = nomauteur;
    }
	
	public String getnomauteur() {
		return nomauteur;
	}
	public void setnomauteur(String nomauteur) {
        this.nomauteur = nomauteur;
    }
	public String getType() {
		return "article";
	}
	public void edition() {
        super.edition();
        System.out.println("Nom de l'auteur : " + nomauteur);
    }
	
}
