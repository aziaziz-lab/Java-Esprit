import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Etudioant implements Comparable<Etudioant> {
    private int id;
    private String nom;
    private String prenom;

    public Etudioant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Etudioant)) return false;
        Etudioant other = (Etudioant) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Etudiant { id: " + id + ", nom: " + nom + ", prenom: " + prenom + " }";
    }

    @Override
    public int compareTo(Etudioant other) {
        return Integer.compare(this.id, other.id);
    }
}