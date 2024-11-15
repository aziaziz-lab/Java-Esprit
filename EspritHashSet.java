import java.util.HashSet;

public class EspritHashSet implements GestionEnseignant{
    HashSet hash = new HashSet();
    HashSet<Enseignant> ListeEnseignat= new HashSet<>();
    public void ajouterEnseignant(Enseignant e)
    {
        ListeEnseignat.add(e);
    }
    public boolean rechercherEnseignant (Enseignant e)
    {
       return ListeEnseignat.contains(e);
    }
    public boolean rechercherEnseignant (int id)
    {
        return hash.contains(new Enseignant(id, "", ""));
    }
    public void supprimerEnseignant (Enseignant e)
    {
        ListeEnseignat.remove(e);
    }
    public void displayEnseignants()
    {
        System.out.println(ListeEnseignat);
    }
}
