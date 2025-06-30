package ex_16_Arrays;
import java.util.Scanner;
public class Lab163_2D_RightAngleTriangle {
    public static void main(String[] args) {

        /* Right angle trangle
        *
        **
        ***
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the num :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j <=i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
