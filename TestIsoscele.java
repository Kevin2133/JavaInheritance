import java.util.Scanner;

public class TestIsoscele {   

    public static void main (String arg[]){
        int scelta, lato1, lato2, lato3, perimetro;
        Isoscele i = null;
        double altezza, area;
        Scanner scanner = new Scanner(System.in);
        boolean c1f = false;
        
        do{
            System.out.println("0. esci");
            System.out.println("1. Crea un triangolo isoscele");
            System.out.println("2. Visualizza i lati e l'altezza");
            System.out.println("3. Controlla se è un triangolo");
            System.out.println("4. Dire se e' isoscele");
            System.out.println("5. Calcolare base e lato obliquo");
            System.out.println("6. Calcola perimetro");
            System.out.println("7. calcola area");

            scelta = scanner.nextInt();
            scanner.nextLine();

            switch(scelta){
                case 0:
                    break;
                case 1:
                    do{
                        System.out.println("Inserisci il primo lato");
                        lato1 = scanner.nextInt();
                        scanner.nextLine();
                        if(lato1 < 1){
                            System.out.println("Il valore inserito non e' valido");
                        }
                    }while(lato1 < 1);

                    do{
                        System.out.println("Inserisci il secondo lato");
                        lato2 = scanner.nextInt();
                        scanner.nextLine();
                        if(lato2 < 1){
                            System.out.println("Il valore inserito non e' valido");
                        }
                    }while(lato2 < 1);

                    do{
                        System.out.println("Inserisci il terzo lato");
                        lato3 = scanner.nextInt();
                        scanner.nextLine();
                        if(lato3 < 1){
                            System.out.println("Il valore inserito non e' valido");
                        }
                    }while(lato3 < 1);

                    do{
                        System.out.println("Inserisci l'altezza");
                        altezza = scanner.nextDouble();
                        scanner.nextLine();
                        if(altezza <= 0){
                            System.out.println("Il valore inserito non e' valido");
                        }
                    }while(altezza <= 0);
                    

                    i = new Isoscele(lato1, lato2, lato3, altezza);
                    c1f = true;                    
                    break;
                case 2:
                    if(c1f){
                        i.visualizza();
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 3:
                    if(c1f){
                        if(i.isTri()){
                            System.out.println("Si tratta di un triangolo");
                        }else{
                            System.out.println("Non si tratta di un triangolo");
                        }
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 4:
                    if(c1f){
                        if(i.isIsoscele()){
                            System.out.println("E' un triangolo isoscele");
                        }else{
                            System.out.println("Non e' un triangolo isoscele");
                        }
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 5:
                    if(c1f){
                        i.calcolaBase();
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 6:
                    if(c1f){
                        perimetro = i.calcolaPerimetro();
                        System.out.println("Perimetro = " + perimetro);
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                case 7:
                    if(c1f){
                        area = i.calcolaArea();
                        if(area <= 0){
                            System.out.println("Impossibile calcolare l'area");
                        }else{
                            System.out.println("Area = " + area);
                        }
                    }else{
                        System.out.println("Prima creare un triangolo");
                    }
                    break;
                default:
                    System.out.println("Scelta non prevista");
                    break;
            }
        }while(scelta != 0);
    }
}
