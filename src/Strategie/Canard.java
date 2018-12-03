package Strategie;

public abstract class Canard {


    ComportementVol comportementVol;
    void effectuerVoler(){
        this.comportementVol.voler();
    }

    void concaner (){
        System.out.println("coin coin");
    }

    void nager(){
        System.out.println("flop flop");
    }

    abstract  void afficher();



}
