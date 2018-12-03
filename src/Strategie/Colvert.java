package Strategie;

public class Colvert extends  Canard {


    public Colvert(){
        this.comportementVol=new VolerAiles();
    }

    @Override
    void afficher() {
        System.out.println("je suis un colvert");
        //
    }
}
