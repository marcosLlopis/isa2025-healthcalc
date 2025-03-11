package healthcalc;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
	private final health calculadora = new health();

	@Test
	@DisplayName("Esto es un test de ejemplo.")
	public void bmi() {
		assertEquals(true, true);
	}


	//////////////////Test para metodo IW///////////////////////////

	//1
	@Test
	@DisplayName("Test de Altura menor a la esperada IW")
	public void testAlturaMenor() {
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.idealWeight(79, 'M'), 
		"La altura introducida es menor a la esperada ");
	}
	//2
	@Test
	@DisplayName("Test de Altura mayor a la esperada IW")
	public void testAlturaMayorPosibleIW() {
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.idealWeight(45759, 'M'), 
		"La altura introducida es demasiado alta");
	}


	//3
	@Test
	@DisplayName("Test hombre ")
	public void hombreIW() throws Exception{
		float IW = 112 - 100 - (112 - 150) / 4f;
		assertEquals(IW, calculadora.idealWeight(112, 'M'));

		IW = 178 - 100 - (178 - 150) / 4f;
		assertEquals(IW, calculadora.idealWeight(178, 'M'));


	}

	//4
	@Test
	@DisplayName("Test mujer uso promedio IW")
	public void testMujerPromedioIW() throws Exception{
		float IW = 102 - 100 - (102 - 150) / 2.5f;
		assertEquals(IW, calculadora.idealWeight(102, 'w'));

		IW = 124 - 100 - (124 - 150) / 2.5f;
		assertEquals(IW, calculadora.idealWeight(124, 'w'));
	}

	//5
	@Test
	@DisplayName("Test de sexo erroneo IW")
	public void testGenderProblematicIW() {
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.idealWeight(174, 'h'),
		"genero no valido");
	}

/////////////Test para metodo BMR////////////////////////




}
