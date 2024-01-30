package fr.it_akademy.fitness.leo;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.*;
import fr.it_akademy.fitness.leo.business.*;

public class App {

    private static Scanner scanner = new Scanner(System.in);
    private static ArrayList<Adherent> adherents = new ArrayList<>();
    private static ArrayList<Tapis> tapis = new ArrayList<>();
    private static ArrayList<Course> courses = new ArrayList<>();

    public static void main(String[] args) {
        ajouterTapis();
        System.out.println("Bienvenue sur l'IT Akademy Fitness Club !");

        while (true) {
            afficherMenuPrincipal();
            int choix = demanderChoix("Entrez votre choix : ", 1, 5);

            switch (choix) {
            case 1:
                ajouterAdherent();
                break;
            case 2:
                afficherAdherents("distance");
                break;
            case 3:
                ajouterCourse();
                break;
            case 4:
                afficherCourses();
                break;
            case 5:
                System.out.println("Au revoir");
                System.exit(0);
            }
        }
    }

    private static void ajouterTapis() {
        System.out.println("Ajout des tapis de course au démarrage :");
    
        // ajout des trois tapis de course au démarrage
        tapis.add(new Tapis("STAR TRAC #1"));
        tapis.add(new Tapis("STAR TRAC #2"));
        tapis.add(new Tapis("STAR TRAC #3"));
    
        System.out.println("Trois tapis de course ajoutés avec succès !");
    }
    

    private static Adherent ajouterAdherent() {
        System.out.print("Entrez le nom de l'adhérent : ");
        String nom = scanner.nextLine();
        System.out.print("Entrez le prénom de l'adhérent : ");
        String prenom = scanner.nextLine();
        Adherent adherent = new Adherent(nom, prenom);
        adherents.add(adherent);
        return adherent;
    }


    /**
     * Cette méthode ajoute une course pour l'adhérent donné en paramètre
     *
     */

    private static void ajouterCourse() {
    System.out.println("Ajout d'une course :");

    // Affichage de la liste des tapis de course
    System.out.println("Voici la liste exhaustive des tapis de course :");
    for (int i = 0; i < tapis.size(); i++) {
        System.out.println((i + 1) + " : " + tapis.get(i).getNom());
    }

    // Demander à l'utilisateur de choisir un tapis
    int idTapis = demanderChoix("Entrez l'id du tapis de course : ", 1, tapis.size()) - 1;
    Tapis tapisChoisi = tapis.get(idTapis);

    // Affichage de la liste des adhérents
    System.out.println("Voici la liste exhaustive des adhérents :");
    for (int i = 0; i < adherents.size(); i++) {
        System.out.println((i + 1) + " : " + adherents.get(i).getNom() + " " + adherents.get(i).getPrenom());
    }

    // Demander à l'utilisateur de choisir un adhérent
    int idAdherent = demanderChoix("Entrez l'id de l'adhérent : ", 1, adherents.size()) - 1;
    Adherent adherentChoisi = adherents.get(idAdherent);

    // Demander les informations sur la course
    System.out.print("Entrez la date et l'heure de début de la course (format yyyy-MM-dd HH:mm) : ");
    String dateHeureDebutString = scanner.nextLine();
    LocalDateTime dateHeureDebut = LocalDateTime.parse(dateHeureDebutString, DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm"));

    int dureeEnMinutes = demanderChoix("Entrez la durée en minutes : ", 1, Integer.MAX_VALUE);

    int distanceEnMetres = demanderChoix("Entrez la distance en mètres : ", 1, Integer.MAX_VALUE);

    // Créer une nouvelle course
    Course nouvelleCourse = new Course(dateHeureDebut, dureeEnMinutes, distanceEnMetres, adherentChoisi, tapisChoisi);


    // Ajouter la course à la liste des courses
    courses.add(nouvelleCourse);

    System.out.println("La course a bien été ajoutée, elle porte l'id " + nouvelleCourse.getId() + ". Adhérent concerné : " + adherentChoisi.getNom() + " " + adherentChoisi.getPrenom() + ", tapis de course concerné : " + tapisChoisi.getNom());
    }

    private static void afficherAdherents(String string) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficherAdherents'");
    }

    private static void afficherCourses() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'afficherCourses'");
    }

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

    private static void afficherMenuPrincipal() {
		System.out.println("MENU PRINCIPAL");
		System.out.println("1 : ajouter un adhérent");
		System.out.println("2 : voir les adhérents triés sur leur distance totale parcourue\n" + "(de la plus grande distance à la plus petite distance)");
		System.out.println("3 : ajouter une course effectuée aujourd'hui");
		System.out.println("4 : voir toutes les courses");
		System.out.println("5 : quitter");
	}
}
