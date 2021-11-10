package car;

import java.util.ArrayList;

/**
 * Models a training plan for a Swimmer
 */
public class Rental {
	private int days;
	private int number;
	private String date;
	private ArrayList<Car> cars = new ArrayList<Car>();
	public Rental(int days, int number, String date){
		this.days = days;
		this.number = number;
		this.date = date;
	}
	
	public int getDays(){
		return days;
	}
	public int getNumber(){
		return number;
	}
	public String getDate(){
		return date;
	}
	void addCar(Car car) {
		if (!cars.contains(car)) {
			cars.add(car);
			car.addRental(this);
		}
	}
}
