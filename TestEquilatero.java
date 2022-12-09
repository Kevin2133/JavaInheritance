import java.util.Scanner;

public class TestEquilatero {
    
    public static void main (String arg[]){
        int scelta, lato;
        Equilatero t;
        Scanner scanner = new Scanner(System.in);
        boolean c1f = false;

        do{
            System.out.println("0. esci");
            System.out.println("1. Crea un triangolo");
            System.out.println("2. Visualizza i lati");
            System.out.println("3. è un triangolo??");
            System.out.println("4. calcola altezza");
            System.out.println("5. Calcola perimetro");
            System.out.println("6. Calcola area");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch(scelta){
                case 0:
                    break;
                case 1:
                    do{
                        System.out.println("Inserisci il lato del triangolo equilatero");
                        lato = scanner.nextInt();
                        scanner.nextLine();

                        if(lato < 1){
                            System.out.println("Valore inserito non valido");
                        }
                    }while(lato < 1);
                    t = new Equilatero(lato);
                    c1f = true;
                    break;
                case 2:
                    if(c1f){
                        t.visualizza();
                    }
                    break;
                case 3:

                    break;
            }
        }while(scelta != 0);
    }
}
