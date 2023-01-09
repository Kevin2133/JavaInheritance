import java.util.Scanner;

public class TestIsoscele {   

    /* System.out.println("premi 0 per uscire");
                System.out.println("premi 1 per creare un triangolo");
                System.out.println("premi 2 per visualizzare i lati");
                System.out.println("premi 3 per dire se e' un triangolo");
                System.out.println("premi 4 per calcolare l'altezza");
                System.out.println("premi 5 per calcolare il perimetro");
                System.out.println("premi 6 per calcolare l'area");
                 */

    public static void main (String arg[]){
        int scelta, ob, base;
        Scanner scanner = new Scanner(System.in);
        
        do{
            System.out.println("0. esci");
            System.out.println("1. Crea un triangolo isoscele");
            System.out.println("2. Visualizza i lati");
            System.out.println("3. Controlla se è un triangolo");
            System.out.println("4. Calcola altezza");
            System.out.println("5. Calcola perimetro");
            System.out.println("6. calcola area");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch(scelta){
                case 0:
                    break;
                case 1:

                    break;
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta != 0);
    }
}
