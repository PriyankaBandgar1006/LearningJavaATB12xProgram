package ex_15_StringBuffer_Builder_String_Functions;

public class Lab145_SB {
    public static void main(String[] args) {
        //only 1 string is created this is an advantage
        StringBuffer SB = new StringBuffer("Priya");

        SB.append(" Bandgar");
        System.out.println(SB);

        // here 2 strings are created
        String s1 = "Priya";
        s1 = s1+" Bandgar";
        System.out.println(s1);

    }
}
