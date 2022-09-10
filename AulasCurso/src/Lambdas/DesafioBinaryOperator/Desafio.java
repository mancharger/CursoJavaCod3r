package Lambdas.DesafioBinaryOperator;

import java.util.function.Function;

public class Desafio {
    public static void main(String[] args) {
        
        Produto p = new Produto("iPad", 3235.89, 0.13);

        Function <Produto, Double> precoComDesconto = num -> num.preco * (1 - num.desconto);
        Function <Double, Double> calculoImposto = num -> num >= 2500.00 ? num + (num * 0.085) : num;
        Function <Double, Double> frete = num -> num >= 3000.00 ? num + 100.0 : num + 50.0;
        Function <Double, Double> casasDecimais = num -> (Math.round(num*100.0)/100.0);
        Function <Double, String> formataPreco = num -> ("Preco final: R$" + num).replace(".", ",");


        System.out.println(precoComDesconto.apply(p));
        System.out.println(precoComDesconto.andThen(calculoImposto).apply(p));
        System.out.println(precoComDesconto.andThen(calculoImposto).andThen(frete).apply(p));
        System.out.println(precoComDesconto.andThen(calculoImposto).andThen(frete).andThen(casasDecimais).apply(p));
        System.out.println(precoComDesconto.andThen(calculoImposto).andThen(frete).andThen(casasDecimais).andThen(formataPreco).apply(p));
    }
}