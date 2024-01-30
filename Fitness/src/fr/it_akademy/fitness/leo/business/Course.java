package fr.it_akademy.fitness.leo.business;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Course {
    private Long id;
    private static Long compteur = 0L;
    private LocalDateTime dateHeureDebut;
    private int dureeEnMinutes;
    private int distanceEnMetres;
    private Adherent adherent;
    private Tapis tapis;

    // constructeur par défaut
    public Course() {
        this.id = ++compteur;
    }

    public Course(LocalDateTime dateHeureDebut, int dureeEnMinutes, int distanceEnMetres) {
        this();
        this.dateHeureDebut = dateHeureDebut;
        this.dureeEnMinutes = dureeEnMinutes;
        this.distanceEnMetres = distanceEnMetres;
    }
    

    public Course(LocalDateTime dateHeureDebut, int dureeEnMinutes, int distanceEnMetres, Adherent adherent, Tapis tapis) {
        this(dateHeureDebut, dureeEnMinutes, distanceEnMetres);
        this.adherent = adherent;
        this.tapis = tapis;
    }

    public Adherent getAdherent() {
        return adherent;
    }


    public void setAdherent(Adherent adherent) {
        this.adherent = adherent;
    }


    public Tapis getTapis() {
        return tapis;
    }


    public void setTapis(Tapis tapis) {
        this.tapis = tapis;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Course.compteur = compteur;
    }

    public LocalDateTime getDateHeureDebut() {
        return dateHeureDebut;
    }

    public void setDateHeureDebut(LocalDateTime dateHeureDebut) {
        this.dateHeureDebut = dateHeureDebut;
    }

    public int getDureeEnMinutes() {
        return dureeEnMinutes;
    }

    public void setDureeEnMinutes(int dureeEnMinutes) {
        this.dureeEnMinutes = dureeEnMinutes;
    }

    public int getDistanceEnMetres() {
        return distanceEnMetres;
    }

    public void setDistanceEnMetres(int distanceEnMetres) {
        this.distanceEnMetres = distanceEnMetres;
    }

    @Override
    public String toString() {
        return "Course [id=" + id + ", dateHeureDebut=" + dateHeureDebut + ", dureeEnMinutes=" + dureeEnMinutes + ", distanceEnMetres=" + distanceEnMetres + ", adherent=" + adherent + ", tapis=" + tapis + "]";
    }

}
