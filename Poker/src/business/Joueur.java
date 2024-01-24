package Poker.src.business;
import java.util.*;
import java.time.LocalDate;

public class Joueur {
    private String prenom;
    private LocalDate dateDeNaissance;
    private ArrayList<Carte> main = new ArrayList<>();
    private Ville ville;
    
    // Constructeur
    
    public Joueur(String prenom) {
        this.prenom = prenom;
    }

    public Joueur(String prenom, LocalDate dateDeNaissance) {
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
    }

    public Joueur(String prenom, LocalDate dateDeNaissance, Ville ville) {
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
        this.ville = ville;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public LocalDate getDateDeNaissance() {
        return dateDeNaissance;
    }

    public void setDateDeNaissance(LocalDate dateDeNaissance) {
        this.dateDeNaissance = dateDeNaissance;
    }

    public ArrayList<Carte> getMain() {
        return main;
    }

    public void setMain(ArrayList<Carte> main) {
        this.main = main;
    }
    
    public Ville getVille() {
        return ville;
    }

    public void setVille(Ville ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Joueur [prenom=" + prenom + ", dateDeNaissance=" + dateDeNaissance + ", main=" + main + ", ville=" + ville + "]";
    }
}
