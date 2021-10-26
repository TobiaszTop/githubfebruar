package dicegamesTobi;

/**
 * This class models one pair of dices.
 *
 */
public class PairOfDices {
	private int sides;
	private int faceValue;
	private int rolls = 0;
	private int doubleThrows = 0;
	private int highestThrow = 0;
	private int[] faceThrows;
    /**
     * The first die in the pair.
     */
	private Die die1;
	/**
	 * The second die in the pair.
	 */
	private Die die2;

	/**
	 * Constructor for objects of class PairOfDices
	 */
	public PairOfDices() {
		die1 = new Die();
		die2 = new Die();
		faceThrows = new int[6];
		sides = 6;
	}

	public PairOfDices(int sides) {
		die1 = new Die(sides);
		die2 = new Die(sides);
		faceThrows = new int[sides];
		this.sides = sides;
	}

	public int getSides(){ return sides; }
	public int getRolls(){ return rolls; }
	public int getDoubleThrows(){ return doubleThrows; }
	public int getHighestThrow(){ return highestThrow; }
	public void printFaceThrows(){
		for(int i=1; i<=sides; i++){
			System.out.println("Du har kastet " + i + " pip " + faceThrows[i-1] + " gange");
		}
	}

	public int sumOfDices(){
		return die1.getFaceValue() + die2.getFaceValue();
	}

	public void resetPairOfDice(){
		rolls = 0;
		doubleThrows = 0;
		highestThrow = 0;
		for(int i=0; i<die1.getSides(); i++){
			faceThrows[i]=0;
		}
	}

	public void rollBothDices(){

		die1.roll();
		die2.roll();

		//System.out.println("-----------------------------");

		if(die1.getFaceValue() == die2.getFaceValue()){doubleThrows++;}

		for(int i=1; i<=sides; i++){
			if(die1.getFaceValue()==i){faceThrows[i-1]++;}
			if(die2.getFaceValue()==i){faceThrows[i-1]++;}
			//System.out.println(i+"s : " + faceThrows[i-1]);
		}
		if(sumOfDices() > highestThrow){highestThrow = sumOfDices();}
		rolls++;

		//System.out.println("Die1: " + die1.getFaceValue());
		//System.out.println("Die2: " + die2.getFaceValue());
		//System.out.println("Sum: " + sumOfDices());
		//System.out.println("Rolls: " + rolls);
		//System.out.println("Doubles: " + doubleThrows);
		//System.out.println("Highest: " + highestThrow);

	}

}
