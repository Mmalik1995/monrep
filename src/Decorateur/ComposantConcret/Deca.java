package Decorateur.ComposantConcret;

import Decorateur.Boisson;

public class Deca extends Boisson {
    public Deca() {
        this.description="Deca ";
    }

    @Override
    public double cout() {
        return 1.05;
    }
}
