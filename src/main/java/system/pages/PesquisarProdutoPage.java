package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static system.helpers.DriverManager.getDriver;
import static system.helpers.DriverManager.getDriverWait;

public class PesquisarProdutoPage {

    private DSL dsl;

    private String campoSearchId = "VisualSearchInput";
    private String nikeAirVaporMaxEvoXPath = "//span[contains(text(),'Nike Air VaporMax 2020 FK')]";

    public PesquisarProdutoPage() {
        this.dsl = new DSL();
    }

    public void clicarCampoSearch() {
        dsl.clicarNoCampoSearch(campoSearchId);
    }

    public void escreverNoCampoSearch(String shoes) {
        dsl.escreverApertarEnter(campoSearchId, shoes);
    }

    public String verificacaoNikeAirVaporMaxEvo() throws InterruptedException {
        return dsl.obterTextoXPath(nikeAirVaporMaxEvoXPath);
    }
}
