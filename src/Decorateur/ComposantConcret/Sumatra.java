package Decorateur.ComposantConcret;

import Decorateur.Boisson;

public class Sumatra extends Boisson {

        public Sumatra() {
            this.description="Sumatra ";
        }

        @Override
        public double cout() {
            return .99;
        }
}
