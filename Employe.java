package GestionEmploye;

public class Employe {
    int Id;
    String Nom;
    String Ndresse;
    int NbHeure;


    public int getId() {
        return Id;
    }

    public String getNom() {
        return Nom;
    }

    public String getNdresse() {
        return Ndresse;
    }

    public int getNbHeure() {
        return NbHeure;
    }

    public Employe() {
    }

    public Employe(int id, String nom, String adresse, int nbHeure) {
        this.Id = id;
        this.Nom = nom;
        this.Ndresse = adresse;
        this.NbHeure = nbHeure;
    }

    public String ToString() {
        return "l 'id est "+ Id+"Le nom est"+ Nom+"L'adresse" + Ndresse+"L'nbHeure "+ NbHeure;
    }
    public float GetSalire()
    {
        return NbHeure;
    }
}
