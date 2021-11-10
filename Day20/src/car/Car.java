package car;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Modeling a Swimmer
 */
public class Car {
    private String license;
    private double pricePerDay;
    private int purchaseYear;
    private ArrayList<Rental> rentals = new ArrayList<Rental>();

    /**
     * Initialize a new swimmer with name, club, yearGroup, and lap times.
     */

   public Car(String license, double pricePerDay, int purchaseYear) {
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

   void addRental(Rental rental){
       this.rentals.add(rental);
   }
}
