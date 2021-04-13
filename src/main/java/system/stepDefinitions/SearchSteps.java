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

    @When("o usuario digita {string} no campo de pesquisa e aperta a tecla enter")
    public void oUsuarioDigitaNoCampoDePesquisaEApertaATeclaEnter(String shoes) {
        searchPage.escreverNoCampoSearch(shoes);
    }

    @Then("o sistema deve exibir que o resultado da consulta foi:")
    public void oSistemaDeveExibirQueOResultadoDaConsultaFoi(DataTable result) {
        assertEquals(result.cell(0, 0), searchPage.verificacaoNikePhantomGTAcademy3DMG());
    }
}
