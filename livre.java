package tp6;

public class livre extends article{
	String nomedit;
	public livre(String titre, int numid, int nbpage, String nomauteur, String nomedit) {
		super(titre, numid, nbpage, nomauteur);
	    this.nomedit = nomedit;
	    }

	  
	    public String getnomedit() {
	        return nomedit;
	    }

	    public void setnomedit(String nomedit) {
	        this.nomedit = nomedit;
	    }

	   
	    public void edition() {
	        super.edition();
	        System.out.println("Nom de l'éditeur : " + nomedit);
	    }
}