package desafio.composicao.oo;

import java.util.ArrayList;

public class Item {
    Produto produto;

    public int quantidadeProdutos;

    ArrayList<Produto> produtos = new ArrayList<>();

    Item(Produto produto, int quantidadeProdutos) {
        this.quantidadeProdutos = quantidadeProdutos;
        produtos.add(this.produto);
    }

}