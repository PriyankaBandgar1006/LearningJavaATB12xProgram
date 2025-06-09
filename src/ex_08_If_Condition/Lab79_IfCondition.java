package ex_08_If_Condition;

public class Lab79_IfCondition {
    public static void main(String[] args) {
        //int age=25;
        int age = Integer.parseInt(args[0]);
        if (age > 18){
            System.out.println("You can vote!");
        }
        else {
            System.out.println("You can't vote!");
        }
    }
}
