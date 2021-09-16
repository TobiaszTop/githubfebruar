package opgave6;

public class CarApp {

	public static void main(String[] args) {
		/*
		Car myCar = new Car("VW UP", "White");
		System.out.println(myCar.getBrand());
		myCar.setRegistrationNumber("AB 11 123");
		System.out.println(myCar.getRegistrationNumber());
		System.out.println(myCar.getKm());
		*/

		Car car1 = new Car("VW", "Black");
		car1.setRegistrationNumber("BO 08 135");
		car1.setKm(776);
		System.out.println("****************************");
		System.out.println(car1.getBrand() + " " + car1.getColor());
		System.out.println(car1.getRegistrationNumber() + " har kørt " + car1.getKm());
		System.out.println("****************************");

	}

}
