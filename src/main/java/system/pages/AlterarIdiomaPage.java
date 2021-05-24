package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;

import static system.helpers.DriverManager.getDriverWait;

public class AlterarIdiomaPage {

    private DSL dsl;

    private String labelIdiomaXPath = "//span[@class='country-pin-label']";
    private String obterTextoXPathSobreANike = "//h1[contains(text(),'SOBRE A NIKE')]";
    private String obterTextoXpathAcercaDeNike = "//a[contains(text(),'ACERCA DE NIKE')]";
    private String countryBrasilXPath = "//p[@class='nav-bold'][contains(text(),'Brasil')]";
    private String countryMexicoXPath = "//p[@class='nav-bold'][contains(text(),'México')]";

    public AlterarIdiomaPage() {
        dsl = new DSL();
    }

    public void clicarNoLabelDoIdioma(){
        dsl.clicarLabelIdioma(labelIdiomaXPath);
    }

    public void clicarBrasil(){
        dsl.clicarPais(countryBrasilXPath);
    }

    public void clicarMexico(){
        dsl.clicarPais(countryMexicoXPath);
    }

    public String verificarUrl() {
        return dsl.verificarUrl();
    }

    public String verificarSobreANike() {
        return dsl.obterTextoXPath(obterTextoXPathSobreANike);
    }

    public String verificarAcercaDeNike() {
        return dsl.obterTextoXPath(obterTextoXpathAcercaDeNike);
    }
}
