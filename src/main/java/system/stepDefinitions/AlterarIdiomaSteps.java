package system.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static system.helpers.DriverManager.getDriver;
import static system.helpers.DriverManager.getDriverWait;

public class AlterarIdiomaSteps {

    @Given("o usuario clica no label para selecionar a linguagem")
    public void o_usuario_clica_no_label_para_selecionar_a_linguagem() {
        getDriver().findElement(By.xpath("//span[@class='country-pin-label']")).click();
    }

    @When("o usuario clica no pais {string}")
    public void o_usuario_clica_no_pais(String country) {

        if (country.equals("Brasil")) {
            By elementCountry = By.xpath("//p[@class='nav-bold'][contains(text(),'" + country + "')]");
            getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(elementCountry));
            getDriver().findElement(elementCountry).click();
        }

        if (country.equals("México")) {
            By elementCountry = By.xpath("//p[contains(text(),'" + country + "')]");
            getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(elementCountry));
            getDriver().findElement(elementCountry).click();
        }
    }

    @Then("o sistema deve exibir o endereco {string}")
    public void o_sistema_deve_exibir_o_endereco(String string) throws InterruptedException {
        Thread.sleep(2000);
        Assertions.assertEquals(getDriver().getCurrentUrl(), string);
    }

    @Then("o label sobre da ligua escolhida {string}")
    public void o_label_sobre_da_ligua_escolhida(String about) {

        if (about.equals("SOBRE A NIKE")) {
            Assertions.assertEquals(getDriver().findElement(By.xpath("//h1[contains(text(),'SOBRE A NIKE')]")).getText(), about);
        }

        if (about.equals("ACERCA DE NIKE")) {
            Assertions.assertEquals(getDriver().findElement(By.xpath("//a[contains(text(),'ACERCA DE NIKE')]")).getText(), about);
        }


    }
}
