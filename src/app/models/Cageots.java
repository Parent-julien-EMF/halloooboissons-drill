import java.text.DecimalFormat;

public class Cageots {

    private final int NBRE_BOUTEILLE = 12;

    /*
     * Consigne pour les attributs :
     * créez une classe nommée Cageot pouvant accueillir un certain nombre de
     * bouteilles
     * et ayant un identifiant textuel unique
     */

    private Bouteille[] cageot2Bouteilles;
    private final String id;

    public Cageots(Bouteille[] cageot2Bouteilles, String id) {
        this.cageot2Bouteilles = new Bouteille[NBRE_BOUTEILLE];
        this.id = id;
    }

    public String getId() {
        return id;
    }

    // methode
    public boolean rangerBouteille(Bouteille bouteilleARanger) {
        boolean reussi = false;
        for (int i = 0; i < cageot2Bouteilles.length; i++) {
            if (cageot2Bouteilles[i] == null) {
                cageot2Bouteilles[i] = bouteilleARanger;
                reussi = true;
                break;
            }
        }
        return reussi;
    }

    public boolean prendreBouteille(Bouteille bouteilleRechercher) {
        boolean reussi = false;
        for (int i = 0; i < cageot2Bouteilles.length; i++) {
            if (cageot2Bouteilles[i] == bouteilleRechercher) {
                cageot2Bouteilles[i] = null;
                reussi = true;
                break;
            }
        }
        return reussi;
    }

    public int nbrePlacePrise() {
        int nbrePlacePrise = 0;
        for (int i = 0; i < cageot2Bouteilles.length; i++) {
            if (cageot2Bouteilles[i] != null) {
                nbrePlacePrise++;
            }
        }
        return nbrePlacePrise;
    }

    public int nbrePlaceDispo() {
        int nbrePlaceDispo = 0;
        for (int i = 0; i < cageot2Bouteilles.length; i++) {
            if (cageot2Bouteilles[i] == null) {
                nbrePlaceDispo++;
            }
        }
        return nbrePlaceDispo;
    }

    public Bouteille[] listeBouteillesStocke() {
        Bouteille[] tabRetourBouteilles = new Bouteille[NBRE_BOUTEILLE];
        for (int i = 0; i < cageot2Bouteilles.length; i++) {
            if (cageot2Bouteilles[i] != null) {
                for (int k = 0; k < tabRetourBouteilles.length; k++) {
                    if (tabRetourBouteilles[k] == null) {
                        tabRetourBouteilles[k] = cageot2Bouteilles[i];
                        break;
                    }
                }
            }
        }
        return tabRetourBouteilles;
    }

    /*
     * j'ai remarqué après coup que j'avais fait le prix moyen et non total,
     * j'ai laisser car je me suis juste compliqué la vie mais ça change pas grand
     * chose.
     */
    public double demanderPrixTotal() {
        double resultat = 0;
        double accumule = 0.00;
        int compte = 0;
        for (int i = 0; i < cageot2Bouteilles.length; i++) {
            accumule += cageot2Bouteilles[i].getPrix();
            compte++;
        }
        resultat = accumule / compte;
        return resultat;
    }

    @Override
    public String toString() {
        DecimalFormat dfXY = new DecimalFormat("00");
        return "Cageots '" + id + "' avec "
                + dfXY.format(nbrePlacePrise()) + "/" + dfXY.format(nbrePlaceDispo()) + " bouteilles";
    }
}
