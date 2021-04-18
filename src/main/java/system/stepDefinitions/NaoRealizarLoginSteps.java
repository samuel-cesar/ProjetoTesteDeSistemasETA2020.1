package system.stepDefinitions;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.pages.NaoRealizarLoginPage;

public class NaoRealizarLoginSteps {

    NaoRealizarLoginPage naoRealizarLoginPage = new NaoRealizarLoginPage();

    @Given("o usuario preenche o campo Email Address com {string}")
    public void oUsuarioPreencheOCampoEmailAddressCom(String email) {
        naoRealizarLoginPage.preencherOCampoEmail(email);
    }

    @Given("o usuario preenche o campo Password com {string}")
    public void oUsuarioPreencheOCampoPasswordCom(String password) {
        naoRealizarLoginPage.preencherOCampoPassword(password);
    }

    @When("o usuario clica no botao SIGN IN")
    public void oUsuarioClicaNoBotaoSIGNIN() {
        //getDriver().findElement(By.xpath("//input[@value='SIGN IN']")).click();

        naoRealizarLoginPage.clicarBotaoSIGNIN();

    }

    @Then("o sistema deve exibir as seguintes mensagens:")
    public void oSistemaDeveExibirAsSeguintesMensagens(DataTable msg) {
        Assertions.assertEquals(msg.cell(0, 0), naoRealizarLoginPage.msgError());
        Assertions.assertEquals(msg.cell(1, 0), naoRealizarLoginPage.msgTryAgain());
        Assertions.assertEquals(msg.cell(2, 0), naoRealizarLoginPage.msgLoginBlocked());
    }
}
