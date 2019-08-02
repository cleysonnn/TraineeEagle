import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CalculadoraTest {
	
	 Calculadora cal;
	 
	/*
	 * 	https://howtodoinjava.com/junit-5-tutorial/
	 *  https:junit.org/junit5/docs/current/user-guide/
	 * 
	 */

	
	
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
	
	@Test
	void testdivisao() { 
		
		Exception exe = assertThrows(DivisaoPor0Exception.class, () -> cal.divisao(6, 0));
		assertEquals("divisao por 0", exe.getMessage());
		
	}
	
	@Test
	void testRaiz() {
		assertEquals(11, cal.raiz(121));
		
	}
	

}
