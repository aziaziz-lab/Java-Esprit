import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;  // Import the Scanner class
public class Produits {
    int ID;
    String Libl;
    String Marque;
    float Prix;
    LocalDate DateExpiration;

    public Produits() {
        this.ID = 0;
        this.Libl = null;
        this.Marque = null;
        this.Prix = 0;
        this.DateExpiration=null;
    }
    public Produits(int ID, String Libl, String Marque, float Prix, LocalDate DateExpiration) {
        this.ID = ID;
        this.Libl = Libl;
        this.Marque = Marque;
        this.Prix = Prix;
        this.DateExpiration = DateExpiration;
    }

    
    public void afficher() {
        System.out.println("l id du produit est" + this.ID);
        System.out.println("Libelle du produit est" + this.Libl);
        System.out.println("Marque du produit est" + this.Marque);
        System.out.println("Prix du produit est" + this.Prix);
        System.out.println("La date du produit est" + this.DateExpiration);
    }

    public boolean verifier() {
        if (this.Libl == "Lait") {
            this.Prix = 700;
            return true;
        }
        return false;
    }

    public boolean InfoManquants() {
boolean test = false;
        if (this.Libl == null) {
            Scanner myObj = new Scanner(System.in);// Create a Scanner object
            System.out.println("Enter Libelle");
            this.Libl = myObj.nextLine();
            test=true;
        }
        if (this.Marque == null) {
            Scanner myObj = new Scanner(System.in);
            System.out.println("Enter Marque");
            this.Marque = myObj.nextLine();
            test=true;
        }
        if (this.Prix == 0) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter prix");
            this.Prix =Integer.parseInt(myObj.nextLine());
            test=true;
        }
        if (this.ID == 0) {
            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Enter l'id");
            this.ID =Integer.parseInt(myObj.nextLine());
            test=true;
        }
        return  test;
    }
}
