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
	void addCar(Car car){
		cars.add(car);
	}
	public int getPrice(){
		//return cars.getPricePerDay()*getDays();
		return 0;
	}

}
