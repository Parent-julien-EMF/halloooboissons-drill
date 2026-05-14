public class Commandes {
    private final int NBRE_MAX_CAGEOTS = 8;

    private Cageots[] commande2Cageots;
    private final Clients client;

    public Commandes(Cageots[] commande2Cageots, Clients client) {
        this.commande2Cageots = new Cageots[NBRE_MAX_CAGEOTS];
        this.client = client;
    }
    
}
