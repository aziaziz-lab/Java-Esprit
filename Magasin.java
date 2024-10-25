package Gestion;

import Entite.Produit;
import GestionEmploye.Caissier;
import GestionEmploye.Employe;
import GestionEmploye.Responsable;
import GestionEmploye.Vendeur;
import Test.MagasinPleinException;
import Test.PrixNegatifException;

public class Magasin {

    private int id;
    private String nom;
    private String adresse;

    private final int CAPACITE = 2;

    private final int CAPACITEEMPLOYE = 20;

    private Employe[] TabEmpl= new Employe[CAPACITEEMPLOYE];
    private int NbEmploye;

    private int comp;
    private Produit[] tabprod = new Produit[CAPACITE];
    private static int total;
    public Magasin(int id, String ad,String nom) {
        this.id = id;
        adresse = ad;
        this.nom = nom;
    }

    public Employe[] getTabEmpl() {
        return TabEmpl;
    }

    public int getNbEmploye() {
        return NbEmploye;
    }

    public void ajouterEmploye(Employe e) {
        if (NbEmploye < CAPACITEEMPLOYE) {

            TabEmpl[NbEmploye] = e;
            NbEmploye++;
        } else {

            System.out.println("Magasin ne recrute plus");
        }
    }

    public void ajouter(Produit p) throws MagasinPleinException, PrixNegatifException {
        if(comp>=CAPACITE)
        {
            throw new MagasinPleinException("Pas de place dans le magasin");
        }
     if(p.getPrix()<0) throw new PrixNegatifException("pas doit etre +");

         if(chercherProduit(p)==false) {
                tabprod[comp] = p;
                comp++;
                total++;

        } else {

            System.out.println("Magasin plein");
        }
    }


    public static int getTotal(){
        return total;
    }
    public void afficherMarquePro() {
        for (int i = 0; i < comp; i++) {
            System.out.println("Marque :" + tabprod[i].getMarque());
        }

    }

    public String toString() {
        String str = "L'ensemble des produits\n";

        for (int i = 0; i < comp; i++) {
            str += tabprod[i] + "\n";
        }
        for (int i = 0; i < NbEmploye; i++) {
            str += TabEmpl[i].ToString() + "\n";
        }
        return "L'id :" + id + " l'adresse :" + adresse + "\n" + str ;
    }

    public boolean chercherProduit(Produit p){
        for (int i=0;i<comp;i++)
        { if(Produit.comparer(p,tabprod[i]))
           // if(p.comparer(tabprod[i]))
                return true;
        }
        return false;
    }


    public Magasin plusProduit(Magasin m)
    {
        if(this.comp<m.comp)
            return m;
        else if (this.comp>m.comp) {
            return this;
        }
        else return null;
    }

    public static Magasin plusProduit(Magasin m1,Magasin m2)
    {
        if(m1.comp<m2.comp)
            return m2;
        else if (m1.comp>m2.comp) {
            return m1;
        }
        else return null;
    }


    public int chercherProduitIndice(Produit p)
    {
     for (int i=0;i<comp;i++)

     {
         if(Produit.comparer(p,tabprod[i]))

             return i;
     }
        return -1;
    }
    public void afficherNbEmployeeParType()
    {
        int VenNb=0;
        int CNb=0;
        int RNB=0;
        for(int i=0;i<NbEmploye;i++)
        {
            if(TabEmpl[i].getClass().equals(Vendeur.class))
            {
                VenNb++;
            }
            if(TabEmpl[i].getClass().equals(Caissier.class))
            {
                CNb++;
            }
            if(TabEmpl[i].getClass().equals(Responsable.class))
            {
                RNB++;
            }
        }
        System.out.println("Vendeur"+VenNb);
        System.out.println("Caissier"+CNb);
        System.out.println("Responsable"+RNB);

    }
    public float GetPrime()
    {
        float Somme=0;
        for (int i=0;i<NbEmploye;i++)
        {
        }
        return Somme;
    }

    public float GetSalire()
    {
        float Somme=0;
        for (int i=0;i<NbEmploye;i++)
    {
        Somme=Somme+TabEmpl[i].GetSalire();
    }
        return Somme;
    }
    public boolean supprimer(Produit p)
    {
        int indice=chercherProduitIndice(p);

        if(indice!=-1)
        {

            for (int i=indice;i<=comp-1;i++)
            {
                tabprod[i]=tabprod[i+1];
            }
            tabprod[comp]=null;
            comp--;
            total--;
        }

        return false;
    }
}
