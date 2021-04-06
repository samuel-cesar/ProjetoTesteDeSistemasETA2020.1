@Search
Feature: Realizar Pesquisa

  Scenario: Realizar pesquisa através do campo Search
    Given o usuario clica na lupa de pesquisa
    When o usuario digita "shoes" no campo de pesquisa
    Then o sistema deve exibir as seguintes chuteiras com seus respectivos precos:
      | Nike Phantom GT Academy 3D MG | $80  |
      | Nike Premier II FG            | $110 |