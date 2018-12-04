package Decorateur;

public abstract class Boisson {


    public String getDescription() {
        return description;
    }

   public   String description="boison inconnu";

    public abstract  double cout();
}
