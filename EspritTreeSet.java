import java.util.HashSet;
import java.util.TreeSet;

public class EspritTreeSet implements GestionEnseignant{
    TreeSet Tree = new TreeSet();
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
        return Tree.contains(new Enseignant(id, "", ""));
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
