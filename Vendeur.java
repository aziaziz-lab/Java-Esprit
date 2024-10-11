package GestionEmploye;

public class Vendeur extends  Employe{
    float TauxDeVente;
    public Vendeur(int id, String nom, String adresse, int nbHeure, float tauxDeVente)
    {
        super(id, nom, adresse, nbHeure);
        this.TauxDeVente = tauxDeVente;
    }
    public Vendeur()
    {
        super();
    }
    public String ToString()
    {
        return super.ToString() + "Le taux est" + TauxDeVente;
    }
    public float GetSalire()
    {
        return 450*TauxDeVente;
    }
}
