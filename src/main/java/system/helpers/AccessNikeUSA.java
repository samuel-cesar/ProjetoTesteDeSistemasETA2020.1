package system.helpers;

import static system.helpers.DriverManager.getDriver;

public class AccessNikeUSA {

    public static void accessNike() {
        getDriver().get("https://www.nike.com/");
    }
}
