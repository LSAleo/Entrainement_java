import java.util.*;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int nbADeviner = 0;
        int nbSaisi = 0;
        int nbEssais = 0;
        // objet qui sera charger de choisir un nombre compris entre 1 et 100
        Random random = new Random();

        nbADeviner = 1 + random.nextInt(100);
        // System.out.println(nbADeviner);

        System.out.println("Entrez un nombre");
        while (nbADeviner != nbSaisi) {
            
            nbSaisi = scanner.nextInt();
            if (nbADeviner > nbSaisi){
                System.out.println("C'est plus");
            }else if (nbADeviner<nbSaisi){
                System.out.println("c'est moins");
            }else{
                System.out.println("C'est juste");
                System.out.println("Vous avez réussi en " + nbEssais + " essais");
            }
            nbEssais = nbEssais + 1;
        }
        scanner.close();
    }
}