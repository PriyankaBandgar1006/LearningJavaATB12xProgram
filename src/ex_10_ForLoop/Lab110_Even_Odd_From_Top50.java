package ex_10_ForLoop;

public class Lab110_Even_Odd_From_Top50 {
    public static void main(String[] args) {
        //int i=50; for(i=1;i<=50;i++)
        for(int i=1;i<=50;i++)
        {
            if(i%2==0){
                System.out.println("Even number:" + i);
            }
        }
    }
}
