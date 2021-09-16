package Opgave6;

/**
 * Write a description of class Barn here.
 */
public class Date {
	private int month;
	private int day;

	public Date(int month, int day){
		this.month = month;
		this.day = day;
	}

	public String getSeason(){
		if(month <= 3){
			if(month%3 == 0 && day >= 21){
				return "Spring";
			}
			return "Winter";
		}else if(month <= 6){
			if(month%3 == 0 && day >= 21){
				return "Summer";
			}
			return "Spring";
		}else if(month <= 9){
			if(month%3 == 0 && day >= 21){
				return "Fall";
			}
			return "Summer";
		}else if(month <= 12){
			if(month%3 == 0 && day >= 21){
				return "Winter";
			}
			return "Fall";
		}
		return "fejl";
	}

}
