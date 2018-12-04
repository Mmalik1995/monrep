package Decorateur.DecorateurConcret;

import Decorateur.Boisson;
import Decorateur.DecorateurIngredient;

public class Caramel extends DecorateurIngredient {
    Boisson boisson;



    public  Caramel(Boisson boisson){
        this.boisson=boisson;
    }



    @Override
    public String getDescription() {
        return boisson.getDescription()+" ,caramel";
    }

    @Override
    public double cout() {
        return .15+this.boisson.cout();
    }
}
