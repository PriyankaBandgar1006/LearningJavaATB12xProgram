package ex_15_StringBuffer_Builder_String_Functions;

public class InterviewQ_ReverseString_WithoutUsing_Inbuilt {
    public static void main(String[] args) {
        String N1= "Priyanka";

        for(int i = N1.length()-1;i>=0;i--){
            System.out.println(N1.charAt(i));
        }
    }
}
