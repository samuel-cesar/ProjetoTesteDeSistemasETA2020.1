package system.stepDefinitions;

import io.cucumber.java.en.Given;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static system.helpers.DriverManager.getDriver;

public class NaoRealizarLoginSteps {

    @Given("o usuario realiza login com o email {string} e a senha {string}")
    public void o_usuario_realiza_login_com_o_email_e_a_senha(String email, String password) {

        getDriver().get("https://www.nike.com/login?continueUrl=https://www.nike.com/member/profile");

        getDriver().findElement(By.name("emailAddress")).sendKeys(email);

        getDriver().findElement(By.name("password")).sendKeys(password + Keys.ENTER);
    }

}
