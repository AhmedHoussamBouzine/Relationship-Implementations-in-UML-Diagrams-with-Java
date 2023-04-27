package manytoone;

import java.util.List;

public class Categorie {
    private long id;
    private String nom;
    private List<Produit> produits;
    public Categorie(long id, String nom) {
        this.id = id;
        this.nom = nom;
    }
    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
}
