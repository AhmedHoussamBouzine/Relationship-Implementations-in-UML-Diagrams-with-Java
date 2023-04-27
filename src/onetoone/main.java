package onetoone;

public class main {
    public static void main(String[] args) {
        Employe employe = new Employe();
        Adresse adresse = new Adresse();
        employe.setId(1);
        employe.setNom("bouzine");
        employe.setPrenom("Ahmed houssam");
        adresse.setId(1);
        adresse.setVille("Fes");
        adresse.setPays("Maroc");
        adresse.setCodePostal(30000);
        adresse.setEmploye(employe);
        employe.setAdresse(adresse);
    }
}
