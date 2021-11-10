package car;

import java.util.ArrayList;

public class CarApp {
    
    public static void main(String[] args) {

        Car c = new Car("abc", 1.5, 2000);
        Car c2 = new Car("abc", 1.5, 2000);
        Rental r = new Rental(123, 20, "202020");
        Rental r2 = new Rental(134, 50, "505050");

        c.addRental(r);
        c2.addRental(r);

        r2.addCar(c);
        r2.addCar(c2);

        System.out.println(r.getPrice());
    }
    
}
