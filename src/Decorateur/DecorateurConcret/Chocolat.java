package Decorateur.DecorateurConcret;

import Decorateur.Boisson;
import Decorateur.DecorateurIngredient;

public class Chocolat extends DecorateurIngredient {
    Boisson boisson;



    public  Chocolat(Boisson boisson){
        this.boisson=boisson;
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" ,chocolat";
    }

    @Override
    public double cout() {
        return .2+this.boisson.cout();
    }
}
