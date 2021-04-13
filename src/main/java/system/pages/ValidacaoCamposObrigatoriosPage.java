package system.pages;

import org.openqa.selenium.By;
import system.helpers.DSL;

import static system.helpers.DriverManager.getDriver;

public class ValidacaoCamposObrigatoriosPage {

    private DSL dsl;

    public ValidacaoCamposObrigatoriosPage() {
        this.dsl = new DSL();
    }

    public void acessarPaginaLogin() {
        dsl.acessarPagina("https://www.nike.com/login?continueUrl=https://www.nike.com/member/profile");
    }

    public void clicarBotaoSignIn() {
        dsl.clicarBotaoSignIn("//input[@value='SIGN IN']");
    }

    public String verificarEmail() {
        return dsl.obterTextoXPath("//div[@class='error'][contains(text(),'Please enter a valid email address.')]");
    }

    public String verificarSenha() {
        return dsl.obterTextoXPath("//div[@class='error'][contains(text(),'Please enter a password.')]");
    }
}
