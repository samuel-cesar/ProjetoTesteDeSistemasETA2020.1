package system.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.pages.EnviarFeedbackPage;

public class EnviarFeedbackSteps {

    EnviarFeedbackPage enviarFeedbackPage = new EnviarFeedbackPage();

    @Given("o usuario clica no label SEND US FEEDBACK")
    public void o_usuario_clica_no_label_send_us_feedback() {
        enviarFeedbackPage.clicarLabelSendUSFeedback();
    }

    @Given("seleciona a opcao {string}")
    public void seleciona_a_opcao(String someThingElse) {
        enviarFeedbackPage.selecionarSomethingElse(someThingElse);
    }

    @When("o usuario escreve no campo de texto {string}")
    public void o_usuario_escreve_no_campo_de_texto(String nikeIsTheBest) {
        enviarFeedbackPage.escreverNikeIsTheBest(nikeIsTheBest);
    }

    @When("o usuario clica no botao SUBMIT")
    public void o_usuario_clica_no_botao_submit() {
        enviarFeedbackPage.clicarSubmit();
    }

    @Then("o sistema exibe a mensagem {string}")
    public void o_sistema_exibe_a_mensagem(String thankyou) {
        Assertions.assertEquals(thankyou, enviarFeedbackPage.verificacaoThankyou());
    }
}
