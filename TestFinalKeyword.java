class ExemploFinal {
	
	// Definição de Constante - uso de final
	final int CODIGO_FIXO = 10;

	// Método final
	final void meuMetodo() {
		System.out.println("Este é um método final.");
	}
}

public class TestFinalKeyword {
	public static void main(String[] args) {
		ExemploFinal testFinal = new ExemploFinal();
		testFinal.CODIGO_FIXO = 555;
		System.out.println("Valor de constante: " + testFinal.CODIGO_FIXO);
		testFinal.meuMetodo();
	}
}