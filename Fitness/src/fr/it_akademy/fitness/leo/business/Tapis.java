package fr.it_akademy.fitness.leo.business;

import java.util.ArrayList;

public class Tapis {
    private Long id;
    private String nom;
    private static Long compteur = 0L;
    private ArrayList<Course> courses;

    public Tapis(String nom) {
        this.id = compteur++;
        this.nom = nom;
        this.courses = new ArrayList<>();
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
        Tapis.compteur = compteur;
    }

    public ArrayList<Course> getCourses() {
        return courses;
    }

    public void setCourses(ArrayList<Course> courses) {
        this.courses = courses;
    }

    public void ajouterCourse(Course course) {
        this.courses.add(course);
    }

    @Override
    public String toString() {
        return "Tapis [id=" + id + ", nom=" + nom + ", compteur=" + compteur + ", courses=" + courses + "]";
    }
}