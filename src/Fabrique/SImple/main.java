package Fabrique.SImple;

public class main {


    public static void main(String[]args) {
        Pizzeria pizzeria = new Pizzeria(new SimpleFabriquePizza());


        pizzeria.commanderPizzer("fromage");
    }

}
