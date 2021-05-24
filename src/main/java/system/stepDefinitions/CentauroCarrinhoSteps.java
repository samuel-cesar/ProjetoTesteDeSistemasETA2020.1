package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import system.pages.CentauroCarrinhoPage;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static system.helpers.DriverManager.*;

public class CentauroCarrinhoSteps {

    CentauroCarrinhoPage centauroCarrinhoPage = new CentauroCarrinhoPage();

    @Given("o usuario preenche o campo de busca com {string}")
    public void o_usuario_preenche_o_campo_de_busca_com(String produto){
        centauroCarrinhoPage.preencherOCampoDeBusca(produto);
    }

    @Then("o usuario aperta a tecla Enter")
    public void o_usuario_aperta_a_tecla_enter(){
        centauroCarrinhoPage.apertarATeclaEnter();
    }

    @Then("clica no produto agasalho")
    public void clica_no_produto_agasalho(){
        centauroCarrinhoPage.clicarNoProdutoAgasalho();
    }

    @When("o usuario seleciona o tamanho do produto")
    public void o_usuario_seleciona_o_tamanho_do_produto(){
        centauroCarrinhoPage.selecionarTamanhoDoProduto();
        assertEquals(": P", centauroCarrinhoPage.obterTextoTamanhoDoProduto(), "Tamanho do produto P não foi selecionado");
    }

    @And("clica no botao comprar")
    public void clica_no_botao_comprar(){
        centauroCarrinhoPage.clicarBotaoComprar();
    }

    @Then("o sistema exibe o valor total da compra {string}")
    public void o_sistema_exibe_o_valor_total_da_compra(String valorTotalEsperado){
        assertEquals(valorTotalEsperado, centauroCarrinhoPage.obterValorDaCompra());
    }

    @When("o usuario clica no botao {string} para aumentar a quantidade")
    public void o_usuario_clica_no_botao_para_aumentar_a_quantidade(String string){
        centauroCarrinhoPage.clicarBotaoMaisQuantidade();

    }

    @Then("o sistema exibe a quantidade do produto igual a {string}")
    public void o_sistema_exibe_a_quantidade_do_produto_igual_a(String quantidade){
        assertEquals(quantidade,  centauroCarrinhoPage.obterValueQuantidadeDois());
    }

    @Then("o valor total dos produtos deve ser {string}")
    public void o_valor_total_dos_produtos_deve_ser(String valorTotalDoProduto){
        assertEquals(valorTotalDoProduto, centauroCarrinhoPage.obterValorTotalDoProduto());
    }
}
