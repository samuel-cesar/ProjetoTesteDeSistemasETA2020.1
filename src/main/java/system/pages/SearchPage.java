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
        dsl = new DSL();
    }

    public void clicarCampoSearch() {
        By lupa = By.id("VisualSearchInput");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(lupa));
        dsl.clicarNoCampoSearch("VisualSearchInput");
    }

    public void escreverNoCampoSearch(String shoes) {
        dsl.escrever("VisualSearchInput", shoes);
    }

    public String verificacaoNikePhantomGTAcademy3DMG() {

        By nikePhantom3dMG = By.xpath("//*[@id='VisualSearchProduct-0']/figcaption/h4");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(nikePhantom3dMG));
        return getDriver().findElement(By.xpath("//*[@id='VisualSearchProduct-0']/figcaption/h4")).getText();
    }

    public String verificacaoNikePhantomGTAcademy3DMGPreco() {
        return getDriver().findElement(By.xpath("//*[@id='VisualSearchProduct-0']/figcaption/p[2]")).getText();
    }

    public String verificacaoNikePremierIIFG() {
        By nikeIIFG = By.xpath("//h4[contains(text(),'Nike Premier II FG')]");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(nikeIIFG));
        return getDriver().findElement(By.xpath("//h4[contains(text(),'Nike Premier II FG')]")).getText();
    }

    public String verificacaoNikePremierIIFGPreco() {
        return getDriver().findElement(By.xpath("//p[contains(text(),'$110')]")).getText();
    }
}
