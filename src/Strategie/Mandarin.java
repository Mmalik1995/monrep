package Strategie;

public class Mandarin extends Canard {

    public Mandarin(){
        this.comportementVol=new VolerAiles();
    }


    @Override
    void afficher() {
        System.out.println("je suis un mandarin");
    }
}
