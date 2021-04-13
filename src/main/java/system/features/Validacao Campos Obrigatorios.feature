@ValidacaoCamposObrigatorios @E2E @Automated
Feature: Validar campos obrigatorios

  Como um usuário
  eu quero validar as mensagens dos campos obrigatórios
  da funcionalidade de login

  Scenario: Validar campos obrigatorios
    Given o usuario acessa a pagina de login
    When o usuario clica no botao SIGN sem preencher os campos email e senha
    Then o sistema deve exibir a mensagem de validacao para o email:
      | Please enter a valid email address. |
    * e a mensagem de validacao para a senha:
      | Please enter a password. |