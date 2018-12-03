package Fabrique.methodefabrique;

import org.omg.PortableInterceptor.SYSTEM_EXCEPTION;

public class main {

    public static void main(String[]args){
        //
        Pizzeria pizzeria=new PizzeriaBrest();
       Pizza pizza= pizzeria.commanderPizza("fromage");
        System.out.println(" commade :"+pizza.getNom());
    }
}
