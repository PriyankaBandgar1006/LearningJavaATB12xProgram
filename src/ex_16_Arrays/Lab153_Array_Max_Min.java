package ex_16_Arrays;

public class Lab153_Array_Max_Min {
    public static void main(String[] args) {
        int [] marks ={87,98,34,500,100,49};
        int Max=marks[0];

        for(int i =0;i<marks.length;i++)
        {
            if(Max<marks[i])
            {
                Max = marks[i];

            }

        }
        System.out.println(Max);
    }
}
