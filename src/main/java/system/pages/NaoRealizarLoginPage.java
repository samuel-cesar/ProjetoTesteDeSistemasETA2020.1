package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;
import system.helpers.DriverManager;

import static system.helpers.DriverManager.getDriver;

public class NaoRealizarLoginPage {

    private DSL dsl;

    public NaoRealizarLoginPage() {
        this.dsl = new DSL();
    }

    public void preencherOCampoEmail(String email) {
        dsl.escreverName("emailAddress", email);
    }

    public void preencherOCampoPassword(String password) {
        dsl.escreverName("password", password);
    }

    public void clicarBotaoSIGNIN() {
        dsl.clicarBotaoSignIn("//input[@value='SIGN IN']");
    }

    public String msgError() {
        By errorOccurred = By.xpath("//*[contains(text(),'An error occurred.')]");
        DriverManager.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(errorOccurred));
        getDriver().findElement(errorOccurred).click();
        return dsl.obterTextoXPath("//*[contains(text(),'An error occurred.')]");
    }

    public String msgTryAgain() {
        By msgTryAgain = By.xpath("//*[contains(text(),'We are unable to connect to our servers right now. Please try again later.')] ");
        DriverManager.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(msgTryAgain));
        return dsl.obterTextoXPath("//*[contains(text(),'We are unable to connect to our servers right now. Please try again later.')] ");

    }

    public String msgLoginBlocked() {
        By msgLoginBlocked = By.xpath("//*[contains(text(),'GENERIC \"0 - POST request to https://unite.nike.com/login blocked\"')] ");
        DriverManager.getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(msgLoginBlocked));
        return dsl.obterTextoXPath("//*[contains(text(),'GENERIC \"0 - POST request to https://unite.nike.com/login blocked\"')] ");
    }
}
