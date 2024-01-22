package business;

public class Carte {
    private String nom;

    private int valeur;

    private Couleur couleur;

    public Carte(int valeur, Couleur couleur) {
        // le nom dépend de la valeur
        switch (valeur) {
            case 11:
                nom = "Valet";
                break;
            case 12:
                nom = "Dame";
                break;
            case 13:
                nom = "Roi";
                break;
            case 14:
                nom = "As";
                break;
            default:
                nom = String.valueOf(valeur);
                break;
        }
        this.valeur = valeur;
        this.couleur = couleur;
    }

    public int getValeur() {
        return valeur;
    }

    public void setValeur(int valeur) {
        this.valeur = valeur;
    }

    public Couleur getCouleur() {
        return couleur;
    }

    public void setCouleur(Couleur couleur) {
        this.couleur = couleur;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @Override
    public String toString() {
        return "Carte [nom=" + nom + ", valeur=" + valeur + ", couleur=" + couleur + "]";
    }
    
}
