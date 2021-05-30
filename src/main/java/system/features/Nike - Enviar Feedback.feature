@EnviarFeedback @E2E @Automated @SystemTest
Feature: EnviarFeedback

  Como um usuário
  quando eu enviar um feedback para a nike
  então devo receber uma mensagem de agradecimento

  Scenario: EnviarFeedback
    Given o usuario clica no label SEND US FEEDBACK
    And seleciona a opcao "Something Else"
    When o usuario escreve no campo de texto "Nike is the best!!"
    And o usuario clica no botao SUBMIT
    Then o sistema exibe a mensagem "Thank you"
