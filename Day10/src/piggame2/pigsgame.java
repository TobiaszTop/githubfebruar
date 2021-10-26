package piggame2;

import java.util.Scanner;

public class pigsgame {
    public static Scanner scan = new Scanner(System.in);
    private static player player1;
    private static player player2;
    private static double totalDiceRolls =0;


    public static void main(String[] args) {
        pigGame();
    }

    private static void pigGame() {
        System.out.println("Welcome to a game of pig!");
        System.out.println("________________________________");
        wait(1000);
        setPlayerName1();
        SetPlayerName2();
        int HowManyPointsYouWant = setPoints();

        while (player1.getPlayScore() < HowManyPointsYouWant && player2.getPlayScore() < HowManyPointsYouWant) {
            printCurrentScore();
            wait(1000);
            player1.setTotalTurns(player1.getTotalTurns() + 1d);
            player1.setTotalRolls(totalDiceRolls+player1.getTotalRolls());
            totalDiceRolls =0;
            int player1TurnScore = playerturn(player1.getName(), player1.getPlayScore(),
                    player1.getTotalTurns(), player1.getTotalRolls());
            player1.setPlayScore(player1.getPlayScore() + player1TurnScore);
            if (player1.getPlayScore() < HowManyPointsYouWant) {
                player2.setTotalRolls(totalDiceRolls+player2.getTotalRolls());
                totalDiceRolls =0;
                player2.setTotalTurns(player2.getTotalTurns() + 1d);
                int player2TurnScore = playerturn(player2.getName(), player2.getPlayScore(),
                        player2.getTotalTurns(), player2.getTotalRolls());
                player2.setPlayScore(player2.getPlayScore() + player2TurnScore);
            }
        }
        printPigResults();
    }

    private static int setPoints() {
        System.out.println("How many points do you want to play to?");
        int points = scan.nextInt();
        wait(1000);
        System.out.println("Okay, we play till " + points);
        return points;
    }

    private static void printPigResults() {
        if (player1.getPlayScore() > player2.getPlayScore()) {
            System.out.println(player1.getName() + " won");
        } else {
            System.out.println(player2.getName() + " won");
        }
        System.out.println("Thanks for playing.");
    }

    private static int playerturn(String playerName, int playerscore, double totalTurnsPlayed, double totalDiceRolls2) {
        System.out.println(totalTurnsPlayed);
        System.out.println(totalDiceRolls2);
        wait(1000);
        System.out.println("________________________________");
        System.out.println(playerName + "'s turn");
        int turnScore = 0;
        boolean playerWantsToRoll = true;
        while (playerWantsToRoll) {
            int randomRoll = (int) (6 * Math.random()) + 1;
            totalDiceRolls++;
            wait(1000);
            System.out.println(playerName + " rolled a " + randomRoll);
            if (randomRoll == 1) {
                wait(1000);
                System.out.println("You rolled 0 " + playerName + "!! you got nothing on this turn");
                System.out.println("Now you get to sit for 5 seconds in sadness..");
                wait(5000);

                return 0;

            }
            turnScore += randomRoll;
            wait(1000);
            System.out.println(playerName + " has " + turnScore + " so far on this turn");
            wait(1000);
            System.out.println(playerName + " your total score is: " + (turnScore + playerscore));
            wait(1000);
            System.out.println(playerName + " your average dice cast per turn is: " + (totalDiceRolls2 / totalTurnsPlayed));
            wait(1000);
            System.out.println("Wanna roll again? 1-yes     2-no ");
            int userChoise = scan.nextInt();
            if (userChoise == 2) {
                playerWantsToRoll = false;
            }
        }
//        System.out.println(playerName + " got " + turnScore + " points.");

        return turnScore;
    }

    private static void printCurrentScore() {
        System.out.println(player1.getName() + ": " + player1.getPlayScore() +
                "   " + player2.getName() + ": " + player2.getPlayScore());
    }


    private static void SetPlayerName2() {
        System.out.println("Enter name for player two: ");
        player2 = new player(scan.nextLine(), 0, 0, 0);
        wait(1000);
    }

    private static void setPlayerName1() {
        System.out.println("Enter name for player one: ");
        wait(1000);
        player1 = new player(scan.nextLine(), 0, 0, 0);
    }

    //Nappet fra en google søgning, har ingen idé om hvad det betyder.
    public static void wait(int ms) {
        try {
            Thread.sleep(ms);
        } catch (InterruptedException ex) {
            Thread.currentThread().interrupt();
        }
    }


}