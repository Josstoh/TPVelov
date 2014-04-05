package metier;


public class Station {
    
    private String numero;
    private String nom;
    private int arrondissement;
    private String localisation;

    public Station(String numero, String nom, int arrondissement, String localisation) {
        this.numero = numero;
        this.nom = nom;
        this.arrondissement = arrondissement;
        this.localisation = localisation;
    }

    public String getNumero() {
        return numero;
    }

    public String getNom() {
        return nom;
    }

    public int getArrondissement() {
        return arrondissement;
    }

    public String getLocalisation() {
        return localisation;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setArrondissement(int arrondissement) {
        this.arrondissement = arrondissement;
    }

    public void setLocalisation(String localisation) {
        this.localisation = localisation;
    }

    @Override
    public String toString() {
        return "Station{" + "numero=" + numero + ", nom=" + nom + ", arrondissement=" + arrondissement + ", localisation=" + localisation + '}';
    }
    
    
}
