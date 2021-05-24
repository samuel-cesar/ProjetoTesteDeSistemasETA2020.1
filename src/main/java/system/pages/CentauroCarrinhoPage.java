package system.pages;

import system.helpers.DSL;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CentauroCarrinhoPage {

    private DSL dsl;

    private String searchInputCss = "#searchInput";
    private String agasalhoXpath = "//a[contains(text(),'Agasalho Puma Techstripe Tricot Suit OP - Masculin')]";
    private String tamanhoDoProdutoPXPath = "//div[contains(text(),'P')]";
    private String obterTextoTamanhoProdutoXPath = "//span[contains(text(),': P')]";
    private String clicarBotaoComprarXPath = "//div[contains(text(),'Comprar') and @class='_1nnzvnp']";
    private String obterValorDaCompraXPath = "//div[contains(text(),'R$ 289,90') and @class='_1hnjbuk']";
    private String clicarBotaoMaiQuantidadeXPath = "//button[contains(text(),'+')]";
    private String obterValueQuantidadeDoisXPath = "//input[@class='_s09fqyu' and @value='2']";
    private String obterValorTotalDoProduto = "//div[contains(text(),'R$ 579,80') and @class='_1hnjbuk']";

    public CentauroCarrinhoPage() {
        this.dsl = new DSL();
    }

    public void preencherOCampoDeBusca(String produto) {
        dsl.escreverCss(searchInputCss, produto);
    }

    public void apertarATeclaEnter() {
        dsl.apertarATeclaEnter(searchInputCss);
    }

    public void clicarNoProdutoAgasalho() {
        dsl.clicarProdutoAgasalho(agasalhoXpath);
    }

    public void selecionarTamanhoDoProduto() {
        dsl.selecionarTamanhoDoProdutoP(tamanhoDoProdutoPXPath);
    }

    public String obterTextoTamanhoDoProduto() {
        return dsl.obterTextoXPath(obterTextoTamanhoProdutoXPath);
    }

    public void clicarBotaoComprar() {
        dsl.clicarBotaoComprarXpath(clicarBotaoComprarXPath);
    }

    public String obterValorDaCompra() {
        return dsl.obterTextoXPath(obterValorDaCompraXPath);
    }

    public void clicarBotaoMaisQuantidade() {
        dsl.clicarBotaoMais(clicarBotaoMaiQuantidadeXPath);
    }

    public String obterValueQuantidadeDois() {
        return dsl.obterValorCampoXPath(obterValueQuantidadeDoisXPath);
    }

    public String obterValorTotalDoProduto() {
        return dsl.obterTextoXPath(obterValorTotalDoProduto);
    }
}
