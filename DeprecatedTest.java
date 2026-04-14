class MyDeprecated {
	public int calcularSoma(int a, int b) {
		return a + b; 
	}

	@Deprecated
	public int calcularProduto(int a, int b) {
		return a + b;
	}
} 

public class DeprecatedTest{
	@SuppressWarnings("deprecation")
	public static void main(String[] args){
		MyDeprecated a1 = new MyDeprecated();
		System.out.println(a1.calcularSoma(1,1));
		System.out.println(a1.calcularProduto(1,1));

	}
}