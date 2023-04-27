package manytomany;

import java.util.List;

public class Article {
    private long id;
    private String nom;
    private double prix;
    private int qte;
    private List<Commande> commandes ;
    public void addCommande(Commande commande){
        commandes.add(commande);
    }
}
