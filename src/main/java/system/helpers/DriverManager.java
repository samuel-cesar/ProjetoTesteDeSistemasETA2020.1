package system.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DriverManager {

    private static WebDriver driver;

    public DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getDriverWait() {
        WebDriverWait driverWait;
        return driverWait = new WebDriverWait(driver, 20);
    }

    public static void endSession() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }
}
