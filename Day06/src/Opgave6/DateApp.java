package Opgave6;

import java.util.Scanner;

public class DateApp {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("What is the month?");
		int m = scan.nextInt();
		System.out.println("What is the day");
		int d = scan.nextInt();
		Date season = new Date(m, d);
		System.out.println("the season is " + season.getSeason());
	}

}
