public interface University {
        public void ajouterEtudiant(Etudioant e);
        public boolean rechercherEtudiant(Etudioant e);
        public boolean rechercherEtudiant(String nom);
        public void supprimerEtudiant(Etudioant e);
        public void displayEtudiants();
        public void trierEtudiantsParId();
        public void trierEtudiantsParNom();

}
