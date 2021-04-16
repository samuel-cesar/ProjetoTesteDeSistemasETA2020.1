@NaoDeveRealizarLoginDeveSerExecutadoIsoladamente @E2E @Automated
Feature: Usuário não deve realizar login

  Como usuário robô
  o sistema não deve permitir realizar login.
  e deve exibir uma mensagem de bloqueio.

  Scenario: Usuário não deve realizar login
    Given o usuario acessa a pagina de login
    And o usuario preenche o campo Email Address com "sam.aquino@gmail.com"
    And o usuario preenche o campo Password com "Pa$$w0rd!"
    When o usuario clica no botao SIGN IN
    Then o sistema deve exibir as seguintes mensagens:
      | An error occurred.                                                         |
      | We are unable to connect to our servers right now. Please try again later. |
      | GENERIC "0 - POST request to https://unite.nike.com/login blocked          |


