package fr.it_akademy.motus.leo;
import fr.it_akademy.motus.leo.business.*;

import java.io.*;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDate;
import java.util.*;

import javax.print.DocFlavor.URL;

public class App {

    private static int motAleatoire = 0 ;
    private static ArrayList<Mot> mots = new ArrayList<>();
    private static Random random = new Random();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //ajouterMots();
        importerMots();
        System.out.println("Bienvenue sur Motus !");
        System.out.println("Nombre de mots à 7 chiffres : " + mots.size());
        Partie partieEnCours = ajouterPartie();
        System.out.println("Mot à deviner : " + partieEnCours.getMot().getNom());
        boolean aTrouve = false;

        while (partieEnCours.getEssais().size()<6 && (aTrouve = demanderMot(partieEnCours))==false) {}
       
        if (aTrouve) {
            System.out.println("Bravo ! Vous avez trouvez en " + partieEnCours.getEssais());
        }
        else {
            System.out.println("Vous avez perdu, le mot à deviner était " + partieEnCours.getMot().getNom());
        }
    }

    private static void importerMots() {
        // Créer une variable String contenant l'url
        String urlString = "https://raw.githubusercontent.com/gverdier/motus/master/Console/Dictionnaire7.txt";

        try {
        URI uri = new URI(urlString); //Créer une URI
        java.net.URL urlObj = uri.toURL(); // Convertir une URI en URL

        BufferedReader reader = new BufferedReader(new InputStreamReader(urlObj.openStream()));

        String ligne = null;

        while ((ligne = reader.readLine()) != null) {
            System.out.println(ligne);
            Mot mot = new Mot(ligne);
            mots.add(mot);
        }

        } catch (URISyntaxException | IOException e) {
        e.printStackTrace();
        }
        }

    private static Partie ajouterPartie() {
        Partie partie = new Partie();
        partie.setMot(choisirMots());
        return partie;
    }

/**
     * Cette méthode demande au joueur de saisir un mot
     *
     * @param partie la partie en cours
     * @return un booleen qui indique si le joueur a trouvé le mot à deviner
     */
    private static boolean demanderMot(Partie partie) {
        System.out.print("Essai " + (partie.getEssais().size()+1) + ": ");
        String motSaisi = scanner.nextLine();
        // On ajoute un nouvel essai à la partie donnée en paramètre
        Essai essai = new Essai(motSaisi, partie);
        partie.getEssais().add(essai);

        // On compare le mot saisi avec le mot à deviner
        if (motSaisi.equals(partie.getMot().getNom())) {
            return true;
        }
        else {
            // on parcours les caractères du mot saisi
            for (int i = 0; i < motSaisi.length(); i++) {
                if (motSaisi.charAt(i) == partie.getMot().getNom().charAt(i)) {
                    System.out.print(motSaisi.substring(i, i + 1));
                    // si une lettre est au mauvais endroit, dire de laquelle il s'agit
                    
                }else{
                    System.out.print("_");
                }
            }
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < motSaisi.length(); i++) {
                // on teste si le caractère à la position e est présente dans le mot à deviner mais mal placer avec indexOf
                if (partie.getMot().getNom().indexOf(motSaisi.charAt(i)) != -1 && motSaisi.charAt(i) != partie.getMot().getNom().charAt(i)) {
                    stringBuilder.append(motSaisi.charAt(i));
                } else {
                    System.out.println("Lettre présente mais au mauvais endroit : " + motSaisi.charAt(i));
                }
            }
            return false;            
        }
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

        return motChoisi;
    }

    /*
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
    */
    
}