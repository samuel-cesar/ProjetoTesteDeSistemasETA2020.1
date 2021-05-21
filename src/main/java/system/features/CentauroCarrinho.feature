Feature: Adicionar produto ao carrinho

  Scenario: Adicionar produto ao carrinho
    Given acessar a pagina da centauro "https://www.centauro.com.br/"
    And preencher o campo de busca com "Agasalho Puma Techstripe Tricot Suit OP - Masculino"
    Then o usuario aperta a tecla Enter
    And clica no produto agasalho
    When o usuario seleciona o tamanho do produto
    And clica no botao comprar
    Then o sistema exibe o valor total da compra "R$ 289,90"

  Scenario: Aumentar a quantidade do produto no carrinho
    Given acessar a pagina da centauro "https://www.centauro.com.br/"
    And preencher o campo de busca com "Agasalho Puma Techstripe Tricot Suit OP - Masculino"
    Then o usuario aperta a tecla Enter
    And clica no produto agasalho
    When o usuario seleciona o tamanho do produto
    And clica no botao comprar
    When o usuario clica no botao '+' para aumentar a quantidade
    Then o sistema exibe a quantidade do produto igual a "2"
    And o valor total dos produtos deve ser "R$ 579,80"