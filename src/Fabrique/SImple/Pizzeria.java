package Fabrique.SImple;

public class Pizzeria {

    SimpleFabriquePizza simpleFabriquePizza;

    public Pizzeria(SimpleFabriquePizza simpleFabriquePizza) {
        this.simpleFabriquePizza = simpleFabriquePizza;
    }

    Pizza commanderPizzer(String type){

        Pizza pizza =this.simpleFabriquePizza.creerPizza(type);

        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.embaler();

        return pizza;
    }
}
