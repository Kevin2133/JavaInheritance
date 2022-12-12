public class Isoscele extends Triangolo{
    /* metodo se è isoscele, metodo che calcola la base e il lato obliquo, metodo che calcola l'area */
    double altezza;
    int base, ob;

    public Isoscele(int ob, int base){
        super(ob, ob, base);        
    }

    public double calcolaAltezza(){
        this.altezza = Math.sqrt((double) Math.pow(this.lato1, 2) - (double) Math.pow(this.lato3, 2) / 4);
        return this.altezza;
    }

    public calcolaBase(){
        
    }

}
