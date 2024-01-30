package fr.it_akademy.voyages.leo.business;

import java.time.LocalTime;
import java.util.*;

public class Vol {
    private static Long compteur = 0L;
    private Long id;
    private Float prixEnEuros;
    private LocalTime heureDepart;
    private LocalTime heureArrivee;
    private Compagnie compagnie;
    private Aeroport aeroportDepart;
    private Aeroport aeroportArrivee;

    public Vol(Aeroport aeroportDepart, Aeroport aeroportArrivee, Compagnie compagnie, LocalTime heureDepart, LocalTime heureArrivee, Float prixEnEuros) {
        this.id = ++compteur;
        this.prixEnEuros = prixEnEuros;
        this.heureDepart = heureDepart;
        this.heureArrivee = heureArrivee;
        this.compagnie = compagnie;
        this.aeroportDepart = aeroportDepart;
        this.aeroportArrivee = aeroportArrivee;
    }

    public static Long getCompteur() {
        return compteur;
    }

    public static void setCompteur(Long compteur) {
        Vol.compteur = compteur;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Float getPrixEnEuros() {
        return prixEnEuros;
    }

    public void setPrixEnEuros(Float prixEnEuros) {
        this.prixEnEuros = prixEnEuros;
    }

    public LocalTime getHeureDepart() {
        return heureDepart;
    }

    public void setHeureDepart(LocalTime heureDepart) {
        this.heureDepart = heureDepart;
    }

    public LocalTime getHeureArrivee() {
        return heureArrivee;
    }

    public void setHeureArrivee(LocalTime heureArrivee) {
        this.heureArrivee = heureArrivee;
    }

    public Compagnie getCompagnie() {
        return compagnie;
    }

    public void setCompagnie(Compagnie compagnie) {
        this.compagnie = compagnie;
    }

    public Aeroport getAeroportDepart() {
        return aeroportDepart;
    }

    public void setAeroportDepart(Aeroport aeroportDepart) {
        this.aeroportDepart = aeroportDepart;
    }

    public Aeroport getAeroportArrivee() {
        return aeroportArrivee;
    }

    public void setAeroportArrivee(Aeroport aeroportArrivee) {
        this.aeroportArrivee = aeroportArrivee;
    }

    @Override
    public String toString() {
        return "Vol : " + id + " prixEnEuros : " + prixEnEuros + " Heure de départ : " + heureDepart + " Heure d'arrivée " + heureArrivee + " avec la compagnie=" + compagnie + " en partance de l'aéroport de " + aeroportDepart + " qui arrivera à l'aéroport de " + aeroportArrivee;
    }
    
}