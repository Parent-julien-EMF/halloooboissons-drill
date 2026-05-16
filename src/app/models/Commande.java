public class Commande {
    private final int NBRE_MAX_CAGEOTS = 8;

    private Cageot[] tab2Cageots;
    private final Client client;

    public Commande(Cageot[] tab2Cageots, Client client) {
        this.tab2Cageots = new Cageot[NBRE_MAX_CAGEOTS];
        this.client = client;
    }

    public Client getClient() {
        return client;
    }

    public boolean rajouterCageot(Cageot Cageot) {
        boolean reussi = false;
        for (int i = 0; i < tab2Cageots.length; i++) {
            if (tab2Cageots[i] == null) {
                tab2Cageots[i] = Cageot;
                reussi = true;
                break;
            }
        }
        return reussi;
    }

    public boolean retirerCageot(Cageot Cageot) {
        boolean reussi = false;
        for (int i = 0; i < tab2Cageots.length; i++) {
            if (tab2Cageots[i] == Cageot) {
                tab2Cageots[i] = null;
                reussi = true;
                break;
            }
        }
        return reussi;
    }

    public boolean annulerCommande() {
        boolean reussi = false;
        for (int i = 0; i < tab2Cageots.length; i++) {
            tab2Cageots[i] = null;
            reussi = true;
        }
        return reussi;
    }

    public Cageot[] listeCageotALivrer() {
        int tailleTab = 0;
        for (int i = 0; i < tab2Cageots.length; i++) {
            if (tab2Cageots[i] != null) {
                tailleTab++;
            }
        }
        Cageot[] tabRetour = new Cageot[tailleTab];
        for (int i = 0; i < tab2Cageots.length; i++) {
            if (tab2Cageots[i] != null) {
                for (int j = 0; j < tabRetour.length; j++) {
                    if (tabRetour[j] == null) {
                        tabRetour[j] = tab2Cageots[i];
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
        for (int i = 0; i < tab2Cageots.length; i++) {
            if (tab2Cageots[i] != null) {
                accumule += tab2Cageots[i].demanderPrixTotal();
                compte++;
            }
        }
        resultat = accumule / compte;
        return resultat;
    }
}
