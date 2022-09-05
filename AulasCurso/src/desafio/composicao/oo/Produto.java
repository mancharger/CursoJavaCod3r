package desafio.composicao.oo;

public class Produto {
    public String nome;
    public Double preco;

    Produto(String nome, Double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    public String toString() {
        return nome + " por " + preco;
    }

}
