package fr.it_akademy.jeux.business;

import java.time.LocalDate;
import java.util.*;

public class Jeu {
    private String nom;
    private Long id;
    private LocalDate dateSortie;
    private static Long compteur = 0L;
    private Editeur editeur;
    private ArrayList<Plateforme> plateformes = new ArrayList<>();

    public Jeu() {
        id = ++compteur;
    }

    public Jeu(String nom) {
        this.nom = nom;
    }

    public Jeu(String nom, LocalDate dateSortie) {
        this();
        this.nom = nom;
        this.dateSortie = dateSortie;
    }

    public Jeu(String nom, LocalDate dateSortie, Editeur editeur, ArrayList<Plateforme> plateformes) {
        this(nom, dateSortie);
        this.editeur = editeur;
        this.plateformes = plateformes;
    }

    public Jeu(String nom, LocalDate dateSortie, Editeur editeur) {
        this(nom, dateSortie);
        this.editeur = editeur;
    }

    public Jeu(String nom, LocalDate dateSortie, Editeur editeur, Plateforme plateforme) {
       this(nom,dateSortie,editeur);
       this.plateformes.add(plateforme);
    }

    public Editeur getEditeur() {
        return editeur;
    }

    public void setEditeur(Editeur editeur) {
        this.editeur = editeur;
    }

    public ArrayList<Plateforme> getPlateformes() {
        return plateformes;
    }

    public void setPlateformes(ArrayList<Plateforme> plateformes) {
        this.plateformes = plateformes;
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

    public LocalDate getDateSortie() {
        return dateSortie;
    }

    public void setDateSortie(LocalDate dateSortie) {
        this.dateSortie = dateSortie;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Jeu.compteur = compteur;
    }

    @Override
    public String toString() {
        return "nom=" + nom + ", dateSortie=" + dateSortie + ", editeur=" + editeur + ", plateformes=" + plateformes;
    }
    //  id=" + id + ",
}