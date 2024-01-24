package fr.it_akademy.motus.leo;
import fr.it_akademy.motus.leo.business.*;
import java.time.LocalDate;
import java.util.*;

public class App {

    private static int motAleatoire = 0 ;
    private static ArrayList<Mot> mots = new ArrayList<>();
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        ajouterMots();
        Partie partieEnCours = ajouterPartie();

        while (demanderMot(partieEnCours)) {
            // rien à mettre
        }
    }

    private static Partie ajouterPartie() {
        Partie partie = new Partie();
        partie.setMot(choisirMots());
        return partie;
    }

    private static boolean demanderMot(Partie partie) {
        if (partie.getEssais().size() >= 6) {
            System.out.println("Perdu");
            return false;
        }

        System.out.println("Essai " + (partie.getEssais().size()+1) + " : ");
        String motSaisi = scanner.nextLine();
        Essai essai = new Essai(motSaisi, partie);
        // On ajoute un nouvel essai à la partie donnée en paramètre
        partie.getEssais().add(essai);
        if (motSaisi.equals(partie.getMot().getNom())) {
            System.out.println("Bravo !");
        }
        return true;
    }

    /* 
    private static void choisirMots() {

        motAleatoire = 1 + random.nextInt(10);

        for (Mot mot : mots) {
            if (mot.getId() == motAleatoire) {
                System.out.println("Mot choisi : " + mot.getMot());
                break;
            }
        }
    } 
    */
    private static Mot choisirMots() {
        motAleatoire = 1 + random.nextInt(10);
        motAleatoire = random.nextInt(mots.size()); // Génère un indice aléatoire dans la plage des indices des mots
        Mot motChoisi = mots.get(motAleatoire);

        System.out.println("Mot choisi : " + motChoisi.getMot());
        return motChoisi;
    }


    private static void ajouterMots() {
        mots.add(new Mot("piscine"));
        mots.add(new Mot("changer"));
        mots.add(new Mot("courant"));
        mots.add(new Mot("energie"));
        mots.add(new Mot("fournir"));
        mots.add(new Mot("jardins"));
        mots.add(new Mot("lecteur"));
        mots.add(new Mot("marquer"));
        mots.add(new Mot("plainte"));
        mots.add(new Mot("riviere"));
    }
    
}