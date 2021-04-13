package system.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import system.pages.ValidacaoCamposObrigatoriosPage;

import static system.helpers.DriverManager.getDriver;

public class ValidarCamposObrigatoriosSteps {

    ValidacaoCamposObrigatoriosPage validacaoCamposObrigatoriosPage = new ValidacaoCamposObrigatoriosPage();

    @Given("o usuario acessa a pagina de login")
    public void oUsuarioAcessaAPaginaDeLogin() {
        validacaoCamposObrigatoriosPage.acessarPaginaLogin();
    }

    @When("o usuario clica no botao SIGN sem preencher os campos email e senha")
    public void oUsuarioClicaNoBotaoSIGNSemPreencherOsCamposEmailESenha() {
        validacaoCamposObrigatoriosPage.clicarBotaoSignIn();
    }

    @Then("o sistema deve exibir a mensagem de validacao para o email:")
    public void oSistemaDeveExibirAMensagemDeValidacaoParaOEmail(DataTable email) {
        Assertions.assertEquals(email.cell(0, 0), validacaoCamposObrigatoriosPage.verificarEmail());

    }

    @Then("e a mensagem de validacao para a senha:")
    public void eAMensagemDeValidacaoParaASenha(DataTable password) {
        Assertions.assertEquals(password.cell(0, 0), validacaoCamposObrigatoriosPage.verificarSenha());
    }
}
