package estoque.loja;
public class Produto {
    String nome;
    double preco;
    int quantidade;

    public Produto() {
        this.nome = "Desconhecido";
        this.preco = 0.0;
        this.quantidade = 0;
    }

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void exibirProduto() {

        System.out.println("Nome: " + nome);
        System.out.println("Preço: " + preco);
        System.out.println("Quantidade: " + quantidade);
    }

    public boolean disponivel () {
      return quantidade > 0;
    }
}


