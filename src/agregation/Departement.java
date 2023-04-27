package agregation;

import java.util.List;

public class Departement {
    private long id;
    private String nom;
    private List<Professeur> professeurs ;

    public Departement(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }

    public void setProfesseurs(List<Professeur> professeurs) {
        this.professeurs = professeurs;
    }
    public void addProfesseur(Professeur professeur){
        professeurs.add(professeur);
    }
}
