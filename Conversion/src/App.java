package Conversion.src;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // on crée un objet de type scanner
        Scanner scanner = new Scanner(System.in);
        float distanceEnKm = 0;
        float distanceEnMiles = 0;
        float tauxDeConversion = 1.6f;

        // Programme qui demande une distance en km et qui la convertit en miles
        System.out.println("Entrez une distance en km");
        distanceEnKm = Float.parseFloat(scanner.nextLine());
        scanner.close();
        System.out.println("Vous avez saisi" + distanceEnKm);
        distanceEnMiles = distanceEnKm / tauxDeConversion;
        System.out.println("La distance en miles est :" + distanceEnMiles);
    }
}
