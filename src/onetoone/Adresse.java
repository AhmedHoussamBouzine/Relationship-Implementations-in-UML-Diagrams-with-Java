package onetoone;

public class Adresse {
    private long id;
    private String ville;
    private String pays;
    private int codePostal;
    private Employe employe;
    public Adresse() {
    }

    public Adresse(long id, String ville, String pays, int codePostal, Employe employe) {
        this.id = id;
        this.ville = ville;
        this.pays = pays;
        this.codePostal = codePostal;
        this.employe = employe;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public Employe getEmploye() {
        return employe;
    }

    public void setEmploye(Employe employe) {
        this.employe = employe;
    }
}
