package Poker.src.business;

public class Ville {
    private String nom;
    private String codePostal;

    public Ville(String nom, String codePostal) {
        this.nom = nom;
        this.codePostal = codePostal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    @Override
    public String toString() {
        return "Ville [nom=" + nom + ", codePostal=" + codePostal + "]";
    }

}
