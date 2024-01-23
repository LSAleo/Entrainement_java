package fr.it_akademy.motus.leo.business;
import java.time.LocalDateTime;

public class Partie {
    private Long id;
    private LocalDateTime dateHeureDebut;
    private static Long compteur = 0L;

    public Partie() {
        id = ++compteur;
    }

    public Partie(LocalDateTime dateHeureDebut) {
        this();
        this.dateHeureDebut = dateHeureDebut;
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

    @Override
    public String toString() {
        return "Partie [id=" + id + ", dateHeureDebut=" + dateHeureDebut + "]";
    }
}
