public class Trocas {
	public static void main (String[] args) {
		
		int codigoDeSaida = 3;

		for (int codigoCarteirinha = 1; codigoCarteirinha <= 10; codigoCarteirinha++) {

			System.out.println(codigoCarteirinha);

			if (codigoCarteirinha == codigoDeSaida)	{

				break;

			}


			if (codigoCarteirinha == 3 || codigoCarteirinha == 7 || codigoCarteirinha == 10) {

				System.out.println("Codigo " + codigoCarteirinha + " é aceito");

				continue;

			}
			
			System.out.println(codigoCarteirinha);
			System.out.println("Codigo " + codigoCarteirinha + " não é aceito");
		}
	}
}
