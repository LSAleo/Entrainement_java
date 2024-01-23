package business;

public class Couleur {
    // Attribut(s)
    private String nom;
    private Long id;

    private static Long compteur = 0L;

    public Couleur() {
        id = ++compteur;
    }

    public Couleur(String nom) {
        this();
        this.nom = nom;
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
        return "Couleur [nom=" + nom +"]";
    }
}