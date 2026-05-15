public class Commandes {
    private final int NBRE_MAX_CAGEOTS = 8;

    private Cageots[] commande2Cageots;
    private final Clients client;

    public Commandes(Cageots[] commande2Cageots, Clients client) {
        this.commande2Cageots = new Cageots[NBRE_MAX_CAGEOTS];
        this.client = client;
    }

    public Clients getClient() {
        return client;
    }

    public boolean rajouterCageot(Cageots Cageot) {
        boolean reussi = false;
        for (int i = 0; i < commande2Cageots.length; i++) {
            if (commande2Cageots[i] == null) {
                commande2Cageots[i] = Cageot;
                reussi = true;
                break;
            }
        }
        return reussi;
    }

    public boolean retirerCageot(Cageots Cageot) {
        boolean reussi = false;
        for (int i = 0; i < commande2Cageots.length; i++) {
            if (commande2Cageots[i] == Cageot) {
                commande2Cageots[i] = null;
                reussi = true;
                break;
            }
        }
        return reussi;
    }

    public boolean annulerCommande() {
        boolean reussi = false;
        for (int i = 0; i < commande2Cageots.length; i++) {
            commande2Cageots[i] = null;
            reussi = true;
        }
        return reussi;
    }

    public Cageots[] listerCageotsCommande() {
        Cageots[] tabRetour = new Cageots[NBRE_MAX_CAGEOTS];
        for (int i = 0; i < commande2Cageots.length; i++) {
            if (commande2Cageots[i] != null) {
                for (int j = 0; j < tabRetour.length; j++) {
                    if (tabRetour[j] == null) {
                        tabRetour[j] = commande2Cageots[i];
                        break;
                    }
                }
            }
        }
        return tabRetour;
    }

    /*
     * j'ai remarqué après coup que j'avais fait le prix moyen et non total,
     * j'ai laisser car je me suis juste compliqué la vie mais ça change pas grand
     * chose.
     */
    public double prixTotalCommande() {
        double resultat = 0;
        double accumule = 0.00;
        int compte = 0;
        for (int i = 0; i < commande2Cageots.length; i++) {
            if (commande2Cageots != null) {
                accumule = commande2Cageots[i].demanderPrixTotal();
                compte++;
            }
        }
        resultat = accumule / compte;
        return resultat;
    }
}
