public class DiasNoMes {
	public static void main(String[] args) {

		String mes = "Abril";

		String tipoDeMes = switch (mes) {
			case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> "Numero de dias: 31";
			case "Abril", "Junho", "Setembro", "Novembro" -> "Numero de dias: 30";
			case "Fevereiro" -> "Numero de dias: 28 ou 29";
			default -> "Mês desconhecido";
		};

		System.out.println(tipoDeMes);

	}
}




