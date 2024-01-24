package fr.it_akademy.jeux.business;

import java.util.*;

public class Plateforme {
    private Long id;
    private String nom;
    private ArrayList<Jeu> jeux = new ArrayList<>();
    private static Long compteur = 0L;

    // constructeur par défaut

    public Plateforme() {
        id = ++compteur;
    }
    
    // constructeur avec 1 paramètre

    public Plateforme(String nom) {
        this.nom = nom;
    }

    // constructeur avec 2 paramètres

    public Plateforme(String nom, ArrayList<Jeu> jeux) {
        this();
        this.nom = nom;
        this.jeux = jeux;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        Plateforme.compteur = compteur;
    }

    @Override
    public String toString() {
        return nom ;
    }
    // [id=" + id + ", , jeux=" + jeux;
}
