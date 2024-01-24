package fr.it_akademy.jeux.business;

import java.util.*;

public class Editeur {
    private Long id;
    private String nom;
    private ArrayList<Jeu> jeux = new ArrayList<>();
    private static Long compteur = 0L;

    public Editeur() {
        id = ++compteur;
    }

    public Editeur(String nom) {
        this.nom = nom;
    }

    public Editeur(String nom, ArrayList<Jeu> jeux) {
        this();
        this.nom = nom;
        this.jeux = jeux;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<Jeu> getJeux() {
        return jeux;
    }

    public void setJeux(ArrayList<Jeu> jeux) {
        this.jeux = jeux;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Editeur.compteur = compteur;
    }

    @Override
    public String toString() {
        return nom ;
    }
    // [id=" + id + ", + ", jeux=" + jeux + "]"
}
