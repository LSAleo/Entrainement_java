package fr.it_akademy.voyages.leo.util;

import java.util.Collections;
import java.util.List;
import fr.it_akademy.voyages.leo.business.*;

public class ComparateurPrix {

    public static void afficherVolsTriesSurPrix(List<Vol> vols) {
        // Trier la liste des vols sur le prix
        Collections.sort(vols, (vol1, vol2) -> Float.compare(vol1.getPrixEnEuros(), vol2.getPrixEnEuros()));

        System.out.println("Voici la liste des vols triés sur le prix (du moins cher au plus cher) :");
        for (Vol vol : vols) {
            System.out.println(vol);
        }
    }
}