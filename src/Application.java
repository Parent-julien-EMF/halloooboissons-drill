import java.text.DecimalFormat;

public class Application {
    /* j'ai du rajouter un DecimalFormat du au fait que 
    j'ai fait une moyenne et nom la somme du prix.
    (sans le DecimalFormat, ça donnerais un double infini)
    le Sout n'est donc pas correct vu qu'il dit "le prix total est ..."
    et que j'ai calculer le prix moyen des bouteilles. 
    Mais c'est un détails que je pourrais facilement régler si je m'en étaits apperçu avant la fin.
    */
    static DecimalFormat dfPrix = new DecimalFormat("0.00");

    public static void afficherCommande(Commande commande) {
        if (commande != null) {
            System.out.println("-----------------------------");
            System.out.println("Commande pour le client : " + commande.getClient());
            Cageot[] cageotsALivrer = commande.listeCageotALivrer();
            System.out.println("La commande contient " + cageotsALivrer.length + " cageots");
            System.out.println("Le prix total de la commande est de " + dfPrix.format(commande.prixTotalCommande()) + " Frs");
        }
    }


    public static void main(String[] args) {
        //création du tableau
        Commande[] tabCommande = new Commande[10];

        //création des 2 client pour les commande
        Client client1 = new Client("DUCOBU", "Jean", "Bulle");
        Client client2 = new Client("HARONI", "Mac", "Fribourg");

        //création des cageots
        Cageot cageot1J = new Cageot("X83H4");
        Cageot cageot2 = new Cageot("X83H5");
        Cageot cageot3 = new Cageot("X83H6");
        Cageot cageot1M = new Cageot("X83H7");

        //création des bouteille et mise en cageot
        //cageot1J
        //en verre
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));

        //en plastique
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, false));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, false));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, false));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, false));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, false));
        cageot1J.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, false));

        //cageot2
        cageot2.rangerBouteille(new Bouteille("Coca-Cola", 3.85, 1.5, 100.0, false));
        cageot2.rangerBouteille(new Bouteille("Coca-Cola", 3.85, 1.5, 100.0, false));

        //cageot3
        cageot3.rangerBouteille(new Bouteille("Pepsi", 3.55, 1.5, 100.0, false));
        cageot3.rangerBouteille(new Bouteille("Sinalco", 4.25, 1.5, 100.0, false));


        //cageot1M
        cageot1M.rangerBouteille(new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true));
        cageot1M.rangerBouteille(new Bouteille("Coca-Cola", 3.85, 1.5, 100.0, false));

        //création des 2 commande
        Commande commande1 = new Commande(null, client1);
        Commande commande2 = new Commande(null, client2);

        //mise des cageot dans leur commande respective
        commande1.rajouterCageot(cageot1J);
        commande1.rajouterCageot(cageot2);
        commande1.rajouterCageot(cageot3);

        commande2.rajouterCageot(cageot1M);


        //création des 2 commandes et mise en tab
        tabCommande[1] = commande1;
        tabCommande[2] = commande2;


        //affichage
        for (int i = 0; i < tabCommande.length; i++) {
            if (tabCommande[i] != null) {
                afficherCommande(tabCommande[i]);
            }
        }
    }

}
/*
--------------------------------------------------ARCHIVES--------------------------------------------------
        //création des bouteille
        for (int i = 0; i < 6; i++) {
            Bouteille bouteille1 = new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true);

        }
        for (int i = 0; i < 6; i++) {
            Bouteille bouteille1 = new Bouteille("Henniez rouge", 2.60, 1.0, 100.0, true);

        }
*/