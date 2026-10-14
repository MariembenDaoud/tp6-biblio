package tp6;

public class bibliotheque {
	private document[] Listdoc;
    private int nbdoc;
    private int capmax;
    
    
    public bibliotheque(int capmax) {
        this.capmax = capmax;
        this.Listdoc = new document[capmax];
        this.nbdoc = 0;
    }
    public int getcapmax() {
        return this.capmax;
    }

   
    public int getnbdoc() {
        return this.nbdoc;
    }
    public void Ajout_doc(document d) {
    	int index = 0;
        while (index < nbdoc && Listdoc[index].getnumid() < d.getnumid()) {
            index++;
        }
        for(int i=nbdoc;i>index;i--) {
            Listdoc[i] = Listdoc[i-1];
        }
        Listdoc[index] = d;
        nbdoc++;
        System.out.println(d.getTitre() + "' ajouté avec succès.");
    }
    
    public void Supprim_doc(int num) {
        int i = 0;
        while (i < nbdoc && Listdoc[i].getnumid() != num) {
            i++;
        }
        if (i < nbdoc) {
            int j = i;
            while (j < nbdoc - 1) {
                Listdoc[j] = Listdoc[j + 1];
                j++;
            }
            
        } else {
           
            System.out.println("Aucun document trouvé avec le numéro d'identification : " + num);
        }
    }
    public void Inventaire_doc() {
        for (int i = 0; i < Listdoc.length; i++) {
            if (Listdoc[i] != null) {
                System.out.println("----------------------------------------");
                Listdoc[i].edition();
            }
        }
        System.out.println("----------------------------------------");
    }
    
    public bibliotheque liste_livre() {
        bibliotheque biblio = new bibliotheque(capmax);
        for(int i=0;i<nbdoc;i++) {
            if (Listdoc[i] instanceof livre) {
            	biblio.Ajout_doc(Listdoc[i]);
            }
        }
        return biblio;
    }
    
    
    public bibliotheque liste_article() {
        bibliotheque biblio = new bibliotheque(capmax);
        for (int i=0;i<nbdoc;i++) {
           if (Listdoc[i] instanceof article && !(Listdoc[i] instanceof livre)) {
                biblio.Ajout_doc(Listdoc[i]);
            }
        }
        return biblio;
    }
    
    public bibliotheque liste_docsimples() {
        bibliotheque biblio = new bibliotheque(capmax);
        for (int i=0; i<nbdoc;i++) {
           
            if (!(Listdoc[i] instanceof article) && !(Listdoc[i] instanceof périodique)) {
                biblio.Ajout_doc(Listdoc[i]);
            }
        }
        return biblio;
    }
    public bibliotheque liste_periodique() {
        bibliotheque biblio = new bibliotheque(capmax);
        for (int i=0;i<nbdoc;i++) {
            if (Listdoc[i] instanceof périodique) {
                biblio.Ajout_doc(Listdoc[i]);
            }
        }
        return biblio;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
