import estoque.loja.Produto;
public class Loja {
	public static void main(String[] args) {

	Produto p1 = new Produto();
	p1.exibirProduto();

	if (p1.disponivel()) {
		System.out.println("Produto disponível");
	} else {
		System.out.println("Produto indisponível");
	}

	Produto p2 = new Produto("Caderno", 15.0, 0);
	p2.exibirProduto();

	if (p2.disponivel()) {
		System.out.println("Produto disponível");
	} else {
		System.out.println("Produto indisponível");
	}

    Produto p3 = new Produto("Borracha", 1.5, 5);
    p3.exibirProduto();

    if (p3.disponivel()) {
		System.out.println("Produto disponível");
	} else {
		System.out.println("Produto indisponível");
	}

	}
}