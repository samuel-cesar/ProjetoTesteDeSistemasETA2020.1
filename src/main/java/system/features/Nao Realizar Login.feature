@NaoDeveRealizarLogin @E2E @Automated @SystemTest
Feature: Usuário não deve realizar login

  O sistema não deve permitir realizar login
  através de software automatizado
  e deve exibir uma mensagem de bloqueio.

#  Este teste precisa ser executado em um sessão isolada,
#  caso contrário, o sistema realiza login de forma automatizada.

  Scenario: Usuário não deve realizar login
    Given o usuario acessa a pagina de login
    And o usuario preenche o campo Email Address com "sam.aquino@gmail.com"
    And o usuario preenche o campo Password com "Pa$$w0rd!"
    When o usuario clica no botao SIGN IN
    Then o sistema deve exibir as seguintes mensagens:
      | AN ERROR OCCURRED.                                                         |
      | We are unable to connect to our servers right now. Please try again later. |
      | GENERIC "0 - POST request to https://unite.nike.com/login blocked"         |


