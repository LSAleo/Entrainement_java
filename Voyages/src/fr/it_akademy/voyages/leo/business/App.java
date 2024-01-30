/**
 * Cette classe représente une application de gestion de compagnies aériennes et de vols.
 * Elle permet d'ajouter des compagnies, afficher la liste des compagnies, ajouter des vols,
 * afficher les vols triés par prix, et quitter l'application.
 */
package fr.it_akademy.voyages.leo;

import fr.it_akademy.voyages.leo.business.*;
import fr.it_akademy.voyages.leo.util.ComparateurPrix;

import java.time.LocalTime;
import java.util.*;

/**
 * La classe principale de l'application qui contient la méthode main.
 */
public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static List<Compagnie> compagnies = new ArrayList<>();
    private static List<Aeroport> aeroports = new ArrayList<>();
    private static List<Vol> vols = new ArrayList<>();

    /**
     * Méthode principale qui lance l'application et gère le menu principal.
     * @param args Les arguments de la ligne de commande.
     * @throws Exception En cas d'erreur lors de l'exécution.
     */
    public static void main(String[] args) throws Exception {
        System.out.println("Bienvenue");
        initialiserAeroportsParDefaut();
        while (true) {
            afficherMenuPrincipal();
            int choix = demanderChoix("Entrez votre choix : ", 1, 5);

            switch (choix) {
                case 1:
                    ajouterCompagnie();
                    break;
                case 2:
                    afficherCompagnie();
                    break;
                case 3:
                    ajouterVol();
                    break;
                case 4:
                    ComparateurPrix.afficherVolsTriesSurPrix(vols);
                    break;
                case 5:
                    System.out.println("Au revoir");
                    System.exit(0);
            }
        }
    }

    /**
     * Affiche la liste des aéroports.
     */
    private static void afficherAeroports() {
        System.out.println("Voici la liste exhaustive des aéroports :");
        for (int i = 0; i < aeroports.size(); i++) {
            System.out.println((i + 1) + " : " + aeroports.get(i).getNom());
        }
    }

    /**
     * Ajoute un nouveau vol à la liste des vols.
     */
    private static void ajouterVol() {
        System.out.println("Ajouter un vol :");

        // Affiche la liste des aéroports
        System.out.println("Voici la liste exhaustive des aéroports :");
        afficherAeroports();

        // Demande à l'utilisateur de choisir les aéroports de départ et d'arrivée
        int idAeroportDepart = demanderChoix("Entrez l'id de l'aéroport de départ : ", 1, aeroports.size());
        int idAeroportArrivee = demanderChoix("Entrez l'id de l'aéroport d'arrivée : ", 1, aeroports.size());

        Aeroport aeroportDepart = aeroports.get(idAeroportDepart - 1);
        Aeroport aeroportArrivee = aeroports.get(idAeroportArrivee - 1);

        System.out.println("Voici la liste exhaustive des compagnies :");
        afficherCompagnie();

        // Demande à l'utilisateur de choisir la compagnie
        int idCompagnie = demanderChoix("Entrez l'id de la compagnie : ", 1, compagnies.size());
        Compagnie compagnie = compagnies.get(idCompagnie - 1);

        // Demande à l'utilisateur de saisir les détails du vol
        System.out.print("Entrez l'heure de départ au format HH:mm : ");
        String heureDepartStr = scanner.nextLine();
        LocalTime heureDepart = LocalTime.parse(heureDepartStr);

        System.out.print("Entrez l'heure d'arrivée au format HH:mm : ");
        String heureArriveStr = scanner.nextLine();
        LocalTime heureArrive = LocalTime.parse(heureArriveStr);

        System.out.print("Entrez le prix en euros : ");
        float prixEnEuros = Float.parseFloat(scanner.nextLine());

        // Crée un nouveau vol et l'ajoute à la liste des vols
        Vol nouveauVol = new Vol(aeroportDepart, aeroportArrivee, compagnie, heureDepart, heureArrive, prixEnEuros);
        vols.add(nouveauVol);

        System.out.println("Le vol a bien été ajouté !");
    }

    /**
     * Affiche la liste des compagnies.
     */
    private static void afficherCompagnie() {
        System.out.println("Liste des compagnies :");
        for (int i = 0; i < compagnies.size(); i++) {
            Compagnie compagnie = compagnies.get(i);
            System.out.println((i + 1) + " : " + "ID: " + compagnie.getId() + ", Nom: " + compagnie.getNom());
        }
    }

    /**
     * Initialise les aéroports par défaut.
     */
    private static void initialiserAeroportsParDefaut() {
        aeroports.add(new Aeroport("Fort-De-France"));
        aeroports.add(new Aeroport("Paris"));
        aeroports.add(new Aeroport("Bangkok"));
    }

    /**
     * Ajoute une nouvelle compagnie à la liste des compagnies.
     */
    private static void ajouterCompagnie() {
        System.out.print("Entrez le nom de la nouvelle compagnie : ");
        String nomCompagnie = scanner.nextLine();
        Compagnie nouvelleCompagnie = new Compagnie(nomCompagnie);
        compagnies.add(nouvelleCompagnie);
        System.out.println("Compagnie ajoutée avec succès !");
    }

    /**
     * Affiche le menu principal.
     */
    private static void afficherMenuPrincipal() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("1 : ajouter une compagnie");
        System.out.println("2 : voir toutes les compagnies");
        System.out.println("3 : ajouter un vol");
        System.out.println("4 : voir les vols triés sur par prix (du moins cher au plus cher)");
        System.out.println("5 : quitter");
    }

    /**
     * Demande à l'utilisateur de saisir un choix entre deux bornes.
     * @param message Le message à afficher pour demander le choix.
     * @param borneMin La borne inférieure pour le choix.
     * @param borneMax La borne supérieure pour le choix.
     * @return La valeur choisie par l'utilisateur.
     */
    private static int demanderChoix(String message, int borneMin, int borneMax) {
        int valeur = borneMin - 1;
        do {
            System.out.print(message);
            try {
                String saisie = scanner.nextLine();
                valeur = Integer.parseInt(saisie);
                if (valeur < borneMin || valeur > borneMax) {
                    System.out.println("Merci de saisir un nombre compris entre " + borneMin + " et " + borneMax);
                }
            } catch (Exception e) {
                System.out.println("Merci de saisir un nombre");
            }

        } while (!(valeur >= borneMin && valeur <= borneMax));
        return valeur;
    }
}