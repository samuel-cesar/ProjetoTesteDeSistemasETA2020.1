package system.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import system.helpers.DSL;

import static system.helpers.DriverManager.getDriverWait;

public class EnviarFeedbackPage {

    private DSL dsl;

    private String clicarSendUSFeedBackXPath = "//a[contains(text(),'SEND US FEEDBACK')]";
    private String selecionarSomethingElseXpath = "//div[@class='_pi_widgetContentContainer']//div[2]//select[1]";
    private String textAreaXpath = "//textarea[@class='_pi_free_text_question_field']";
    private String botaoSubmitXpath = "//input[@class='_pi_all_questions_submit_button']";
    private String thankYouXpath = "//b[contains(text(),'Thank you')]";

    public EnviarFeedbackPage() {
        this.dsl = new DSL();
    }

    public void clicarLabelSendUSFeedback() {
        dsl.clicarSendUSFeedBack(clicarSendUSFeedBackXPath);
    }

    public void selecionarSomethingElse(String someThingElse) {
        dsl.selecionarComboXpath(selecionarSomethingElseXpath, someThingElse);
    }

    public void escreverNikeIsTheBest(String nikeIsTheBest) {
        dsl.escreverXpath(textAreaXpath, nikeIsTheBest);
    }

    public void clicarSubmit() {
        dsl.clicarSubmitXpath(botaoSubmitXpath);
    }

    public String verificacaoThankyou() {
        return dsl.obterTextoXPath(thankYouXpath);

    }
}
