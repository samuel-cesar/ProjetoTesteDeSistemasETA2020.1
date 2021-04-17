package system.helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

import static system.helpers.DriverManager.*;

public class DSL {

    /********* Acessar Página - Get ************/

    public void acessarPagina(String site) {
        getDriver().get(site);
    }

    /********* TextField e TextArea ************/

    public void escrever(By by, String texto) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto);
    }

    public void escreverEApertarEnter(By by, String texto) {
        getDriver().findElement(by).clear();
        getDriver().findElement(by).sendKeys(texto + Keys.ENTER);
    }

    public void escreverId(String id_campo, String texto) {
        escrever(By.id(id_campo), texto);
    }

    public void escreverName(String name_campo, String texto) {
        escrever(By.name(name_campo), texto);
    }

    public void escreverXpath(String xpath_campo, String texto) {
        escrever(By.xpath(xpath_campo), texto);
    }

    public void escreverApertarEnter(String id_campo, String texto) {
        escreverEApertarEnter(By.id(id_campo), texto);
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

    /********* Combo ************/

    public void selecionarComboId(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public void selecionarComboXpath(String xpath, String valor) {
        WebElement element = getDriver().findElement(By.xpath(xpath));
        Select combo = new Select(element);
        combo.selectByVisibleText(valor);
    }

    public void deselecionarCombo(String id, String valor) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        combo.deselectByVisibleText(valor);
    }

    public String obterValorCombo(String id) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        return combo.getFirstSelectedOption().getText();
    }

    public List<String> obterValoresCombo(String id) {
        WebElement element = getDriver().findElement(By.id("elementosForm:esportes"));
        Select combo = new Select(element);
        List<WebElement> allSelectedOptions = combo.getAllSelectedOptions();
        List<String> valores = new ArrayList<String>();
        for (WebElement opcao : allSelectedOptions) {
            valores.add(opcao.getText());
        }
        return valores;
    }

    public int obterQuantidadeOpcoesCombo(String id) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        return options.size();
    }

    public boolean verificarOpcaoCombo(String id, String opcao) {
        WebElement element = getDriver().findElement(By.id(id));
        Select combo = new Select(element);
        List<WebElement> options = combo.getOptions();
        for (WebElement option : options) {
            if (option.getText().equals(opcao)) {
                return true;
            }
        }
        return false;
    }

    /********* Campo Search ************/

    public void clicarNoCampoSearch(String id) {
        getDriver().findElement(By.id(id)).click();
    }

    /********* Send US Feedback ************/

    public void clicarSendUSFeedBack(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();
    }

    /********* Submit ************/
    public void clicarSubmitXpath(String xpath) {
        getDriver().findElement(By.xpath(xpath)).click();
    }

    /********* SignIN ************/
    public void clicarBotaoSignIn(String signIn) {
        getDriver().findElement(By.xpath(signIn)).click();
    }

    public void clicarLabelIdioma(String labelIdioma) {
        getDriver().findElement(By.xpath(labelIdioma)).click();
    }

    public void clicarPais(String elementCountry) {
        getDriver().findElement(By.xpath(elementCountry)).click();
    }

    public String verificarUrl() {
        return getDriver().getCurrentUrl();
    }
}
