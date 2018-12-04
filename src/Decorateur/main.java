package Decorateur;

import Decorateur.ComposantConcret.Expresso;
import Decorateur.ComposantConcret.Sumatra;
import Decorateur.DecorateurConcret.Chantilly;
import Decorateur.DecorateurConcret.Chocolat;

public class main {

    public  static void main(String[]args){
        Boisson boisson=new Expresso();

        System.out.println(boisson.getDescription()+" "+boisson.cout());


        Boisson boisson1=new Sumatra();
        boisson1 =new Chocolat(boisson1);
        boisson1=new Chocolat(boisson1);
        boisson1=new Chantilly(boisson1);
        System.out.println(boisson1.getDescription()+" "+boisson1.cout());

    }
}
