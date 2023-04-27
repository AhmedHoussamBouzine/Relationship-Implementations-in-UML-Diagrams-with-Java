package composition;

public class Voiture {
    private long id;
    private String marque;
    private double prix;
    private Volant volant;

    public Voiture() {
        volant = new Volant();
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public double getPrix() {
        return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }



}

