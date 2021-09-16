package Opgave1;

import java.util.Scanner;

public class E5_1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("indtast en integer");
        int answer = scan.nextInt();
        if (answer<0){
            System.out.println(answer + " is negative");
        }
        else if (answer==0){
            System.out.println(answer + " is zero");
        }
        else if (answer>0){
            System.out.println(answer + " is positive");
        }

        scan.close();
    }

}
