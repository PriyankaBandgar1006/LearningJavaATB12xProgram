package ex_01_Java_Basics;

public class Lab12_VeryLongClass_Or_MethodName {
    public static void main(String[] args) {
        System.out.println("Main method calling another method in same class");
        Lab12_VeryLongClass_Or_MethodName.This_Is_Very_Long_Method_Name_Blah_Blah();
    }

    static void This_Is_Very_Long_Method_Name_Blah_Blah() {
        System.out.println("Inside This_Is_Very_Long_Method_Name_Blah_Blah Method");
    }
}
