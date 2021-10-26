package dicegamesTobi;

/**
 * This application instantiates the PlayRollDie game and starts it.
 */
public class RollDieApp {

    /**
     * The main method. Don't call this one directly.
     * @param args the program arguments
     */
	public static void main(String[] args) {
		//PlayRollDie play = new PlayRollDie();
		//play.startGame();
		PairOfDices d6 = new PairOfDices();
		PairOfDices d8 = new PairOfDices(8);
		PairOfDices d4 = new PairOfDices(4);
		PairOfDices d100 = new PairOfDices(100);
		d100.rollBothDices();
		//d6.rollBothDices();
		//d6.resetPairOfDice();
		//d6.rollBothDices();
		//d6.rollBothDices();
		//d6.rollBothDices();
		//d6.rollBothDices();
		//d8.rollBothDices();
		//d8.rollBothDices();
		//d4.rollBothDices();
		//d4.rollBothDices();

		PlayPairOfDice play = new PlayPairOfDice();
		play.startGame();
	}

}
