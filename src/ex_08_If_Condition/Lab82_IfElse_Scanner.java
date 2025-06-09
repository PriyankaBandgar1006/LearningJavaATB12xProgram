package ex_08_If_Condition;
import java.util.Scanner;

public class Lab82_IfElse_Scanner {
    public static void main(String[] args) {
        System.out.println("Enter your age");
        Scanner s= new Scanner(System.in);
        int age= s.nextInt();
        if (age > 18){
            System.out.println("Allowed to Vote!");
        }else{
            System.out.println("Not allowed to Vote!");
        }

    }
    }

