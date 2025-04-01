package healthcalc.bdd;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import healthcalc.HealthCalc;
import healthcalc.health;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefTest{
	private HealthCalc calculadora;
	private float resultado;
	private boolean excepcion;

	@Given("que tengo una calculadora de salud")
	public void que_tengo_una_calculadora_de_salud() {
	    calculadora = new health();
	}

	////////////// Peso ideal /////////////////////////////////////////////////

	@When("calculo el peso ideal para una altura no valida {int}")
	public void estimo_el_peso_ideal_para_una_altura_negativa(int height) {
		try {
			calculadora.idealWeight(height, 'M');
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@Then("la calculadora lanza una excepcion")
	public void la_calculadora_lanza_una_excepcion() {
		assertTrue(excepcion);
	}

	@When("calculo el peso ideal para un genero no valido {string}")
	public void estimo_el_peso_ideal_para_un_genero_invalido(String gender) {
		try {
			calculadora.idealWeight(156, gender.charAt(0) );
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@When("calculo el peso ideal para el genero y altura y da un resultado negativo")
	public void estimo_el_peso_ideal_para_genero_y_altura_y_da_un_resultado_negativo(char gender, int height) {
		try {
			calculadora.idealWeight(height, 'M');
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@When("calculo el peso ideal para el sexo {string} y la altura {int}")
	public void estimo_el_peso_ideal_para_genero_y_altura(String gender, int height) throws Exception {
	    resultado=calculadora.idealWeight(height, gender.charAt(0));
	}

	@Then("la calculadora da un resultado {string}")
	public void la_calculadora_devuelve_un_resultado(String resultadoEsperado) {
		assertEquals(Float.parseFloat(resultadoEsperado), resultado);
	}

	////////////// Tasa metabólica basal ///////////////////////////////////////


	@When("calculo la tasa metabolica basal de una altura invalida {int}")
	public void estimo_la_tasa_metabolica_basal_con_altura_invalida(int height) {
		try {
			calculadora.basalMetabolicRate(39, height,20, 'W');
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@When("calculo la tasa metabolica basal de un genero no valido {string}")
	public void estimo_la_tasa_metabolica_basal_con_genero_invalido(String gender) {
		try {
			resultado=calculadora.basalMetabolicRate(39, 149,22, gender.charAt(0));
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@When("estimo la tasa metabolica basal de una edad negativa {int}")
	public void estimo_la_tasa_metabolica_basal_con_edad_negativa(int age) {
		try {
			calculadora.basalMetabolicRate(71, 141, age,'w');
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@When("calculo la tasa metabolica basal de un peso no valido {float}")
	public void estimo_la_tasa_metabolica_basal_con_peso_invalido(float weight) {
		try {
			calculadora.basalMetabolicRate(weight, 171, 30,'w');
		} catch (Exception e) {
			excepcion = true;
		}
	}

	@When("estimo la tasa metabolica basal para los parametros validos dados {float} {int} {int} {string}")
	public void estimo_la_tasa_metabolica_basal_para_parametros_validos(float weight, int height, int age, String gender) throws Exception {
		calculadora.basalMetabolicRate(weight, height, age, gender.charAt(0));
	}

	@Then("la calculadora arroja un resultado valido {string}")
	public void el_sistema_devuelve_un_resultado(String resultadoEsperado) {
		assertEquals(Float.parseFloat(resultadoEsperado), resultado);
	}
}
