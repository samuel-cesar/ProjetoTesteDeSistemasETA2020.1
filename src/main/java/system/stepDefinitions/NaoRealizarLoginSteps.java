package system.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DriverManager;

import static system.helpers.DriverManager.getDriver;

public class NaoRealizarLoginSteps {

    @Given("o usuario preenche o campo Email Address com {string}")
    public void oUsuarioPreencheOCampoEmailAddressCom(String email) {
        getDriver().findElement(By.name("emailAddress")).sendKeys(email);
    }

    @Given("o usuario preenche o campo Password com {string}")
    public void oUsuarioPreencheOCampoPasswordCom(String password) {
        getDriver().findElement(By.name("password")).sendKeys(password);
    }

    @When("o usuario clica no botao SIGN IN")
    public void oUsuarioClicaNoBotaoSIGNIN() {
        getDriver().findElement(By.xpath("//input[@value='SIGN IN']")).click();
    }

    @Then("o sistema deve exibir as seguintes mensagens:")
    public void oSistemaDeveExibirAsSeguintesMensagens(DataTable dataTable) {

        By error = By.xpath("//*[contains(text(),'An error occurred.')]");
        DriverManager.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(error));
        getDriver().findElement(error).click();

        System.out.println(dataTable.row(0));
        System.out.println(dataTable.row(1));
        System.out.println(dataTable.row(2));

//        By avatar = By.xpath("//a[@class='pre-acct-avatar d-sm-h d-lg-ib']//div[@class='icon-btn ripple']//*[local-name()='svg']");
//        DriverManager.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(avatar));
//        getDriver().findElement(avatar).click();
//
//        String nomeUsuario = getDriver().findElement(By.xpath("//*[contains(text(),'Samuel Aquino')]")).getText();
//        String nikeMemberSize = getDriver().findElement(By.xpath("//*[contains(text(),'Nike Member Since April 2021') and @class='text-color-secondary']")).getText();
//
//        Assertions.assertEquals("Samuel Aquino", nomeUsuario);
//        Assertions.assertEquals("Nike Member Since April 2021", nikeMemberSize);
    }
}
