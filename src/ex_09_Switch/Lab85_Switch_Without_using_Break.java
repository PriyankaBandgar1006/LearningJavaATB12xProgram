package ex_09_Switch;

import java.util.Scanner;

public class Lab85_Switch_Without_using_Break {
    public static void main(String[] args) {
        // Switch

        // Take a user input and tell them the day based on entered number
        // 1 to 7 -> 1 -> mon, 5 -> fri
        // 8 ? - Not allowed or error

        //int day = Integer.parseInt(args[0]); - CLI option

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value from 1 to 7");

        int day = s.nextInt();

        switch(day){
            case 1:
                System.out.println("Mon");

            case 2:
                System.out.println("Tue");

            case 3:
                System.out.println("Wed");

            case 4:
                System.out.println("Thu");

            case 5 :
                System.out.println("Fri");

            case 6:
                System.out.println("Sat");

            case 7 :
                System.out.println("Sun");

            default :
                System.out.println("Not allowed");


        }
    }
}
