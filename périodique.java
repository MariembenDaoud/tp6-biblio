package tp6;

public class périodique extends document {
	String freq;
    public périodique(String titre, int numid, int nbpage, String freq) {
    	super(titre, numid, nbpage);
        this.freq = freq;
    }

    public String getfreq() {
        return freq;
    }

    public void setfreq(String freq) {
        this.freq = freq;
    }

    public void edition() {
        super.edition();
        System.out.println("Fréquence de parution : " + freq);
    }
}