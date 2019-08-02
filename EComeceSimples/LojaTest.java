package EComeceSimples;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LojaTest {
	
	Loja loja;
	
	@BeforeEach
	void setup() {
		loja = new Loja();
		loja.definirLimite(150);
		
	}

	@Test // Quando o valor recebido é 0 ou menor
	void testvendaErro() {
		Exception vendaEx = assertThrows(ValorInvalidoExecption.class, () -> loja.vender(0));
		assertEquals("valor a ser creditado é invalido" , vendaEx.getMessage());
		
		
	}
	
	@Test
	void testvenda() throws ValorInvalidoExecption {
		assertEquals("venda efetuada com sucesso", loja.vender(120));
		
	}
	
	@Test
	void compraErro() {
		Exception compraEX = assertThrows(CreditoInsuficienteException.class, () -> loja.comprar(200));
		assertEquals("Nao possui credito a ser debitado", compraEX.getMessage());
	}
	
	@Test
	void testcompra() throws ValorInvalidoExecption {
		assertEquals("venda efetuada com sucesso", loja.vender(120));
		
	}

}
