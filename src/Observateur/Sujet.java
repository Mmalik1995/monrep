package Observateur;

public interface Sujet {

    void enregisterObservateur(Observateur o);
    void supprimerObservateur(Observateur o);
    void notifierObservateurs();
}
