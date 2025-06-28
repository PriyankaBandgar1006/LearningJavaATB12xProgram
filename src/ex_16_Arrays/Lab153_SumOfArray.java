package ex_16_Arrays;

import java.util.Scanner;

public class Lab153_SumOfArray {
    public static void main(String[] args) {
        int [] a={23,45,67};
        int sum = 0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
       System.out.println(sum);


    }
}
