package system.helpers;

import static system.helpers.DriverManager.getDriver;

public class AccessAplication {

    public static void accessAplication() {
        getDriver().get("https://www.nike.com/");
    }
}
