package desafio.composicao.oo;

public class Clienteteste {
    public static void main(String[] args) {
    
        Cliente c1 = new Cliente("Franklin");
            Produto p1 = new Produto("Arroz", 5.70);
            Produto p2 = new Produto("Pippos", 2.50);
    
            System.out.println(c1.nome);
            System.out.println(p1.nome + " preco = " + p1.preco);
            System.out.println(p2.nome + " preco = " + p2.preco);
    
            c1.fazerCompra(p1, 3);
            System.out.println("fez a compra");
            c1.fazerCompra(p2, 5);
    
            System.out.println(c1.nome + " Comprou:\n" + c1.compra.listaItens);
            System.out.println("Quantidade de itens na compra: " + c1.listaCompras.size());
            System.out.println("Valor total de compra: " + c1.getValorTotal());
        
      }
}
