package system.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.pages.SearchPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SearchSteps {

    SearchPage searchPage = new SearchPage();

    @Given("o usuario clica na lupa de pesquisa")
    public void oUsuarioClicaNaLupaDePesquisa() {
        searchPage.clicarCampoSearch();
    }

    @When("o usuario digita {string} no campo de pesquisa")
    public void oUsuarioDigitaNoCampoDePesquisa(String shoes) {
        searchPage.escreverNoCampoSearch(shoes);
    }

    @Then("o sistema deve exibir as seguintes chuteiras com seus respectivos precos:")
    public void oSistemaDeveExibirAsSeguintesChuteirasComSeusRespectivosPrecos(DataTable chuteiras) {

        assertEquals(chuteiras.cell(0, 0), searchPage.verificacaoNikePhantomGTAcademy3DMG());
        assertEquals(chuteiras.cell(0, 1), searchPage.verificacaoNikePhantomGTAcademy3DMGPreco());
        assertEquals(chuteiras.cell(1, 0), searchPage.verificacaoNikePremierIIFG());
        assertEquals(chuteiras.cell(1, 1), searchPage.verificacaoNikePremierIIFGPreco());
    }
}
