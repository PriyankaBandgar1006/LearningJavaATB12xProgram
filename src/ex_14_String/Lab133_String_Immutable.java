package ex_14_String;

public class Lab133_String_Immutable {
    public static void main(String[] args) {
        String name = "Priya";   // Stored in SCP(String Constant Pool)
        name.toUpperCase();
        System.out.println(name); // output is Aishwarya bcz strings are immutable
    }
}
