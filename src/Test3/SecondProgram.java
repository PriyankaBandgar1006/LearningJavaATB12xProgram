package Test3;

public class SecondProgram {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "hello";
        String s3 = "Hello";

        if (s1.equals(s2) && s2.equals(s3)) {
            System.out.println("true");
        } else {
            System.out.println("False");
        }
    }
}
