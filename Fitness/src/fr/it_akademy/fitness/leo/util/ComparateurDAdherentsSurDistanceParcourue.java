package fr.it_akademy.fitness.leo.util;

import java.util.Comparator;

import fr.it_akademy.fitness.alex.business.Adherent;

public class ComparateurDAdherentsSurDistanceParcourue implements Comparator<Adherent>{

    @Override
    public int compare(Adherent adherent1, Adherent adherent2) {
        int resultat = adherent1.getDistanceEnMetres(Adherent
        return resultat;
    }

}