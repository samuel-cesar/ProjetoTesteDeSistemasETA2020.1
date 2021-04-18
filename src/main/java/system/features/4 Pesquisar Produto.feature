@Search @E2E @Automated @SystemTest
Feature: Realizar Pesquisa

  Como um usuário do sistema
  quando eu realizar uma consulta de um produto no campo search
  então o sistema deve exibir o nome do produto pesquisado

  Scenario: Realizar pesquisa através do campo Search
    Given o usuario clica na lupa de pesquisa
    When o usuario digita "Nike Air VaporMax 2020 FK" no campo de pesquisa e aperta a tecla enter
    Then o sistema deve exibir que o resultado da consulta foi:
      | Nike Air VaporMax 2020 FK |