package fr.it_akademy.fitness.leo.util;

import java.util.Comparator;

import fr.it_akademy.fitness.leo.business.Adherent;
/**
 * cette classe implémente l'interface Comparable
 * la méthode de comparaison montre à Java comment comparer deux adhérents entre eux
 */
public class ComparateurDAdherentsSurNom implements Comparator<Adherent>{
    
    @Override
    public int compare(Adherent adherent1, Adherent adherent2) {
        // la méthode doit renvoyer 0 si les deux adhérens ont le même nom
        // la méthode -1 si le nom de l'adhérent 1 est avant celui de l'adhérent 2
        // la méthode doit renvoyer 1 si le nom de l'adhérent 1 est après celui de l'adhérent 2

        int resultat = adherent1.getNom().compareTo(adherent2.getNom());
        return resultat;
    }
}
