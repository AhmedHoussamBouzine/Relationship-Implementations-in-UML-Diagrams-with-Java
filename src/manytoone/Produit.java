package manytoone;

public class Produit {
    private long id;
    private String nom;
    private double prix;
    private int qte;
    private Categorie categorie;
    public Produit(long id, String nom, double prix, int qte) {
        this.id = id;
        this.nom = nom;
        this.prix = prix;
        this.qte = qte;
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

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public int getQte() {
        return qte;
    }

    public void setQte(int qte) {
        this.qte = qte;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
