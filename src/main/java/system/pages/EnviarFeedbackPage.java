package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;

import static system.helpers.DriverManager.getDriverWait;

public class EnviarFeedbackPage {

    private DSL dsl;

    public EnviarFeedbackPage() {
        this.dsl = new DSL();
    }

    public void clicarLabelSendUSFeedback() {
        dsl.clicarSendUSFeedBack("//a[contains(text(),'SEND US FEEDBACK')]");
    }

    public void selecionarSomethingElse() {
        By selectAnOption = By.xpath("//div[@class='_pi_widgetContentContainer']//div[2]//select[1]");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(selectAnOption));
        dsl.selecionarComboXpath("//div[@class='_pi_widgetContentContainer']//div[2]//select[1]", "Something Else");
    }

    public void escreverNikeIsTheBest(String nikeIsTheBest) {
        dsl.escreverXpath("//textarea[@class='_pi_free_text_question_field']", nikeIsTheBest);
    }

    public void clicarSubmit() {
        dsl.clicarSubmitXpath("//input[@class='_pi_all_questions_submit_button']");
    }

    public String verificacaoThankyou() {
        By thankyou = By.xpath("//b[contains(text(),'Thank you')]");
        getDriverWait().until(ExpectedConditions.visibilityOfElementLocated(thankyou));
        return dsl.obterTextoXPath("//b[contains(text(),'Thank you')]");

    }
}
