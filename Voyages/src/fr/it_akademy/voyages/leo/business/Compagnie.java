package fr.it_akademy.voyages.leo.business;

import java.util.ArrayList;
import java.util.List;

public class Compagnie {
    private static Long compteur = 0L;
    private String nom;
    private Long id;
    private List<Vol> vols = new ArrayList<>();

    public Compagnie(String nom) {
        this.nom = nom;
    }

    public Compagnie(String nom, List<Vol> vols) {
        this(nom);
        this.vols = vols;
    }

    public static Long getCompteur() {
        return compteur;
    }


    public static void setCompteur(Long compteur) {
        Compagnie.compteur = compteur;
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

    public List<Vol> getVols() {
        return vols;
    }

    public void setVols(List<Vol> vols) {
        this.vols = vols;
    }

    @Override
    public String toString() {
        return " " + nom + ", id=" + id + ", vols=" + vols;
    }

}