package system.helpers;

import org.openqa.selenium.By;

import static system.helpers.DriverManager.*;

public class DSL {

    /********* TextField e TextArea ************/

    public void escrever(By by, String texto) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escrever(String id_campo, String texto) {
        escrever(By.id(id_campo), texto);
    }

    public String obterValorCampo(String id_campo) {
        return getDriver().findElement(By.id(id_campo)).getAttribute("value");
    }

    /********* Radio e Check ************/

    public void clicarRadio(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public boolean isRadioMarcado(String id) {
        return getDriver().findElement(By.id(id)).isSelected();
    }

    public void clicarCheck(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    public boolean isCheckMarcado(String id) {
        return getDriver().findElement(By.id(id)).isSelected();
    }

    /********* Textos ************/

    public String obterTexto(By by) {
        return getDriver().findElement(by).getText();
    }

    public String obterTexto(String id) {
        return obterTexto(By.id(id));
    }

    public String obterTextoXPath(String xpath) {
        return obterTexto(By.xpath(xpath));
    }

    public String obterTextoCSS(String css) {
        return obterTexto(By.cssSelector(css));
    }

    public boolean getTextIsDisplayed(String id) {
        return getDriver().findElement(By.id(id)).isDisplayed();
    }

    /********* Campo Search ************/

    public void clicarNoCampoSearch(String id) {
        getDriver().findElement(By.id(id)).click();
    }
}
