@Search @E2E @Automated
Feature: Realizar Pesquisa

  Como um usuário do sistema
  quando eu realizar uma consulta de um produto no campo search
  então o sistema deve exibir o nome do produto pesquisado

  Scenario: Realizar pesquisa através do campo Search
    Given o usuario clica na lupa de pesquisa
    When o usuario digita "Nike Phantom GT Academy 3D MG" no campo de pesquisa e aperta a tecla enter
    Then o sistema deve exibir que o resultado da consulta foi:
      | Nike Phantom GT Academy 3D MG |