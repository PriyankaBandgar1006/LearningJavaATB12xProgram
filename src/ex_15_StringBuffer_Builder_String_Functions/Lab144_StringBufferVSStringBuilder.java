package ex_15_StringBuffer_Builder_String_Functions;

public class Lab144_StringBufferVSStringBuilder {
    public static void main(String[] args) {
        // In automation, we use 90% normal string
        String s0 = "Priyanka";
        String s1 = new String("Priyanka");

        // less than < 10% used
        StringBuffer stringBuffer = new StringBuffer("Priya");
        StringBuilder stringBuilder = new StringBuilder("Priya");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);

        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
