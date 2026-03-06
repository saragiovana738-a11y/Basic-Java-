public class ParOuNao {
	public static void main(String[] args) {
		int numero = 10;

		String resultado = (numero % 2 == 0) ? "Par" : "Ìmpar";

		System.out.println(resultado);

		if (numero % 2 == 0) {

			System.out.println("Valor é par");

		} else {

			System.out.println("Valor é ímpar");
		}
	}
}
