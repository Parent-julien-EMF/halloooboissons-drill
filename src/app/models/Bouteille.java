import java.text.DecimalFormat;

public class Bouteille {
    
    //attributs
    private final String nom;
    private final double prix;
    private final double contenance;
    private double remplissage;
    private final boolean EnVerre;

    //constructeur
    public Bouteille(String nom, double prix, double contenance, double remplissage, boolean enVerre) {
        this.nom = nom;
        this.prix = prix;
        this.contenance = contenance;
        this.remplissage = 100.0;
        EnVerre = enVerre;
    }
    //getters et setters
    public String getNom() {
        return nom;
    }

    public double getPrix() {
        return prix;
    }

    public double getContenance() {
        return contenance;
    }

    public double getRemplissage() {
        return remplissage;
    }

    public void setRemplissage(double remplissage) {
        this.remplissage = remplissage;
    }

    public boolean isEnVerre() {
        return EnVerre;
    }

    //toString
    @Override
    public String toString() {

        //pour savoir si c'est en verre ou plastique
        String IsGlass = "ERREUR IsGlass";
        if (EnVerre) {
            IsGlass = "en verre";
        }else if (EnVerre == false) {
            IsGlass = "en plastique";
        }

        //pour savoir si c'est plein
        String IsFull = "ERREUR IsFull";
        if (remplissage == 100.0) {
            IsFull = "pleine";
        }else if (remplissage == 0) {
            IsFull = "vide";
        }else {
            IsFull = "entamée";
        }

        //decimal format pour le prix 
        DecimalFormat dfPrix = new DecimalFormat("0.00");


        return "Bouteille '" + nom + "' de " + contenance + "L " + IsGlass + " à "
            + dfPrix.format(prix) + " Frs - " + IsFull + ".";
    }
}
