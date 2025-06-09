package ex_06_Ternary_Operator;

public class Lab63_TO {
    public static void main(String[] args) {
        int number = -5;
       String result = number > 0 ? "positive" : "negative";
      //  int result = number > 0 ? "positive" : "negative"; (If you are using int for result then we have to provide int @ 1: 2)
        System.out.println(result);
    }
}
