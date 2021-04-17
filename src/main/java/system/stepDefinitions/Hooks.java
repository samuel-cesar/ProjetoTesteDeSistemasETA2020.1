package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.junit.jupiter.api.AfterAll;
import system.helpers.DriverManager;

import static system.helpers.AccessNike.accessNikeUSA;
import static system.helpers.DriverManager.getDriver;

public class Hooks {
    @Before
    public void beforeScenario() {
        getDriver();
        accessNikeUSA();
        getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {
        DriverManager.endSession();
    }
}
