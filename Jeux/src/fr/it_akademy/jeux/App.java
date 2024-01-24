import fr.it_akademy.jeux.business.*;

import java.time.LocalDate;
import java.util.*;

public class App {

    private static ArrayList<Editeur> editeurs = new ArrayList<>();
    private static ArrayList<Plateforme> plateformes = new ArrayList<>();
    private static ArrayList<Jeu> jeux = new ArrayList<>();
    
    /** 
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        ajouterEditeurs();
        ajouterPlateformes();
        ajouterJeux();
        afficherJeux();
        System.out.println("Jeux dispo sur Windows : ");
        for (Jeu jeu : recupererJeuxParPlateforme("Windows")) {
            System.out.println(jeu.getNom());
        }
       
        System.out.println("Jeux dispo sur PS4 : ");
        for (Jeu jeu : recupererJeuxParPlateforme("PS4")) {
            System.out.println(jeu.getNom());
        }
    }

    
    /** 
     * @param nomPlateforme
     * @return ArrayList<Jeu>
     */
    private static ArrayList<Jeu> recupererJeuxParPlateforme(String nomPlateforme) {
        ArrayList<Jeu> jeuxCorrespondants = new ArrayList<>();
        for (Jeu jeu : jeux) {
            for (Plateforme plateforme : jeu.getPlateformes()) {
                if (plateforme.getNom().equals(nomPlateforme)) {
                    jeuxCorrespondants.add(jeu);
                }
            }
        }
        return jeuxCorrespondants;
    }

    private static void afficherJeux() {
        for (Jeu jeu : jeux) {
            System.out.println(jeu);
        }
    }

    private static void ajouterJeux() {
        Jeu detroit = new Jeu("Detroit : Become Human", LocalDate.of(2018,5,25), editeurs.get(1), plateformes.get(0));
        detroit.getPlateformes().add(plateformes.get(2));
        jeux.add(detroit);

        Jeu theLastOfUs = new Jeu("The Last Of Us", LocalDate.of(2013, 6, 14), editeurs.get(0), plateformes.get(0));
        theLastOfUs.getPlateformes().add(plateformes.get(2));
        jeux.add(theLastOfUs);

        Jeu minecraft = new Jeu("Minecraft", LocalDate.of(2011,11,18), editeurs.get(2));
        for (Plateforme plateforme : plateformes) {
            minecraft.getPlateformes().add(plateforme);
        }
        jeux.add(minecraft);

        Jeu garrysmod = new Jeu("Garry's Mod", LocalDate.of(2006, 11, 29), editeurs.get(3), plateformes.get(2));
        jeux.add(garrysmod);
    }

    private static void ajouterPlateformes() {
        plateformes.add(new Plateforme("PS4"));
        plateformes.add(new Plateforme("Switch"));
        plateformes.add(new Plateforme("Windows"));
        plateformes.add(new Plateforme("Android"));
    }

    private static void ajouterEditeurs() {
        editeurs.add(new Editeur("Naughty Dog"));
        editeurs.add(new Editeur("Quantic Dream"));
        editeurs.add(new Editeur("Mojang"));
        editeurs.add(new Editeur("Valve"));
    }
}