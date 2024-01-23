import business.*;
import java.time.LocalDate;
import java.util.*;
public class App {

    private static ArrayList<Ville> villes = new ArrayList<>();
    private static ArrayList<Joueur> joueurs = new ArrayList<>();
    private static ArrayList<Couleur> couleurs = new ArrayList<>();
    private static ArrayList<Carte> cartes = new ArrayList<>();

    public static void main(String[] args) throws Exception {
    

        ajouterVilles();
        ajouterJoueurs();
        ajouterCouleurs();
        ajouterCartes();
        afficherCartes();
        melangerCartes();
        distribuerCartes();

        for (Joueur joueur : joueurs){
            analyserMain(joueur);
        }

   
    }
    private static void afficherCartes() {
        for (Carte carte : cartes) {
            System.out.println(carte);
        }
    }
    private static void analyserMain(Joueur joueur) {

        int[] tableauDOccurrences = new int[15];

        boolean possedeCarre = false;
        boolean possedeBrelan = false;
        boolean possedePaire = false;
        boolean possedeFull = false;
        boolean possedeDoublePaire = false;
        boolean possedeCouleur = false;

        int nbPaires = 0;

        List<Carte> mainJoueur = joueurs.get(0).getMain();
        boolean possedeSuite = false;

        Collections.sort(mainJoueur, Comparator.comparingInt(Carte::getValeur));
        for (int i = 0; i < mainJoueur.size()-1; i++) {
            if (mainJoueur.get(i).getValeur() +1 == mainJoueur.get(i+1).getValeur() ){
                possedeSuite = true;
            }
 
        }
        
        for (Carte carte : joueurs.get(0).getMain()) {
            tableauDOccurrences[carte.getValeur()]++;
        }

        for (Couleur couleur : couleurs) {
            int nbCarteCouleur = 0;
            for (Carte carte : joueurs.get(0).getMain()) {
                if (carte.getCouleur().equals(couleur)) {
                    nbCarteCouleur++;
                }
            }
            if (nbCarteCouleur == 5) {
                possedeCouleur = true;
                break;
            }
        }
        
        for (int i = 0; i < tableauDOccurrences.length; i++) {
            System.out.println(tableauDOccurrences[i]);
            if (tableauDOccurrences[i] == 4) {
                possedeCarre = true;
            }else if (tableauDOccurrences[i] == 3 && nbPaires == 0) {
                possedeBrelan = true;
            }else if (tableauDOccurrences[i] == 2) {
                nbPaires = nbPaires + 1;
            }else if (nbPaires == 1 && possedeBrelan == true) {
                possedeFull = true;
            }else if (nbPaires == 2) {
                possedeDoublePaire = true;
            }
        }

        if (nbPaires == 1 && possedeBrelan == false){
            System.out.println("Possède une paire");
        }
        if (possedeDoublePaire == true) {
            System.out.println("Possède une double paire");
        }
        if (possedeBrelan == true && nbPaires == 0) {
            System.out.println("Possède un brelan");
        }
        if (possedeBrelan == true && possedePaire == true && possedeFull == true) {
            System.out.println("Possède un full");
        }
        if (possedeCarre == true) {
            System.out.println("Possède un carré");
        }
        if (possedeCouleur == true && !possedeSuite) {
            System.out.println("Possède une couleur");
        }
        if (possedeSuite == true  && !possedeCouleur) {
            System.out.println("Possède une suite");
        }
        if (possedeCouleur == true && possedeSuite == true) {
            System.out.println("Possède une quinte flush");
        }
    }

    private static void distribuerCartes() {
        for (int i = 0; i < 5; i++) {
            for (Joueur joueur : joueurs) {
                joueur.getMain().add(cartes.remove(0));
            }
        }
    }

    private static void melangerCartes() {
        Collections.shuffle(cartes);
    }

    private static void ajouterCartes() {
        for (Couleur couleur : couleurs) {

            for (int i = 2; i <= 14 ; i++) {
                cartes.add(new Carte(i, couleur));
            }
        }
    }

    private static void ajouterCouleurs() {
        Couleur couleur1 = new Couleur("Coeur");
        Couleur couleur2 = new Couleur("Pique");
        Couleur couleur3 = new Couleur("Carreau");
        Couleur couleur4 = new Couleur("Trèfle");

        couleurs.add(couleur1);
        couleurs.add(couleur2);
        couleurs.add(couleur3);
        couleurs.add(couleur4);
    }

    private static void ajouterJoueurs() {
        Joueur joueur1 = new Joueur("Alexandre", LocalDate.of(2004,06,01));
        joueur1.setVille(villes.get(5));
        Joueur joueur2 = new Joueur("Corentin");
        joueur2.setVille(villes.get(4));
        Joueur joueur3 = new Joueur("Léo");
        joueur3.setDateDeNaissance(LocalDate.of(2004,06,26));
        joueur3.setVille(villes.get(1));
        Joueur joueur4 = new Joueur("Sofiane");
        joueur4.setDateDeNaissance(LocalDate.of(1997,11,28));
        joueur4.setVille(villes.get(2));
        Joueur joueur5 = new Joueur("Fx");
        joueur5.setVille(villes.get(3));

        joueurs.add(joueur1);
        joueurs.add(joueur2);
        joueurs.add(joueur3);
        joueurs.add(joueur4);
        joueurs.add(joueur5);
    }

    private static void ajouterVilles() {
        Ville ville1 = new Ville("Les Sauvages","69170");
        Ville ville2 = new Ville("Neuville","69250");
        Ville ville3 = new Ville("Saint-Galmier","42330");
        Ville ville4 = new Ville("Francheville","69340");
        Ville ville5 = new Ville("Anthon","38280");
        villes.add(ville1);
        villes.add(ville2);
        villes.add(ville3);
        villes.add(ville4);
        villes.add(ville5);
    }
}