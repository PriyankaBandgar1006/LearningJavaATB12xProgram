package ex_01_Java_Basics;

public class Lab11_Multiple_Main_Methods {
    public static void main(String[] args) {
        System.out.println("Hi");
    }

    public static void main(int args) {
        System.out.println();

        //This main method will not be recognised by Java
        System.out.println("Test"); //This will not get printed
    }

    public static void main(String args) {
        //This main method will not be recognised by Java

    }
}
