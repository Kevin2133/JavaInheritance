public class Equilatero extends Triangolo {

    double altezza;

    public Equilatero (int lato){
        super(lato, lato, lato);
        this.altezza = -1;
    }

    public double calcolaAltezza (){
        this.altezza =  Math.sqrt((double) 3 / 4) * this.lato1;
        return this.altezza;
    }    
    
}
