import tn.tuniprob.gestionmagasin.Produits;

import java.util.Scanner;

public class Magasin {
    int ID;
    String Adreese;
    int Capacite;
    Produits[] EnsembleProduits= new  Produits[50];

    public Magasin(int ID,String Adreese, int Capacite)
    {
        this.ID=ID;
        this.Adreese=Adreese;
        this.Capacite=Capacite;
    }
    public void AjouterProduits(){
        boolean test= false;
        String rep;
        int i=0;
        Scanner myObj = new Scanner(System.in);
        do {
            Produits p = new Produits();
            System.out.println("Vous voulez ajouter un produit?");
            rep=myObj.nextLine();
            if(rep.equals("OUI"))
            {
                p.Remplir();
            EnsembleProduits[i]= p;
                Capacite++;
                i++;}
            else
                test=true;
        }while (!test || i==Capacite);
    }

    public void AfficherProduits(){
       System.out.println("L'id est"+ID);
        System.out.println("L'adresse est"+Adreese);
        System.out.println("La capacite est"+Capacite);
        System.out.println("La liste des produits");
      for (Produits ensembleProduit : EnsembleProduits)
      {if(ensembleProduit != null) {
          System.out.println("Le prix de l'artice est" + ensembleProduit.getPrix());
          System.out.println("Le nom de l'artice est" + ensembleProduit.getLibl());
      }
        }
    }
    public int getListArticle() {
            if(EnsembleProduits != null) {
               return Capacite;
            }
            return 0;
    }

}
