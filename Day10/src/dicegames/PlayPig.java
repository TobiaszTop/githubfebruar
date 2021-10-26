package dicegames;

import dicegames.Die;

import java.util.Scanner;

//import java.lang.Thread;

public class PlayPig {


    private Scanner scan;
    private dicegames.Die die;
    private int scoreGoal;
    private boolean versusBot;
    private int totalScore1 = 0;
    private int totalScore2 = 0;
    private boolean finished = false;
    private boolean playerTurn = true;
    private int temporaryScore = 0;

    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_BLUE = "\u001B[34m";

    public PlayPig(int scoreGoal, boolean versusBot) {
        this.scoreGoal = scoreGoal;
        this.versusBot = versusBot;
        scan = new Scanner(System.in);
        die = new Die();
    }

    public PlayPig() {
        this.scoreGoal = 100;
        this.versusBot = false;
        scan = new Scanner(System.in);
        die = new Die();
    }

    private void turnOver() {
        if(playerTurn){
            totalScore1 += temporaryScore;
            System.out.println(ANSI_BLUE+"PLAYER 1 har " + totalScore1 + " points!"+ANSI_RESET);
            System.out.println("----------------------");
            System.out.println();
            System.out.println(ANSI_RED+"PLAYER 2"+ANSI_RESET);
        }
        else if(!playerTurn){
            totalScore2 += temporaryScore;
            System.out.println(ANSI_RED+"PLAYER 2 har " + totalScore2 + " points!"+ANSI_RESET);
            System.out.println("----------------------");
            System.out.println();
            System.out.println(ANSI_BLUE+"PLAYER 1"+ANSI_RESET);
        }
        temporaryScore = 0;
        playerTurn=!playerTurn;
    }

    public void takeTurn() {
        die.roll();
        System.out.println("Du kastede " + die.getFaceValue());
        temporaryScore += die.getFaceValue();
        //System.out.println("Temporary: " + temporaryScore);
        if(die.getFaceValue()  == 1){
            System.out.println("Du mistede din points!");
            temporaryScore = 0;
            turnOver();
        }else if(totalScore1+temporaryScore >= scoreGoal && playerTurn || totalScore2+temporaryScore >= scoreGoal && !playerTurn){
            System.out.println("Du har vundet!");
            finished = true;
        }
    }

    private void welcome() {
        System.out.println();
        System.out.println("Velkommen til spillet Pig (100)");
        System.out.println();
        System.out.println(ANSI_BLUE+"PLAYER 1"+ANSI_RESET);
    }

    public void startGame() {
        welcome();

        while (!finished) {
            System.out.println("Vil du kaste terning?");
            System.out.println("Angiv Ja eller Nej:");

                if (!playerTurn && versusBot){
                    try {Thread.sleep(500);} catch(InterruptedException e) {}
                    if(temporaryScore<20 || temporaryScore+totalScore2-19 < totalScore1){
                        System.out.println(ANSI_GREEN+"Ja"+ANSI_RESET);
                        try {Thread.sleep(500);} catch(InterruptedException e) {}
                        takeTurn();
                    }else{
                        System.out.println(ANSI_GREEN+"Nej"+ANSI_RESET);
                        try {Thread.sleep(500);} catch(InterruptedException e) {}
                        turnOver();
                    }
                }
                else{
                    String goOn = scan.nextLine();
                    if(goOn.equalsIgnoreCase("Ja")){
                        takeTurn();
                    }
                    else if(goOn.equalsIgnoreCase("Nej")) {
                        turnOver();
                    }
                    else{
                        System.out.println("Forkert input!");
                    }
                }
            }
        scan.close();
        }
    }



