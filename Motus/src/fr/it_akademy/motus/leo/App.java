package fr.it_akademy.motus.leo;
import fr.it_akademy.motus.leo.business.*;
import java.time.LocalDate;
import java.util.*;

public class App {

    private static ArrayList<Mot> mots = new ArrayList<>();

    public static void main(String[] args) {
        ajouterMots();
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