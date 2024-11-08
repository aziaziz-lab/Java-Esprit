import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class GestionUniversity implements University {
    private ArrayList<Etudioant> ListeEtudiant = new ArrayList<>();

    public void ajouterEtudiant(Etudioant e) {
        ListeEtudiant.add(e);
    }

    public boolean rechercherEtudiant(Etudioant e) {
        return ListeEtudiant.contains(e);
    }

    public boolean rechercherEtudiant(String nom) {
        for (Etudioant etudiant : ListeEtudiant) {
            if (etudiant.getNom().equalsIgnoreCase(nom)) {
                return true;
            }
        }
        return false;
    }

    public void supprimerEtudiant(Etudioant e) {
        ListeEtudiant.remove(e);
    }

    public void displayEtudiants() {
        for (Etudioant etudiant : ListeEtudiant) {
            System.out.println(etudiant);
        }
    }

    public void trierEtudiantsParId() {
        Collections.sort(ListeEtudiant);
    }

    public void trierEtudiantsParNom() {
        Collections.sort(ListeEtudiant, new Comparator<Etudioant>() {
            @Override
            public int compare(Etudioant e1, Etudioant e2) {
                return e1.getNom().compareToIgnoreCase(e2.getNom());
            }
        });
    }
}