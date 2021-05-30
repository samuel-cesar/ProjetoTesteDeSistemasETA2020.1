@CentauroCarrinho @E2E @Automated @SystemTest
Feature: Adicionar e aumentar a quantidade de um produto no carrinho

  Como um usuário que deseja comprar um produto
  quando eu adicionar um produto ao carrinho,
  então o sistema deve exibir o valor de R$ 289,00
  e quando o usuário aumentar a quantidade do produto
  o sistema deve exibir a quantidade para 2
  e exibir  o valor do produto igual a R$ 579,80

  Background: O usuario pesquisa o produto e clica no botao entrar
    Given o usuario preenche o campo de busca com "Agasalho Puma Techstripe Tricot Suit OP - Masculino"
    Then o usuario aperta a tecla Enter
    And clica no produto agasalho
    When o usuario seleciona o tamanho do produto
    And clica no botao comprar

  Scenario: Adicionar produto ao carrinho
    Then o sistema exibe o valor total da compra "R$ 289,90"

  Scenario: Aumentar a quantidade do produto no carrinho
    When o usuario clica no botao '+' para aumentar a quantidade
    Then o sistema exibe a quantidade do produto igual a "2"
    And o valor total dos produtos deve ser "R$ 579,80"