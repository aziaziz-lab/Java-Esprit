public class Enseignant{

    private int id;
    private String nom;
    private String prenom;

    public Enseignant(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
    }
    public Enseignant() {
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
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Enseignant)) return false;
        Enseignant other = (Enseignant) obj;
        return this.id == other.id;
    }
    public String toString() {
        return "Enseignant { id: " + id + ", nom: " + nom + ", prenom: " + prenom + " }";
    }
    public int hashCode() {
        return Integer.hashCode(id); // Génération d'un hash basé sur l'ID
    }
}
