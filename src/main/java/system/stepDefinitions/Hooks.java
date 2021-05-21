package system.stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.File;
import java.io.IOException;

import static system.helpers.SelectWebPage.accessNikeUSA;
import static system.helpers.DriverManager.*;
import static system.helpers.DriverManager.getDriver;

public class Hooks {

    private Scenario nomeDoScenario;


    @Before
    public void beforeScenario(Scenario scenario) {
        getDriver();
        accessNikeUSA();
        getDriver().manage().window().maximize();
        nomeDoScenario = scenario;

    }

    @After
    public void afterScenario() throws IOException {

        TakesScreenshot screenshot = (TakesScreenshot) getDriver();
        File source = screenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(source, new File("C:\\DESENVOLVIMENTO\\JAVA\\INTELLIJ_IDEA\\ProjetoTesteDeSistemasETA2020.1\\src\\test\\screenshots\\"
                + File.separator + nomeDoScenario.getName() + ".jpg"));

        endSession();
    }
}
