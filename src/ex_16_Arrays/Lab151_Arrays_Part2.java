package ex_16_Arrays;

import java.sql.SQLOutput;

public class Lab151_Arrays_Part2 {
    public static void main(String[] args) {
        String [] name = {"Priya","Aish","Reva"};
        System.out.println(name.length);
        System.out.println(name[0]);
        System.out.println(name[1]);
        System.out.println(name[2]);

        System.out.println( " ");
        String [] Family_Mem = new String[5];
        Family_Mem[0]="Mom";
        Family_Mem[1]="Dad";
        Family_Mem[2]="Brother";
        Family_Mem[3]="Sister";

        System.out.println(Family_Mem[0]);

        Boolean [] b = new Boolean[2];

        b[0]=true;
        b[1]=false;



    }
}
