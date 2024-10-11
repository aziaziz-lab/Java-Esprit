package GestionEmploye;

public class Responsable extends Employe{
    int Prime;
    public Responsable(int id, String nom, String adresse, int nbHeure,int Prime) {
        super(id, nom, adresse, nbHeure);
        this.Prime=Prime;

    }

    public int getPrime() {
        return Prime;
    }

    public  Responsable()
    {
        super();
    }
    public String ToString() {
        String STR=super.ToString()+"Prime"+Prime;
        return STR;
    }
    public float GetSalire()
    {
        int Somme=NbHeure*10+Prime;
        if(NbHeure<160)
        {
            return Somme;

        }
        return (Somme*20)/100;
    }
}
