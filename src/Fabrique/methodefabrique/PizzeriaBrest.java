package Fabrique.methodefabrique;


import Fabrique.methodefabrique.PizzaBrest.PizzaFromageStyleBrest;
import Fabrique.methodefabrique.PizzaBrest.PizzaPoivronsStyleBrest;
import Fabrique.methodefabrique.PizzaBrest.PizzaVegetarienneStyleBrest;

public class PizzeriaBrest extends Pizzeria {
    @Override
    Pizza creerPizza(String type) {
        Pizza pizza=null;
        if(type.equals("fromage")){
            pizza=new PizzaFromageStyleBrest();
        }else if(type.equals("poivrons")){
            pizza=new PizzaPoivronsStyleBrest();
        }else if (type.equals("vegetarienne")){
            pizza=new PizzaVegetarienneStyleBrest();
        }
        return pizza;

    }
}
