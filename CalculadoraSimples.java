public class CalculadoraSimples {
	public static void main(String[] args) {
		int a = 10;
		int b = 2;

		int soma = a + b;
		int subtracao = a - b;
		int multiplicacao = a * b;
		double divisao = a / b;
		int modulo = a % b;

		System.out.println(a);
		System.out.println(b);
		System.out.println("Soma: " + soma);
		System.out.println("Subtração: " + subtracao); 
		System.out.println("Multiplicação: " + multiplicacao);
		System.out.println("Divisão: " + divisao);
		System.out.println("Resto de divisão: " + modulo);
	}
}
