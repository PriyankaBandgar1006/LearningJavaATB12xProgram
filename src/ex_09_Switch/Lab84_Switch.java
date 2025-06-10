package ex_09_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab84_Switch {
    public static void main(String[] args) {
        // You need to take a user input and ask for the integer from 0 to 7
        //And if user enters 1 to 7
        //you will tell which day it is

        //Logic building formula
        //step 1 - Use scanner class to take input from user
        // Step 2 - Figuring out the expression and the day
        // Step 3 - rough logic
        // Step 4 - Fix the logic and optimize the code
        // Step 5 - figuring out the edge cases.

        Scanner S = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int Day= S.nextInt();

        switch(Day){
            case 1:
            System.out.println("Given Day is Monday");
            break;

            case 2:
                System.out.println("Givan Day is Tuesday");
                break;

            case 3:
                System.out.println("Given day is Wed");
                break;

            case 4:
                System.out.println("Given day is Thu");
                break;

            case 5:
                System.out.println("Given day is Fri");
                break;

            case 6:
                System.out.println("Given day is Sat");
                break;

            case 7:
                System.out.println("Given day is Sunday");
                break;

            default:
                System.out.println("Only int 1 to 7 are allowed for input");
        }
    }
}
