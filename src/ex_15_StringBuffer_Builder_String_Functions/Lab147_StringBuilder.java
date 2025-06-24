package ex_15_StringBuffer_Builder_String_Functions;

public class Lab147_StringBuilder {
    public static void main(String[] args) {

        StringBuilder S1 = new StringBuilder("Hello");
        S1.append(" World");
        S1.reverse();

        System.out.println(S1);

    }
}
