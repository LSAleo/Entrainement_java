package fr.it_akademy.motus.leo;
import fr.it_akademy.motus.leo.business.*;
import java.time.LocalDate;
import java.util.*;

public class App {

    private static int motAleatoire = 0 ;
    private static ArrayList<Mot> mots = new ArrayList<>();
    static Random random = new Random();

    public static void main(String[] args) {
        ajouterMots();
        choisirMots();
        demanderMot();
    }

    private static void demanderMot() {

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
    private static void choisirMots() {
        motAleatoire = 1 + random.nextInt(10);
        motAleatoire = random.nextInt(mots.size()); // Génère un indice aléatoire dans la plage des indices des mots
        Mot motChoisi = mots.get(motAleatoire);

        System.out.println("Mot choisi : " + motChoisi.getMot());
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