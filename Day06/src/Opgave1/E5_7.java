package Opgave1;

import java.util.Scanner;

public class E5_7 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("indtast tre integer");
        int answer1 = scan.nextInt();
        int answer2 = scan.nextInt();
        int answer3 = scan.nextInt();
        if (answer1<answer2){
            System.out.println(answer1 +" "+ answer2 +" "+ answer3 +" er stigerne");
        }else if (answer1>answer2 && answer2>answer3){
            System.out.println(answer1 +" "+ answer2 +" "+ answer3 +" er faldene");
        }else{
            System.out.println(answer1 +" "+ answer2 +" "+ answer3 +" er ikke i rækkefølge");
        }

        scan.close();
    }

}
