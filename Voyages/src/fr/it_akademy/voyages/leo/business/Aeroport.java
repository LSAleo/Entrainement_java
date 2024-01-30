package fr.it_akademy.voyages.leo.business;

import java.util.ArrayList;

public class Aeroport {
    private static Long compteur = 0L;
    private String nom;
    private Long id;

    public Aeroport(String nom) {
        this.id = ++compteur;
        this.nom = nom;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Aeroport.compteur = compteur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " " + nom + ", id=" + id ;
    }

}