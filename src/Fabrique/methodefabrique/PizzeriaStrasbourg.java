package Fabrique.methodefabrique;


import Fabrique.methodefabrique.PizzaStrasbourg.PizzaFromageStyleStrasbourg;
import Fabrique.methodefabrique.PizzaStrasbourg.PizzaPoivronsStyleStrasbourg;
import Fabrique.methodefabrique.PizzaStrasbourg.PizzaVegetarienneStyleStrasbourg;

public class PizzeriaStrasbourg extends Pizzeria {
    @Override
    Pizza creerPizza(String type) {
//
        Pizza pizza=null;
        if(type.equals("fromage")){
            pizza=new PizzaFromageStyleStrasbourg();
        }else if(type.equals("poivrons")){
            pizza=new PizzaPoivronsStyleStrasbourg();
        }else if (type.equals("vegetarienne")){
            pizza=new PizzaVegetarienneStyleStrasbourg();
        }
        return pizza;
    }
}
