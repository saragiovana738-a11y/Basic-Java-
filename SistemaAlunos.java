public class SistemaAlunos {
	public static void main(String[] args) {

		int nota1 = 6;
		int nota2 = 10;
		int frequencia = 74;

		double media = (nota1 + nota2) / 2.0;
		String resultado;

		if (media >= 6 && frequencia >= 75) {
			resultado = "Aprovado";
		} else {
			resultado = "Reprovado";
		}

		System.out.println("A média do aluno foi: " + media);
		System.out.println("A % de frequencia foi: " + frequencia);
		System.out.println("O aluno foi: " + resultado);
	}
}

