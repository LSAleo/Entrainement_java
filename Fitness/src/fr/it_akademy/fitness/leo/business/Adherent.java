package fr.it_akademy.fitness.leo.business;

import java.util.*;

public class Adherent {

    private static Long compteur = 0L;
    private Long id;
    private String nom;
    private String prenom;
    private List<Course> courses = new ArrayList<>();

    public Adherent(String nom, String prenom) {
        this.id = ++compteur;
        this.nom = nom;
        this.prenom = prenom;
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

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public List<Course> getCourse() {
        return courses;
    }

    public void setCourse(List<Course> course) {
        this.courses = course;
    }

    public Object getDistanceEnMetres(){
        int distanceTotale = 0;
        for (Course course : courses) {
            distanceTotale += course.getDistanceEnMetres();
        }
        return distanceTotale;
    }

    @Override
    public String toString() {
        return "Adherent [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]";
    }
   
}