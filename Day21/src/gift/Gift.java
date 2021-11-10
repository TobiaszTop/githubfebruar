package gift;

import java.util.ArrayList;

/**
 * Modeling a Swimmer
 */
public class Gift {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Person> rentals = new ArrayList<Person>();

    /**
     * Initialize a new swimmer with name, club, yearGroup, and lap times.
     */

   public Gift(String license, double pricePerDay, int purchaseYear) {
       this.license = license;
       this.pricePerDay = pricePerDay;
       this.purchaseYear = purchaseYear;
   }

   public String getLicense(){
       return license;
   }
   public double getPricePerDay(){
       return pricePerDay;
   }
   public int getPurchaseYear(){
       return purchaseYear;
   }

   void addRental(Person rental){

   }
}
