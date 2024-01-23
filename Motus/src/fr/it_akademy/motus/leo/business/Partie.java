package fr.it_akademy.motus.leo.business;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Partie {
    private Long id;
    private LocalDateTime dateHeureDebut;
    private static Long compteur = 0L;
    private Mot mot;
    private ArrayList<Essai> essais = new ArrayList<>();

    public Partie() {
        id = ++compteur;
    }

    public Partie(LocalDateTime dateHeureDebut, Mot mot, ArrayList<Essai> essais) {
        this.dateHeureDebut = dateHeureDebut;
        this.mot = mot;
        this.essais = essais;
    }

    public Partie(LocalDateTime dateHeureDebut) {
        this();
        this.dateHeureDebut = dateHeureDebut;
    }

    public Partie(LocalDateTime dateHeureDebut, Mot mot) {
        this.dateHeureDebut = dateHeureDebut;
        this.mot = mot;
    }

    public ArrayList<Essai> getEssais() {
        return essais;
    }

    public void setEssais(ArrayList<Essai> essais) {
        this.essais = essais;
    }

    public Partie(LocalDateTime dateHeureDebut, Mot mot, Essai essai) {
        this.dateHeureDebut = dateHeureDebut;
        this.mot = mot;
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

    @Override
    public String toString() {
        return "Partie [id=" + id + ", dateHeureDebut=" + dateHeureDebut + ", mot=" + mot + ", essais=" + essais + "]";
    }
}