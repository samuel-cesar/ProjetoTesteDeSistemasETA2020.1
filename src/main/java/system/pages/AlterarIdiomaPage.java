package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;

import static system.helpers.DriverManager.getDriverWait;

public class AlterarIdiomaPage {

    private DSL dsl;

    public AlterarIdiomaPage() {
        dsl = new DSL();
    }

    public void clicarNoLabelDoIdioma() throws InterruptedException {
        Thread.sleep(2000);
        By labelIdioma = By.xpath("//span[@class='country-pin-label']");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(labelIdioma));
        dsl.clicarLabelIdioma("//span[@class='country-pin-label']");
    }

    public void clicarBrasil(String country) throws InterruptedException {
        Thread.sleep(2000);
        By elementCountry = By.xpath("//p[@class='nav-bold'][contains(text(),'" + country + "')]");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(elementCountry));
        dsl.clicarPais("//p[@class='nav-bold'][contains(text(),'" + country + "')]");
    }

    public void clicarMexico(String country) throws InterruptedException {
        Thread.sleep(2000);
        By elementCountry = By.xpath("//p[contains(text(),'" + country + "')]");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(elementCountry));
        dsl.clicarPais("//p[contains(text(),'" + country + "')]");
    }

    public String verificarUrl() {
        return dsl.verificarUrl();
    }

    public String verificarSobreANike() {
        return dsl.obterTextoXPath("//h1[contains(text(),'SOBRE A NIKE')]");
    }

    public String verificarAcercaDeNike() {
        return dsl.obterTextoXPath("//a[contains(text(),'ACERCA DE NIKE')]");
    }
}
