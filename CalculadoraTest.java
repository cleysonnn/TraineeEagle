import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	 Calculadora cal;

	
	
	@BeforeEach
	void setup() {
		cal = new Calculadora();
		
	}
	@Test
	void testsoma() {
		assertEquals(10, cal.soma(3, 7));
	}
	@Test
	void testsubtracao() {
		assertEquals(1,cal.subtrair(7, 6));
	}
	@Test
	void testmultplicacao() {
		assertEquals(27, cal.multiplicar(3, 9));
	}
	/*falta ver como rodar com exection
	@Test (expected= DivisaoPor0Exception.class)
	void testdivisao() throws  DivisaoPor0Exception{
		cal.divisao(6, 0);
		
	}
	*/

}
