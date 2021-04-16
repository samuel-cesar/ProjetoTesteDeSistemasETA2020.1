package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import static system.helpers.AccessNikeUSA.accessNike;
import static system.helpers.DriverManager.getDriver;

public class Hooks {
    @Before
    public void beforeScenario() {
        getDriver();
        accessNike();
        getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {
        //DriverManager.killDriver();
    }

}
