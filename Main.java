import tn.tuniprob.gestionmagasin.Produits;

import java.time.LocalDate;
import java.util.Objects;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {

    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2018-05-05");
        Produits p1 = new Produits();
        Produits p2 = new Produits(1021,"lait","Delice",0,date);
        Produits p3 = new Produits(2510,"Yaourt","Vitalait",0,date);
        Produits p4 = new Produits(3250,"Tomate","Sicam",1200,date);

        Magasin [] Magasins = new Magasin[10];
        Magasin MG1 = new Magasin(1,"Bardo");
        Magasin MG2 = new Magasin(2,"Bardo");
        Magasin MG3 = new Magasin(3,"Bardo");
        MG1.AjouterProduits(p2);
        MG1.AjouterProduits(p3);
        MG2.AjouterProduits(p4);
        System.out.println(p1.Comparer(p2));
        System.out.println(p1.Comparer(p2,p3));
        System.out.println(MG1.ChercherProduits(p2));
       MG2.AjouterProduits(p2);
       MG2.afficher();
        System.out.println(Magasin.GetSomme());
        System.out.println(MG2.SupprimerProduits(p2));
        System.out.println(Magasin.GetSomme());
        MG1.CompareMG(MG2).afficher();
        MG2.afficher();

       /* Produits[] myArray;
        LocalDate date = LocalDate.parse("2018-05-05");
        myArray = new Produits[4];
      Produits p1 = new Produits();
        Produits p2 = new Produits(1021,"lait","Delice",0,date);
        Produits p3 = new Produits(2510,"Yaourt","Vitalait",0,date);
        Produits p4 = new Produits(3250,"Tomate","Sicam",1200,date);
      p1.afficher();
        p2.afficher();
        p3.afficher();
        p4.afficher();
    myArray[0] = p1;
    myArray[1] = p2;
    myArray[2] = p3;
    myArray[3] = p4;
    for(Produits p : myArray) {
        if(p.verifier())
       p.afficher();
    }
        for(Produits p : myArray) {
            if(p.verifier())
                p.afficher();
            if(p.InfoManquants())
             System.out.println("les produits modifies sont");
            p.afficher();

        }
        for(Produits p : myArray) {
            p.verifier();
            System.out.println( p.toString());
        }*/
      //  Magasin MG = new Magasin(1,"Bardo",15);
       // MG.AjouterProduits();
       // MG.getListArticle();
       // MG.AfficherProduits();
       // MG.getListArticle();
    }
}