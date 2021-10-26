package dicegames;

import java.util.Scanner;

public class CrapsPlay {


            /**
             * How many rolls have been rolled.
             */
            private int rolls;

            /**
             * The scanner used for reading user input.
             */
            private Scanner scan;

            /**
             * The dice used in the game.
             */
            private dicegames.Die die1;
            private dicegames.Die die2;


            /**
             * Constructs the PlayRollDie game.
             */
            public CrapsPlay() {
                die1 = new dicegames.Die();
                die2 = new dicegames.Die();
                scan = new Scanner(System.in);

            }

            public int sumOfDice() {
                return die1.getFaceValue() + die2.getFaceValue();
            }



            /**
             * Print out a neat welcome message to the player.
             */
            private void welcomeToGame() {
                System.out.println("Velkommen til Craps");
            }

    public int firstThrowValue = 0;
    public boolean firstThrow = false;
    public boolean end = false;

                private void takeTurn() {
                die1.roll();
                die2.roll();
                System.out.println("Du slog: " + sumOfDice());

                     if (firstThrow == false) {
                        firstThrowValue = sumOfDice();
                     }
                     if (firstThrow == true && sumOfDice() == 7) {
                        System.out.println(" Du tabte");
                        end = true;
                     }
                     else if (sumOfDice() == 7 && firstThrow==false|| sumOfDice() == 11 && firstThrow==false) {
                        System.out.println(" Du vandt!");
                        end = true;
                     }
                     else if (sumOfDice() == firstThrowValue && firstThrow == true) {
                            System.out.println(" Du vandt!");
                            end = true;
                     }
                     else if (sumOfDice() == 2 || sumOfDice() == 3 || sumOfDice() == 12) {
                           System.out.println("Du tabte");
                           end = true;
                     }
                     if(firstThrow == false){
                         firstThrow = true;
                     }
                     if(end == true){
                         firstThrow = false;
                         firstThrowValue = 0;
                     }

                }


            /**
             * Finishes the game and prints out the result.
             */
            private void gameOver() { System.out.println("Tak for spillet");

                System.out.println("");
                boolean win = true;
                    firstThrow = false;
                    firstThrowValue = 0;
                    scan.close();
                }


            /**
             * Start the game loop.<br/>
             * The game is finished when the player chooses to not roll the die anymore.
             */
            public void startGame() {
                welcomeToGame();

                boolean finished = false;

                while (!finished) {
                    System.out.println("Vil du spille igen? Angiv ja eller nej: ");
                    String goOn = scan.nextLine();
                    if (goOn.equalsIgnoreCase("Nej")) {
                        finished = true;
                    } else {;
                        takeTurn();
                    }
                }
                gameOver();
            }
        }


