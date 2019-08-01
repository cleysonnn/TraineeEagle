
public class Calculadora {
	
	
	public int soma(int a , int b) {
		return a+b;
	}
	
	public int subtrair(int a , int b) {
		return a-b;
	}
	public int multiplicar(int a , int b) {
		return a*b;
	}
	
	public int divisao(int a , int b) throws DivisaoPor0Exception {
		if (b == 0){
			throw new DivisaoPor0Exception ("divisao por 0") ;
	
		}
		
		return a/b;
	}
	public int raiz(int a , int b) {
		return a+b;
	}
	
}
