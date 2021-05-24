package system.helpers;

import static system.helpers.DriverManager.getDriver;

public class SelectWebPage {

    public static void accessNikeUSA() {
        getDriver().get("https://www.nike.com/");
    }
    public static void accessCentauroBR() {
        getDriver().get("https://www.centauro.com.br/");
    }
}
