package desafio.composicao.oo;

import java.util.ArrayList;

public class Cliente {
    Compra compra;

    public String nome;
    ArrayList<Compra> listaCompras = new ArrayList<>();

    Cliente(String nome) {
        this.nome = nome;
    }

    void fazerCompra(Produto produto, int quantidade) {
        Item esseItem = new Item(produto, quantidade);
        Compra essaCompra = new Compra(esseItem);

        essaCompra.listaItens.add(esseItem);
        listaCompras.add(essaCompra);

        this.compra = essaCompra;
        this.compra.item.produto = produto;
    }

    Double getValorTotal() {
        Double total = 0.0;

        for (Item item : compra.listaItens) {
            total += item.produto.preco * item.quantidadeProdutos;
        }

        return total;
    }

}