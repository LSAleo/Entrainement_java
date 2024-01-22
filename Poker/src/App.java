import business.*;
import java.time.LocalDate;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Joueur joueur1 = new Joueur("Alexandre", LocalDate.of(2004,06,01));
        Joueur joueur2 = new Joueur("Corentin");
        Joueur joueur3 = new Joueur("Léo");
        joueur3.setDateDeNaissance(LocalDate.of(2004,06,26));
        Joueur joueur4 = new Joueur("Sofiane");
        joueur4.setDateDeNaissance(LocalDate.of(1997,11,28));
        Joueur joueur5 = new Joueur("Fx");

        Couleur couleur1 = new Couleur("Coeur");
        Couleur couleur2 = new Couleur("Pique");
        Couleur couleur3 = new Couleur("Carreau");
        Couleur couleur4 = new Couleur("Trèfle");

        ArrayList<Couleur> couleurs = new ArrayList<>();
        couleurs.add(couleur1);
        couleurs.add(couleur2);
        couleurs.add(couleur3);
        couleurs.add(couleur4);

        for (Couleur couleur : couleurs) {
          System.out.println(couleur);
        }
    }
}
