@tag
Feature: Calculate Basal Metabolic Rate
  As a user of the health calculatorI want to calculate the basal metabolic rate according to the parameters entered so that I can know the resulting of this health measurement

  @tag1
  Scenario Outline: Invalid Height
    Given   que tengo una calculadora de salud
    When calculo la tasa metabolica basal de una altura invalida <h>
    Then la calculadora lanza una excepcion

    Examples: 
      | h |
      |-15|
      |-1|
      | -12 |

  @tag2
  Scenario Outline: Invalid Weight
    Given   que tengo una calculadora de salud
    When calculo la tasa metabolica basal de un genero no valido <g>
    Then la calculadora lanza una excepcion

    Examples: 
      | g |
      |'0'|
      |'p'|
      |'1'|

  @tag3
  Scenario Outline: Invalid Age
    Given   que tengo una calculadora de salud
    When  estimo la tasa metabolica basal de una edad negativa <a>
    Then la calculadora lanza una excepcion
    Examples: 
      | a |
      |-9|
      |-4|
      |-97|

   @tag4
  Scenario Outline: Invalid Weight
    Given  que tengo una calculadora de salud
    When calculo la tasa metabolica basal de un peso no valido <w>
    Then la calculadora lanza una excepcion

    Examples: 
      | w |
      |-12|
      |-21|
      |-5| 

	@tag6
    Scenario Outline:  valid parameters
	  Given que tengo una calculadora de salud
		When estimo la tasa metabolica basal para los parametros validos dados <w> <h> <a> <g>
		Then la calculadora arroja un resultado valido <resultado>
		Examples: 
      | w | h  | a| g | resultado|
      | 80| 170 |55|'w'|'1426.5'|
      |80|171|55|'m'|'1598.75'| 