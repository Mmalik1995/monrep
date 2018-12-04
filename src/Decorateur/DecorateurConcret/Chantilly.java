package Decorateur.DecorateurConcret;

import Decorateur.Boisson;
import Decorateur.DecorateurIngredient;

public class Chantilly extends DecorateurIngredient {
    Boisson boisson;



    public  Chantilly(Boisson boisson){
        this.boisson=boisson;
    }
    @Override
    public String getDescription() {
        return boisson.getDescription()+" ,chantilly";
    }

    @Override
    public double cout() {
        return .1+this.boisson.cout();
    }
}
