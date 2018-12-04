package Observateur;

public class AffichageConditions implements Observateur,Affichage {

    private float temps;
    private float humidite;
    private  DonnesMeteo donnesMeteo;

    public AffichageConditions(DonnesMeteo donnesMeteo) {
     this.donnesMeteo=donnesMeteo;
     donnesMeteo.enregisterObservateur(this);
    }


    @Override
    public void afficher() {
        System.out.println("Conditions actuelles :"+temps+"  degre "+humidite+" % humidite");

    }

    @Override
    public void actualiser(float temps, float humidite, float pression) {
        this.temps=temps;
        this.humidite=humidite;
        afficher();

    }
}
