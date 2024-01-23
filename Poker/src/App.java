import business.*;
import java.time.LocalDate;
import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        ArrayList<Couleur> couleurs = new ArrayList<>();
        ArrayList<Carte> cartes = new ArrayList<>();
        ArrayList<Joueur> joueurs = new ArrayList<>();
        int[] tableauDOccurrences = new int[15];

        Joueur joueur1 = new Joueur("Alexandre", LocalDate.of(2004,06,01));
        Joueur joueur2 = new Joueur("Corentin");
        Joueur joueur3 = new Joueur("Léo");
        joueur3.setDateDeNaissance(LocalDate.of(2004,06,26));
        Joueur joueur4 = new Joueur("Sofiane");
        joueur4.setDateDeNaissance(LocalDate.of(1997,11,28));
        Joueur joueur5 = new Joueur("Fx");

        joueurs.add(joueur1);
        joueurs.add(joueur2);
        joueurs.add(joueur3);
        joueurs.add(joueur4);
        joueurs.add(joueur5);

        Couleur couleur1 = new Couleur("Coeur");
        Couleur couleur2 = new Couleur("Pique");
        Couleur couleur3 = new Couleur("Carreau");
        Couleur couleur4 = new Couleur("Trèfle");

        couleurs.add(couleur1);
        couleurs.add(couleur2);
        couleurs.add(couleur3);
        couleurs.add(couleur4);

        for (Couleur couleur : couleurs) {

            for (int i = 2; i <= 14 ; i++) {
                cartes.add(new Carte(i, couleur));
            }
        }
        Collections.shuffle(cartes);

        // for (Carte carte : cartes) {
        //     System.out.println(carte);
        // }

        for (Joueur joueur : joueurs) {
            for (int i = 0; i < 5; i++) {
                joueur.getMain().add(cartes.remove(0));
            }
        }
        for (Joueur joueur : joueurs) {
            System.out.println(joueur);
        }

        boolean possedeCarre = false;
        boolean possedeBrelan = false;
        boolean possedePaire = false;
        boolean possedeFull = false;
        boolean possedeDoublePaire = false;
        int nbPaires = 0;
        for (Carte carte : joueurs.get(0).getMain()) {
            tableauDOccurrences[carte.getValeur()]++;
        }
        
        for (int i = 0; i < tableauDOccurrences.length; i++) {
            System.out.println(tableauDOccurrences[i]);
            if (tableauDOccurrences[i] == 4) {
                possedeCarre = true;
                System.out.println("Possede un carré" + possedeCarre);
            }else if (tableauDOccurrences[i] == 3) {
                possedeBrelan = true;

            }else if (tableauDOccurrences[i] == 2) {
                possedePaire = true;
                nbPaires = nbPaires + 1;
            }else if (possedePaire == true && possedeBrelan == true) {
                possedeFull = true;
            }else if (nbPaires == 2) {
                possedeDoublePaire = true;
            }
        }

        
    }
}