package fr.it_akademy.motus.leo.business;
import java.time.LocalDateTime;

public class Essai {
    private Long id;
    private String contenu;
    private LocalDateTime dateHeureEnvoi;
    private static Long compteur = 0L;
    private Partie partie;

    public Essai() {
        id = ++compteur;
    }

    public Essai(String contenu, LocalDateTime dateHeureEnvoi) {
        this();
        this.contenu = contenu;
        this.dateHeureEnvoi = dateHeureEnvoi;
    }

    public Essai(String contenu, LocalDateTime dateHeureEnvoi, Partie partie) {
        this.contenu = contenu;
        this.dateHeureEnvoi = dateHeureEnvoi;
        this.partie = partie;
    }

    public Essai(String motSaisi, Partie partie2) {
        //TODO Auto-generated constructor stub
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContenu() {
        return contenu;
    }

    public void setContenu(String contenu) {
        this.contenu = contenu;
    }

    public LocalDateTime getDateHeureEnvoi() {
        return dateHeureEnvoi;
    }

    public void setDateHeureEnvoi(LocalDateTime dateHeureEnvoi) {
        this.dateHeureEnvoi = dateHeureEnvoi;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Essai.compteur = compteur;
    }

    public Partie getPartie() {
        return partie;
    }

    public void setPartie(Partie partie) {
        this.partie = partie;
    }

    @Override
    public String toString() {
        return "Essai [id=" + id + ", contenu=" + contenu + ", dateHeureEnvoi=" + dateHeureEnvoi + ", partie=" + partie + "]";
    }
}