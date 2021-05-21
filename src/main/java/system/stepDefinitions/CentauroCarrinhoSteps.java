package system.stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static system.helpers.DriverManager.*;

public class CentauroCarrinhoSteps {

    @Given("acessar a pagina da centauro {string}")
    public void acessar_a_pagina_da_centauro(String site) {
        getDriver();
        getDriver().get(site);
        getDriver().manage().window().maximize();
        assertEquals("Centauro Loja de Esportes - Nike, Adidas, Mizuno, Asics, Oakley e mais! - Seu esporte, nossa paixão", getDriver().getTitle(), "Não encontrou o título");
        assertEquals("https://www.centauro.com.br/", getDriver().getCurrentUrl(), "Não encontrou a url");
    }

    @And("preencher o campo de busca com {string}")
    public void preencher_o_campo_de_busca_com(String produto) throws InterruptedException {
        Thread.sleep(5000);
        WebElement searchInput = getDriver().findElement(By.cssSelector("#searchInput"));
        searchInput.sendKeys(produto);
    }

    @Then("o usuario aperta a tecla Enter")
    public void o_usuario_aperta_a_tecla_enter() throws InterruptedException {
        WebElement searchInput = getDriver().findElement(By.cssSelector("#searchInput"));
        searchInput.sendKeys(Keys.ENTER);
        Thread.sleep(5000);
        String nomeDoProduto = getDriver().findElement(By.xpath("//h1[contains(text(),'Agasalho Puma Techstripe Tricot Suit OP - Masculin')]")).getText();
        assertEquals("Agasalho Puma Techstripe Tricot Suit OP - Masculino", nomeDoProduto, "O nome do produto não foi encontrado");
    }

    @Then("clica no produto agasalho")
    public void clica_no_produto_agasalho() throws InterruptedException {
        Thread.sleep(5000);
        WebElement produto = getDriver().findElement(By.xpath("//a[contains(text(),'Agasalho Puma Techstripe Tricot Suit OP - Masculin')]"));
        produto.click();
    }

    @When("o usuario seleciona o tamanho do produto")
    public void o_usuario_seleciona_o_tamanho_do_produto() throws InterruptedException {
        Thread.sleep(5000);
        WebElement tamanhoDoProduto = getDriver().findElement(By.xpath("//div[contains(text(),'P')]"));
        tamanhoDoProduto.click();
        String tamanhoDoProdutoPSelecinado = getDriver().findElement(By.xpath("//span[contains(text(),': P')]")).getText();
        assertEquals(": P", tamanhoDoProdutoPSelecinado, "Tamanho do produto P não foi selecionado");
    }

    @And("clica no botao comprar")
    public void clica_no_botao_comprar() throws InterruptedException {
        Thread.sleep(5000);
        WebElement btnComprar = getDriver().findElement(By.xpath("//div[contains(text(),'Comprar') and @class='_1nnzvnp']"));
        btnComprar.click();
    }

    @Then("o sistema exibe o valor total da compra {string}")
    public void o_sistema_exibe_o_valor_total_da_compra(String valorTotalEsperado) throws InterruptedException {
        Thread.sleep(5000);
        String lblTotalEsperado = getDriver().findElement(By.xpath("//div[contains(text(),'Total')]")).getText();
        String valorTotalAtual = getDriver().findElement(By.xpath("//div[contains(text(),'R$ 289,90') and @class='_1hnjbuk']")).getText();
        assertEquals("Total", lblTotalEsperado);
        assertEquals(valorTotalEsperado, valorTotalAtual);
    }

    @When("o usuario clica no botao {string} para aumentar a quantidade")
    public void o_usuario_clica_no_botao_para_aumentar_a_quantidade(String string) throws InterruptedException {
        Thread.sleep(5000);
        WebElement botaoMais = getDriver().findElement(By.xpath("//button[contains(text(),'+')]"));
        botaoMais.click();

    }

    @Then("o sistema exibe a quantidade do produto igual a {string}")
    public void o_sistema_exibe_a_quantidade_do_produto_igual_a(String quantidade) throws InterruptedException {
        Thread.sleep(5000);
        String qtdDeProdutos = getDriver().findElement(By.xpath("//input[@class=\"_s09fqyu\" and @value=\"2\"]")).getAttribute("value");;
        assertEquals(quantidade, qtdDeProdutos);
    }

    @Then("o valor total dos produtos deve ser {string}")
    public void o_valor_total_dos_produtos_deve_ser(String valorTotalDoProduto) throws InterruptedException {
        Thread.sleep(5000);
        String valorTotalAtual = getDriver().findElement(By.xpath("//div[contains(text(),'R$ 579,80') and @class='_1hnjbuk']")).getText();
        assertEquals(valorTotalDoProduto, valorTotalAtual);
    }
}
