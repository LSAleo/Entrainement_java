package business;

import java.time.LocalDate;
public class Joueur {
    private String prenom;
    private LocalDate dateDeNaissance;
    
    // Constructeur
    
    public Joueur(String prenom) {
        this.prenom = prenom;
    }

    public Joueur(String prenom, LocalDate dateDeNaissance) {
        this.prenom = prenom;
        this.dateDeNaissance = dateDeNaissance;
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

}
