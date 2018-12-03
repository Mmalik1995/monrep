package Fabrique.methodefabrique;

import java.util.ArrayList;

public class Pizza {
   public String nom;
    public String pate;
   public String sauce;
   public ArrayList<String>garnitures=new ArrayList<String>();

    public void cuire() {
        System.out.println("Cuissons 25 minutes a 180");
    }

    public void couper() {
        System.out.println("Decoupage en part triangulaires");
    }

    public void embaler() {
        System.out.println("emballage boite officiel");
    }

    public void preparer(){
        //
        System.out.println("Preparation de "+nom);
        System.out.println("etalage de pate");
        System.out.println("ajoute de la sauce");
        System.out.println("ajout garnitrue");
        for(String i:garnitures){
            System.out.println(   "     "+i);

        }

    }

    public  String getNom(){
        return  this.nom;
    }
}
