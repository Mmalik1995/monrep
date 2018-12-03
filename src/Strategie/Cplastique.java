package Strategie;

public class Cplastique extends Canard {

    public Cplastique(){
        this.comportementVol=new NePasVoler();
    }
    @Override
    void concaner() {
        System.out.println("pouic pouic");

    }

    @Override
    void afficher() {
        System.out.println("je suis en plastoc");
    }
}
