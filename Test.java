package Test;

import Entite.Produit;
import Gestion.Magasin;
import GestionEmploye.Caissier;
import GestionEmploye.Employe;
import GestionEmploye.Responsable;
import GestionEmploye.Vendeur;

import java.sql.SQLOutput;
import java.util.Date;
public class Test {
    public static void main(String [] arg)
    {

        Produit p1=new Produit();

        System.out.println("id :"+p1.getIdentifiant());
        System.out.println("marque :"+p1.getMarque());
        System.out.println("libelle :"+p1.getLibelle());
        System.out.println("prix :"+p1.getPrix());

     Produit p2=new Produit(1024,"Delice","Lait");
        System.out.println("id :"+p2.getIdentifiant());
        System.out.println("marque :"+p2.getMarque());
        System.out.println("libelle :"+p2.getLibelle());
        System.out.println("prix :"+p2.getPrix());
Date date=new Date();
        Produit p3=new Produit(11,"Sicam","Tomate",1.2f,date);
        System.out.println("Entite.Produit 3");
        System.out.println("id :"+p3.getIdentifiant());
        System.out.println("marque :"+p3.getMarque());
        System.out.println("libelle :"+p3.getLibelle());
        System.out.println("prix :"+p3.getPrix());


        p1.setPrix(0.7f);
        p1.setMarque("Vitalait");
        p1.afficher();
        System.out.println("to String");
        System.out.println(p3.toString());
        System.out.println(p3);


        Magasin m1=new Magasin(1,"Centre-Ville","Carrefour");
        m1.ajouter(p2);
        m1.ajouter(p1);
        m1.ajouter(p3);

        System.out.println("marques produit");
        m1.afficherMarquePro();

       // System.out.println(m1);
Magasin m2=new Magasin(2,"Menzah 6","Monoprix");

   m2.ajouter(p2);
    m1.ajouter(p1);

        Employe Caissier1=new Caissier(1,"Caissier1","Bizert",15,1);
        Employe Caissier2=new Caissier();
        Employe Vendeur=new Vendeur();
        Employe Responsable=new Responsable();
        m1.ajouterEmploye(Vendeur);
        m1.ajouterEmploye(Responsable);
        m1.ajouterEmploye(Caissier1);
        m1.ajouterEmploye(Caissier2);
        Employe CaissierMonoprix=new Caissier();
        Employe Vendeur1M=new Vendeur();
        Employe Vendeur2M=new Vendeur();
        Employe Vendeur3M=new Vendeur();
        Employe Resp1M=new Responsable();
        m2.ajouterEmploye(Resp1M);
        m2.ajouterEmploye(Vendeur1M);
        m2.ajouterEmploye(Vendeur2M);
        m2.ajouterEmploye(Vendeur3M);
        m2.ajouterEmploye(CaissierMonoprix);
       System.out.println(m1.toString());
        System.out.println(m2.toString());
        for(int i=0;i<m1.getNbEmploye();i++)
        {System.out.println(m1.toString());
        }
       m1.afficherNbEmployeeParType();
       System.out.println(m1.GetSalire());

//        System.out.println("Le nombre total :"+Magasin.getTotal());
//
//        System.out.println(p1.comparer(p2));
//
//
//        Produit p4=new Produit(11,"Sicam","Tomate",1.2f,date);
//
//        System.out.println(Produit.comparer(p2,p3));
//
//
//        m1.ajouter(p4);
//
//        System.out.println("Plus produit");
//        System.out.println(m1.plusProduit(m2));
//
//
//        System.out.println("supprimer produit");
//
//        m1.supprimer(p1);
//
//        System.out.println(m1);

    }
}
