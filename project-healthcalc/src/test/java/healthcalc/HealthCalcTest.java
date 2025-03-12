package healthcalc;

import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Tests para la calculadora de salud.")
public class HealthCalcTest {
	private final health calculadora = new health();



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
@Test //1
	@DisplayName("Test peso incorrecto BMR")
	public void testPesoBMR() {
		assertThrows(IllegalArgumentException.class,
		() -> calculadora.basalMetabolicRate(-5784, 170, 22, 'M'), 
		"valor de peso incorrecto ");
	}
	@Test //2  
	@DisplayName("Test Altura incorrecta BMR")
	public void testAlturaBMR() {
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.basalMetabolicRate(60, 1, 22, 'M'), 
		"valor de altura incorrecto");
	}
	@Test //3    
	@DisplayName("Test entrada incorrecta sexo BMR")
	public void testSexoBMR() {
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.basalMetabolicRate(76, 110, 30, 'a'), 
		"valor de sexo incorrecto");
	}
	@Test //4
	@DisplayName("Test entrada incorrecta edad BMR")
	public void testEdadBMR() {
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.basalMetabolicRate(60, 168, 20001, 'M'), 
		"edad incorrecto ");
	}
	@Test //5
	@DisplayName("Todo mal")
	public void malBMR() {
		assertThrows(IllegalArgumentException.class, 
		() -> calculadora.basalMetabolicRate(1, 1, 356, 'p'), 
		"valores introducidos no son adecuados para el calculo");
	}

	@Test //7
	@DisplayName("Test mujer  BMR")
	public void testWomanBMR() throws Exception{
		float BMR = (float) (10 * 20 + 6.25 * 130 - 5 * 10 - 161);
		assertEquals(BMR, calculadora.basalMetabolicRate(20, 130, 10, 'w'));

		BMR = (float) (10 * 100 + 6.25 * 169 - 5 * 54 - 161);
		assertEquals(BMR, calculadora.basalMetabolicRate(100, 169, 54, 'w'));

	}
	@Test //8
	@DisplayName("Test hombre  BMR")
	public void testMenBMR() throws Exception{
		float BMR = (float) (10 * 70 + 6.25 * 185 - 5 * 13 + 5);
		assertEquals(BMR, calculadora.basalMetabolicRate(70, 185, 13, 'm'));

		BMR = (float) (10 * 65 + 6.25 * 167 - 5 * 22 + 5);
		assertEquals(BMR, calculadora.basalMetabolicRate(65, 167, 22, 'm'));

	}

	
}
