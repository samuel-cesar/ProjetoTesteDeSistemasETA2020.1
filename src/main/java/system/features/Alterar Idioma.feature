@AlterarIdioma @E2E @Automated @SystemTest
Feature: Alterar Idioma

  Como um usuário
  eu quero alterar o idioma do site
  para o Brasil e para o México
  então o sistema deve validar o país, a url e o menu about

  Scenario Outline: Alterar idioma
    Given o usuario clica no label para selecionar a linguagem
    When o usuario clica no pais "<Country>"
    Then o sistema deve exibir o endereco "<Url>"
    And o label sobre da ligua escolhida "<About>"
    Examples:
      | Country | Url                      | About          |
      | Brasil  | https://www.nike.com.br/ | SOBRE A NIKE   |
      | México  | https://www.nike.com/mx/ | ACERCA DE NIKE |

