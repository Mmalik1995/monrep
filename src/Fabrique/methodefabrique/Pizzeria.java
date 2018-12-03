package Fabrique.methodefabrique;



public  abstract class Pizzeria {


  public Pizza commanderPizza(String type){
      Pizza pizza;
      pizza = creerPizza(type);
      pizza.preparer();
      pizza.cuire();
      pizza.couper();
      pizza.embaler();

      return  pizza;

  }

  abstract Pizza creerPizza(String type);


}
