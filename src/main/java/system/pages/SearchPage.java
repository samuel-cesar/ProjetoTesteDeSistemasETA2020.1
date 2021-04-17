package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static system.helpers.DriverManager.getDriver;
import static system.helpers.DriverManager.getDriverWait;

public class SearchPage {

    private DSL dsl;

    public SearchPage() {
        this.dsl = new DSL();
    }

    public void clicarCampoSearch() {
        By lupa = By.id("VisualSearchInput");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(lupa));
        dsl.clicarNoCampoSearch("VisualSearchInput");
    }

    public void escreverNoCampoSearch(String shoes) {
        dsl.escreverApertarEnter("VisualSearchInput", shoes);
    }

    public String verificacaoNikePhantomGTAcademy3DMG() throws InterruptedException {
        Thread.sleep(3000);
        By nikePhantom3DMG = By.xpath("//span[contains(text(),'Nike Phantom GT Academy 3D MG')]");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(nikePhantom3DMG));
        return dsl.obterTexto(nikePhantom3DMG);
    }
}
