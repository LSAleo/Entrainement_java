import fr.it_akademy.jeux.business.*;

import java.time.LocalDate;
import java.util.*;

public class App {

    private static ArrayList<Editeur> editeurs = new ArrayList<>();
    private static ArrayList<Plateforme> plateformes = new ArrayList<>();
    private static ArrayList<Jeu> jeux = new ArrayList<>();
    public static void main(String[] args) throws Exception {
        ajouterEditeurs();
        ajouterPlateformes();
        ajouterJeux();
        afficherJeux();
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

        jeux.add(new Jeu("The Last Of Us"));

        Jeu minecraft = new Jeu("Minecraft", LocalDate.of(2011,11,18), editeurs.get(2));
        for (Plateforme plateforme : plateformes) {
            minecraft.getPlateformes().add(plateforme);
        }
        jeux.add(minecraft);

        jeux.add(new Jeu("Garry's Mod"));
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