package Fabrique.SImple;

public class Pizzeria {

    Pizza commanderPizzer(String type){
        Pizza pizza =null;
        if (type.equals("fromage")){
            pizza =new PizzaFromage();
        }else if (type.equals("poivrons")){
            pizza =new PizzaPoivrons();
        }else if (type.equals("grecques")){
            pizza =new PizzaGrecques();
        }

        pizza.preparer();
        pizza.cuire();
        pizza.couper();
        pizza.embaler();

        return pizza;
    }
}
