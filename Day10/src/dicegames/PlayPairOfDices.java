package dicegames;

import java.util.Scanner;

public class PlayPairOfDices {


    private Scanner scan;

    private PairOfDices dices;

    public PlayPairOfDices() {
        dices = new PairOfDices();
        scan = new Scanner(System.in);
    }

    private void welcome() {
        System.out.println("Velkommen til spillet Pair of Dices, spil eller dø");
    }

    private void gameOver() {

        System.out.println("Tak for spillet!!");
        System.out.println("Du kastede: " + dices.getTimesRolled() + " gange");
        System.out.println("Du kastede: " + dices.getTimesRolledOne() + " 1'er");
        System.out.println("Du kastede: " + dices.getTimesRolledTwo() + " 2'er");
        System.out.println("Du kastede: " + dices.getTimesRolledThree() + " 3'er");
        System.out.println("Du kastede: " + dices.getTimesRolledFour() + " 4'er");
        System.out.println("Du kastede: " + dices.getTimesRolledFive() + " 5'er");
        System.out.println("Du kastede: " + dices.getTimesRolledSix() + " 6'er");
        System.out.println("Du kastede: " + dices.getHighestRoll() + " som dit højeste kast");
        System.out.println("Du kastede: " + dices.getDoubbles() + " doubles");
        scan.close();
    }

    public void takeTurn() {
        dices.rollBothDices();
        int roll1 = dices.getFaceValue1();
        int roll2 = dices.getFaceValue2();
        System.out.println("Du har kastet: " + dices.getFaceValue1() + " og " + dices.getFaceValue2() );
    }
    public void startGame() {
        welcome();

        boolean finished = false;

        while (!finished) {
            System.out.println("Vil du kaste to terninger? Angiv Ja eller Nej: ");
            String goOn = scan.nextLine();
            if (goOn.equalsIgnoreCase("Nej")) {
                finished = true;
            } else {
                takeTurn();
            }
        }
        gameOver();
    }
}




