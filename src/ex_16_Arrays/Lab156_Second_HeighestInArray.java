package ex_16_Arrays;

public class Lab156_Second_HeighestInArray {
    public static void main(String[] args) {
        int [] a={12,23,34,54,67};
        int highest = 0;
        int secondHighest=0;

        for (int num : a){
            if (num > highest){
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest =num;
            }
        }
        System.out.println(secondHighest);
}}
