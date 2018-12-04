package Observateur;

public class main {
    public static void main(String []args){
        DonnesMeteo donnesMeteo= new DonnesMeteo();
        AffichageConditions affichageConditions=new AffichageConditions(donnesMeteo);

        donnesMeteo.setMesure(20,65,1060);
        System.out.println("########");
        donnesMeteo.setMesure(22,90,1025);
    }
}
