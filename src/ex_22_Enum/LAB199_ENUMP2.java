package ex_22_Enum;

public class LAB199_ENUMP2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("katalon")){
            System.out.println("I want to do something");
        }
    }
}

//Enum is nothing
enum URLS{
    google,restassured,katalon,vwo
}

