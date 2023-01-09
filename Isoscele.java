public class Isoscele extends Triangolo{
    /* metodo se è isoscele, metodo che calcola la base e il lato obliquo, metodo che calcola l'area */

    public Isoscele(int ob, int base){
        super(ob, ob, base);                
    }

    public double calcolaAltezza(){
        this.altezza = Math.sqrt(Math.pow(this.lato1, 2) - (double) Math.pow(this.lato3, 2) / 4);
        return this.altezza;
    }

    public int getBase(){
        return this.lato3;
    }

    public int getOb(){
        return this.lato1;
    }

}
