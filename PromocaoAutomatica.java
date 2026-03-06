public class PromocaoAutomatica {
	public static void main(String[] args) {
		byte a = 10;
		short b = 20;
		char c = 'A';
		int d = 30;
		int resultado1 = a + b;
		long e = 40L;
		long resultado2 = b * d;
		float f = 1.5f;
		float resultado3 = e / f;
		double g = 2.5;
		double resultado4 = e - g;

		System.out.println("Valor do char: " + c);
		System.out.println("Valor da primeira expressão: " + resultado1);
		System.out.println("Valor da segunda expressão: " + resultado2);
		System.out.println("Valor da terceira expressão: " + resultado3);
		System.out.println("Valor da quarta expressão: " + resultado4);
	}
}