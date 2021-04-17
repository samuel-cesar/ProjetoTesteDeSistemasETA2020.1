package system.helpers;

import static system.helpers.DriverManager.getDriver;

public class AccessNike {

    public static void accessNikeUSA() {
        getDriver().get("https://www.nike.com/");
    }
}
