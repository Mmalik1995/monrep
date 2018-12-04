package Decorateur.ComposantConcret;

import Decorateur.Boisson;

public class Expresso extends Boisson {
    public Expresso() {
        this.description="Expresso ";
    }

    @Override
    public double cout() {
        return 1.99;
    }
}
