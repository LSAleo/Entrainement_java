package fr.it_akademy.motus.leo.business;

public class Mot {
    private Long id;
    private String nom;
    private static Long compteur = 0L;

    public Mot() {
        id = ++compteur;
    }

    public Mot(String nom) {
        this();
        this.nom = nom;
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

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Mot.compteur = compteur;
    }

    @Override
    public String toString() {
        return "Mot [id=" + id + ", nom=" + nom + "]";
    }

    public String getMot() {
        return nom;
    }
}