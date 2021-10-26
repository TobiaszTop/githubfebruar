package opgave3Teater;

import java.util.Scanner;

public class TheaterFloor {
	int[][] seats = { { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 },
			{ 10, 10, 10, 10, 10, 10, 10, 10, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 }, { 10, 10, 20, 20, 20, 20, 20, 20, 10, 10 },
			{ 20, 20, 30, 30, 40, 40, 30, 30, 20, 20 }, { 20, 30, 30, 40, 50, 50, 40, 30, 30, 20 },
			{ 30, 40, 50, 50, 50, 50, 50, 50, 40, 30 } };

	private Scanner scan;
	/**
	 * Hvis plads seat på række row er ledig reserveres pladsen og prisen på pladsen
	 * returneres. Der returneres 0 hvis pladsen er optaget.
	 *
	 * @param row
	 * @param seat
	 * @return
	 */

	public void buySeat(int row, int seat) {
		if(seats[row][seat] == 0){
			System.out.println("Plads " +row+ "." +seat+ " - ikke ledig");
		}
		else{
			System.out.println("Plads " +row+ "." +seat+ " - " + seats[row][seat] + " kr.");
			System.out.println("Ønsker du at reservere plads " +row+ "." +seat+ "? (ja/nej)");
			String answer = scan.nextLine();
			if(answer.equalsIgnoreCase("Ja")) {
				seats[row][seat] = 0;
				System.out.println("Plads " +row+ "." +seat+ " er nu reserveret.");
			}
		}
		System.out.println("Tak for din tid.");
	}

	/**
	 * Hvis der er en plads ledig med den pågældende pris, reserveres pladsen og
	 * prisen returneres. Der returneres 0, hvis der ikke er nogen pladser ledige
	 * til den pågældende pris.
	 *
	 // @param row
	 // @param seat
	 * @return
	 */
	public void buySeat(int price) {
		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats[row].length; col++) {
				if(seats[row][col] == price){
					System.out.println("Plads " +row+ "." +col+ " - " + seats[row][col] + " kr.");
					System.out.println("Ønsker du at reservere plads " +row+ "." +col+ "? (ja/nej)");
					String answer = scan.nextLine();
					if(answer.equalsIgnoreCase("Ja")) {
						seats[row][col] = 0;
						System.out.println("Plads " +row+ "." +col+ " er nu reserveret.");
					}
				} else if(row == seats.length-1 && col == seats[0].length){
					System.out.println("Der er ingen ledig pladser til " +price+ "kr.");
				}
			}
		}
		System.out.println("Tak for din tid.");
	}

	public void printTheaterFloor() {
		for (int row = 0; row < seats.length; row++) {
			for (int col = 0; col < seats[row].length; col++) {
				System.out.print(seats[row][col] + "  ");
		}
		System.out.println();
	}
	}
}
