package system.stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import system.pages.AlterarIdiomaPage;

public class AlterarIdiomaSteps {

    AlterarIdiomaPage alterarIdiomaPage = new AlterarIdiomaPage();

    @Given("o usuario clica no label para selecionar a linguagem")
    public void o_usuario_clica_no_label_para_selecionar_a_linguagem(){
        alterarIdiomaPage.clicarNoLabelDoIdioma();
    }

    @When("o usuario clica no pais {string}")
    public void o_usuario_clica_no_pais(String country){

        if (country.equals("Brasil")) {
            alterarIdiomaPage.clicarBrasil();
        }

        if (country.equals("México")) {
            alterarIdiomaPage.clicarMexico();
        }
    }

    @Then("o sistema deve exibir o endereco {string}")
    public void o_sistema_deve_exibir_o_endereco(String string){
        Assertions.assertEquals(alterarIdiomaPage.verificarUrl(), string);
    }

    @Then("o label sobre da ligua escolhida {string}")
    public void o_label_sobre_da_ligua_escolhida(String about) {

        if (about.equals("SOBRE A NIKE")) {
            Assertions.assertEquals(alterarIdiomaPage.verificarSobreANike(), about);
        }

        if (about.equals("ACERCA DE NIKE")) {
            Assertions.assertEquals(alterarIdiomaPage.verificarAcercaDeNike(), about);
        }
    }
}
