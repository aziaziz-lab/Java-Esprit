import tn.tuniprob.gestionmagasin.Produits;

import java.util.Arrays;
import java.util.Objects;
import java.util.Scanner;

public class Magasin {
    int ID;
    String Adreese;
    int Capacite=0;
    Produits[] EnsembleProduits= new  Produits[50];
    private static int  Somme =0;
    public Magasin(int ID,String Adreese)
    {
        this.ID=ID;
        this.Adreese=Adreese;
        //this.Capacite=Capacite;
    }

public static int GetSomme()
{
    return Somme;
}

    public void afficher() {
        System.out.println("l id du Magasin est" + this.ID);
        System.out.println("L'adresse'" + this.Adreese);
        System.out.println("Capacite" + this.Capacite);
    }
public boolean ChercherProduits(Produits p)
{
    for(Produits pr : EnsembleProduits) {
        if(pr!=null)
        if(pr.Comparer(p))
            return true;
    }
    return false;
}

    public void AjouterProduits(Produits p1){
      if(Capacite <50) {
          if (ChercherProduits(p1)) {
              System.out.println("ce produit existe deja");
          } else {
              EnsembleProduits[Capacite] = p1;
              Capacite++;
              Somme++;
          }
      }
          else
          System.out.println("La capacite est au max");

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
                if(ChercherProduits(p)) {
                    System.out.println("ce produit existe deja");
                    test=true;
                }
                else {
            EnsembleProduits[i]= p;
                Capacite++;
                    Somme++;
                    i++;}
                }
            else
                test=true;
        }while ((!test || i==Capacite)&&Capacite<50);
    }
    public boolean SupprimerProduits(Produits p){
        int i=0;
        boolean test= false;
        while(i<Capacite&& test==false)
        {

                if (this.EnsembleProduits[i]!=null&&EnsembleProduits[i].Comparer(p)) {
                    for (int j = i; j < Capacite-1; j++) {
                        EnsembleProduits[j] = EnsembleProduits[j + 1];
                    }
                    test = true;
                   Capacite--;
                   return true;
                }

            i++;
        }
        return false;
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

    public Magasin CompareMG(Magasin MG) {
       return MG.Capacite>Capacite? MG : this;
        }

}
