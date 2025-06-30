package ex_22_Enum;

public enum ApiURLS {
    katalon("https://katalon.com"),
    google("https://google.com");

    private String url;

    ApiURLS(String url){
        this.url = url;
    }

    String getUrl(){
        return this.url;
    }
}
