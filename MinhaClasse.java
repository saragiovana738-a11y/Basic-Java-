class SuperClasse {
// Sobrescrito na classe filha 
	public void imprime() {
		System.out.println("Imprime");
	}
}

public class MinhaClasse extends SuperClasse{
	@Override
	public void imprime() {
		System.out.println("Imprime diferente");
	}

	public static void main(String[] args) {
		SuperClasse s1 = new MinhaClasse();
		s1.imprime();
	} 
}
