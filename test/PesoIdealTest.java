import static org.junit.Assert.*;

import org.junit.Test;


public class PesoIdealTest {

	@Test
	public void deveCalcularOImc() {
		double peso = 51.900;
		double altura = 1.63;
		String sexo = "F";
		String pesoIdeal = CalculaPesoIdeal.calculoImc(peso, altura, sexo);
		assertEquals("IMC = 19.53 - Seu IMC indica: Peso Normal.", pesoIdeal);
	}
	
	@Test
	public void deveCalcularOImc2() {
		double peso = 150.0;
		double altura = 1.70;
		String sexo = "M";
		String pesoIdeal = CalculaPesoIdeal.calculoImc(peso, altura, sexo);
		assertEquals( "IMC = 51.90 - Seu IMC indica: Obesidade Grave ou Mórbida.", pesoIdeal);
	}
	
	@Test
	public void deveCalcularOImc3() {
		double peso = 48.0;
		double altura = 1.73;
		String sexo = "M";
		String pesoIdeal = CalculaPesoIdeal.calculoImc(peso, altura, sexo);
		assertEquals("IMC = 16.04 - Seu IMC indica: Abaixo do Peso.", pesoIdeal);
	}


}
