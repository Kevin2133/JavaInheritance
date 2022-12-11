public class Equilatero extends Triangolo {

    double altezza;

    public Equilatero (int lato){
        super(lato, lato, lato);
    }

    public double calcolaAltezza (){
        this.altezza =  Math.sqrt((double) 3 / 4) * this.lato1;
        return this.altezza;
    }

    public double area(){
        return this.lato1 * this.altezza / 2;
    }
    
}
