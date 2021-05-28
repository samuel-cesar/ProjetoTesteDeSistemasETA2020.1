package system.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.pages.PesquisarProdutoPage;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PesquisarProdutoSteps {

    PesquisarProdutoPage pesquisarProdutoPage = new PesquisarProdutoPage();

    @Given("o usuario clica na lupa de pesquisa")
    public void oUsuarioClicaNaLupaDePesquisa() {
        pesquisarProdutoPage.clicarCampoSearch();
    }

    @When("o usuario digita {string} no campo de pesquisa e aperta a tecla enter")
    public void oUsuarioDigitaNoCampoDePesquisaEApertaATeclaEnter(String shoes) {
        pesquisarProdutoPage.escreverNoCampoSearch(shoes);
    }

    @Then("o sistema deve exibir que o resultado da consulta foi:")
    public void oSistemaDeveExibirQueOResultadoDaConsultaFoi(DataTable result) throws InterruptedException {
        assertEquals(result.cell(0, 0), pesquisarProdutoPage.verificacaoNikeAirVaporMaxEvo());
    }
}
