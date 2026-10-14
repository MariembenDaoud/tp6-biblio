package tp6;

public class main {
    public static void main(String[] args) {
        bibliotheque biblio = new bibliotheque(5);

        biblio.Ajout_doc(new document("Guide", 3, 50));
        biblio.Ajout_doc(new article("Java", 1, 20, "Dupont"));
        biblio.Ajout_doc(new livre("POO", 2, 300, "Martin", "Eyrolles"));
        biblio.Ajout_doc(new périodique("News", 4, 60, "Mensuel"));

        System.out.println("\n--- Inventaire trié ---");
        biblio.Inventaire_doc();

        System.out.println("\n--- Filtrage : Livres ---");
        biblio.liste_livre().Inventaire_doc();

        System.out.println("\n--- Suppression du doc n°2 ---");
        biblio.Supprim_doc(2);
        
        System.out.println("\n--- Nouvel inventaire ---");
        biblio.Inventaire_doc();
    }
}