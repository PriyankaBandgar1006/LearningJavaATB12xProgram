package ex_16_Arrays;
import java.util.Scanner;
public class Lab154_Array_User_Input {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int size = s.nextInt();

        String [] Marks = new String[size];

        // any data type of we will create
        // float[] number_marks = new float[size];
        //int[] numbers_mark = new int[size];


            for (int i = 0; i <Marks.length; i++) {
                System.out.println("Enter the elements ->" + i);
                Marks[i] = s.next();
            }
            System.out.println(" ----- Print the values--------");

           for (String marks : Marks){
                System.out.println(marks);
            }
           s.close();


        }

    }

