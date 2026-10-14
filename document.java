package tp6;

public class document {
	String titre;
	int numid;
	int nbpage;
	
	public document(String titre, int numid, int nbpage) {
        this.titre = titre;
        this.numid = numid;
        this.nbpage = nbpage;
    }
	public String getType() {
		return "document" ;
	}
	
	
	public void edition() {
	    System.out.println("Type : " + getType());
	    System.out.println("Numéro d'identification : " + numid);
	    System.out.println("Titre : " + titre);
	    System.out.println("Nombre de pages : " + nbpage);
	}
	
	public String getTitre() {
        return titre;
    }
	public void setTitre(String titre) {
        this.titre = titre;
    }
	public int getnumid() {
		return numid;
	}
	public void setnumid(int numid) {
		this.numid=numid;
	}
	public int getnbpages() {
        return nbpage;
    }

    public void setnbpage(int nbpage) {
        this.nbpage = nbpage;
    }
}

