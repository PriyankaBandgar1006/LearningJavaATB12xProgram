package ex_10_ForLoop;

public class Lab112_for_Loop_Continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i==5){
                continue; // it will skip the 5
            }
            System.out.println(i);
        }

    }
}
