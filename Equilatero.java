public class Equilatero extends Triangolo {

    double altezza;

    public Equilatero (int lato){
        super(lato, lato, lato);
    }

    public void visualizza (){
        super.visualizza();
    }

    public void calcolaAltezza (){
        this.altezza = Math.sqrt((double) (Math.pow(this.lato1, 2) - 
        Math.pow((double) this.lato1 / 2, 2)));
    }

    public double area(){
        return this.lato1 * this.altezza / 2;
    }
    
}
