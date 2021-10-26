package dicegames;

/**
 * This class models one pair of dices.
 *
 */
public class PairOfDices {
	private int sides;
	private int faceValue;
	private boolean win = false;
	private int timesRolled = 0;
	private int timesRolledSix = 0;
	private int timesRolledFive = 0;
	private int timesRolledFour = 0;
	private int timesRolledThree = 0;
	private int timesRolledTwo = 0;
	private int timesRolledOne = 0;
	private int doubbles = 0;
	private int highestRoll = 0;

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
	// TODO: put the constructor here!
	public PairOfDices() {
		die1 = new Die();
		die2 = new Die();
		int timesRolled = 0;
		int timesRolledSix = 0;
		int timesRolledFive = 0;
		int timesRolledFour = 0;
		int timesRolledThree = 0;
		int timesRolledTwo = 0;
		int timesRolledOne = 0;
		int doubbles = 0;
		int highestRoll = 0;
	}

	public PairOfDices(int sides) {
		die1 = new Die(sides);
		die2 = new Die(sides);
		int timesRolled = 0;
		int timesRolledSix = 0;
		int timesRolledFive = 0;
		int timesRolledFour = 0;
		int timesRolledThree = 0;
		int timesRolledTwo = 0;
		int timesRolledOne = 0;
		int doubbles = 0;
		int highestRoll = 0;
	}

	public void rollBothDices() {
		die1.roll();
		die2.roll();
		timesRolled = timesRolled+1;

		// Die 1d
		if (die1.getFaceValue() == 6) {
			timesRolledSix = timesRolledSix + 1;
		}
		if (die1.getFaceValue() == 5) {
			timesRolledFive = timesRolledFive + 1;
		}
		if (die1.getFaceValue() == 4) {
			timesRolledFour = timesRolledFour + 1;
		}
		if (die1.getFaceValue() == 3) {
			timesRolledThree = timesRolledThree + 1;
		}
		if (die1.getFaceValue() == 2) {
			timesRolledTwo = timesRolledTwo + 1;
		}
		if (die1.getFaceValue() == 1) {
			timesRolledOne = timesRolledOne + 1;
		}
		//Die 2
		if (die2.getFaceValue() == 6) {
			timesRolledSix = timesRolledSix + 1;
		}
		if (die2.getFaceValue() == 5) {
			timesRolledFive = timesRolledFive + 1;
		}
		if (die2.getFaceValue() == 4) {
			timesRolledFour = timesRolledFour + 1;
		}
		if (die2.getFaceValue() == 3) {
			timesRolledThree = timesRolledThree + 1;
		}
		if (die2.getFaceValue() == 2) {
			timesRolledTwo = timesRolledTwo + 1;
		}
		if (die2.getFaceValue() == 1) {
			timesRolledOne = timesRolledOne + 1;
		}
		if (die1.getFaceValue() == die2.getFaceValue()) {
			doubbles = doubbles + 1;
		}
		if (sumOfDices() > highestRoll) {
			highestRoll = sumOfDices();
		}

	}

	public int getFaceValue1() {
		return die1.getFaceValue();
	}

	public int getFaceValue2() {
		return die2.getFaceValue();
	}

	public int getTimesRolledOne() {
		return timesRolledOne;
	}

	public int getTimesRolledTwo() {
		return timesRolledTwo;
	}

	public int getTimesRolledThree() {
		return timesRolledThree;
	}

	public int getTimesRolledFour() {
		return timesRolledFour;
	}

	public int getTimesRolledFive() {
		return timesRolledFive;
	}

	public int getTimesRolledSix() {
		return timesRolledSix;
	}

	public int getTimesRolled() {
		return timesRolled;
	}

	public int getDoubbles() {
		return doubbles;
	}

	public int getHighestRoll() {
		return highestRoll;
	}

	public void resetPairOfDice() {
		timesRolledOne = 0;
		timesRolledTwo = 0;
		timesRolledThree = 0;
		timesRolledFour = 0;
		timesRolledFive = 0;
		timesRolledSix = 0;
		timesRolled = 0;
		doubbles = 0;
		highestRoll = 0;

	}


	int getFaceValue(){return faceValue;}

	int sumOfDices() {
		return die1.getFaceValue()+die2.getFaceValue();
	}
}
