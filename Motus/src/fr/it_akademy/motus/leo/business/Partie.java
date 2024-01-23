package fr.it_akademy.motus.leo.business;
import java.time.LocalDateTime;

public class Partie {
    private Long id;
    private LocalDateTime dateHeureDebut;
    private static Long compteur = 0L;
    private Mot mot;
    private Essai essai;

    public Partie() {
        id = ++compteur;
    }

    public Partie(LocalDateTime dateHeureDebut) {
        this();
        this.dateHeureDebut = dateHeureDebut;
    }

    public Partie(LocalDateTime dateHeureDebut, Mot mot) {
        this.dateHeureDebut = dateHeureDebut;
        this.mot = mot;
    }

    public Partie(LocalDateTime dateHeureDebut, Mot mot, Essai essai) {
        this.dateHeureDebut = dateHeureDebut;
        this.mot = mot;
        this.essai = essai;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateHeureDebut() {
        return dateHeureDebut;
    }

    public void setDateHeureDebut(LocalDateTime dateHeureDebut) {
        this.dateHeureDebut = dateHeureDebut;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Partie.compteur = compteur;
    }

    public Mot getMot() {
        return mot;
    }

    public void setMot(Mot mot) {
        this.mot = mot;
    }

    public Essai getEssai() {
        return essai;
    }

    public void setEssai(Essai essai) {
        this.essai = essai;
    }

    @Override
    public String toString() {
        return "Partie [id=" + id + ", dateHeureDebut=" + dateHeureDebut + ", mot=" + mot + ", essai=" + essai + "]";
    }

}