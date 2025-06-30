package ex_22_Enum;

public class LAb201_ENUM {
    public static void main(String[] args) {
        System.out.println(Locators.page_button.getLocator());
        System.out.println(ApiURLS.katalon.getUrl());
    }
}

enum Locators{
    page_button("#btn"),
    page_input("#input");

    private String locator;

    Locators(String locator) {
        this.locator = locator;
    }

    String getLocator() {
        return this.locator;
    }

}
