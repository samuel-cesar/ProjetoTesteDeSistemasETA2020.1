package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import system.helpers.AccessAplication;
import system.helpers.DriverManager;

import static system.helpers.AccessAplication.accessAplication;
import static system.helpers.DriverManager.getDriver;

public class Hooks {
    @Before
    public void beforeScenario() {
        getDriver();
        accessAplication();
        getDriver().manage().window().maximize();
    }

    @After
    public void afterScenario() {
        //DriverManager.killDriver();
    }

}
