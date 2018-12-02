package Strategie;

public class Main {
    public static void main(String[]args){
        Canard []tab=new Canard[2];
        tab[0]=new Colvert();
        tab[1]=new Mandarin();
        for(Canard c: tab){
            c.afficher();
            c.concaner();
            c.nager();
        }
    }
}
