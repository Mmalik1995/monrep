package Fabrique.SImple;

public class SimpleFabriquePizza {

    public Pizza creerPizza(String type){
        Pizza pizza =null;
        if (type.equals("fromage")){
            pizza =new PizzaFromage();
        }else if (type.equals("poivrons")){
            pizza =new PizzaPoivrons();
        }else if (type.equals("grecques")){
            pizza =new PizzaGrecques();
        }
        return  pizza;
    }
}
