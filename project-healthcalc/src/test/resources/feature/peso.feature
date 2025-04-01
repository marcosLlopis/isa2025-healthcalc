
@tag
Feature: Calcular Peso ideal



 @tag1
  Scenario Outline: Altura invalida
    Given  que tengo una calculadora de salud
    When calculo el peso ideal para una altura no valida <h>
    Then la calculadora lanza una excepcion

      Examples: 
      | h |
      |-199|
      |-1|
      |0|
    

@tag2
  Scenario Outline: Genero invalido
    Given que tengo una calculadora de salud
    When calculo el peso ideal para un genero no valido <g>
    Then la calculadora lanza una excepcion

   	Examples: 
      | g |
      |'10'|
      |'w'|
      |'p'|

  @tag3
  Scenario Outline: resultado negativo
    Given que tengo una calculadora de salud
    When calculo el peso ideal para el sexo <g> y la altura <h> y da un resultado negativo
    Then la calculadora lanza una excepcion

   	Examples: 
      | g | h |
      |'m'| 79|
      |'w'| 69|
      |'m'| 45|
      |'w'| 45|

	@tag4
  Scenario Outline: resultado de peso ideal
    Given que tengo una calculadora de salud
    When calculo el peso ideal para el sexo <g> y la altura <h>
    Then la calculadora da un resultado <resultado>

   	Examples: 
      | g |  h | resultado |
      |'w'| 150| '55' |
      |'w'| 171|'61'|
      |'m'| 171|'64'|
      |'m'| 173|'67' |

      
