package GestionEmploye;

public class Caissier extends Employe{
    int NumeroDeCaisse;
    public Caissier(){
        super();
    }
    public  Caissier(int id, String nom, String adresse, int nbHeure,int NumeroDeCaisse)
    {
        super(id, nom, adresse, nbHeure);
        this.NumeroDeCaisse=NumeroDeCaisse;
    }
    public float GetSalire()
    {
        int Somme=NbHeure*5;
        if(NbHeure<180)
        {
            return Somme;

        }
        return (Somme*15)/100;
    }
}
