package system.helpers;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import static system.helpers.Constants.CHROME_DRIVER_PATH;
import static system.helpers.Constants.FIREFOX_DRIVER_PATH;

public class DriverManager {

    private static WebDriver driver;
    private static WebDriverWait driverWait;

    public DriverManager() {
    }

    public static WebDriver getDriver() {
        if (driver == null) {
            System.setProperty("webdriver.chrome.driver", CHROME_DRIVER_PATH);
            driver = new ChromeDriver();
        }
        return driver;
    }

    public static WebDriverWait getDriverWait() {
        return driverWait = new WebDriverWait(driver, 20);
    }

    public static void endSession() {
        if (driver != null) {
            driver.quit();
            driver = null;

        }
    }
}
