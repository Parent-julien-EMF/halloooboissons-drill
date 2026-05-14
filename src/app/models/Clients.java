public class Clients {

    // attributs
    private final String nom;
    private final String prenom;
    private final String ville; // final pour la ville car y a pas de setters
    // constructeur

    public Clients(String nom, String prenom, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.ville = ville;
    }

    // getters
    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public String getVille() {
        return ville;
    }

    // toString
    @Override
    public String toString() {
        return "Client " + nom.toUpperCase() + " " + prenom + " - " + ville;
    }

}
