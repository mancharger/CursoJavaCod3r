package Lambdas.PredicateComposicao;

import java.util.function.Predicate;

public class PredicateComposicao {
    public static void main(String[] args) {
        
        Predicate <Integer> isPar = num -> num % 2 == 0;
        Predicate <Integer> isTresNumeros = num -> num >= 100 && num <= 999;

        System.out.println(isPar.and(isTresNumeros).test(24));
        System.out.println(isPar.and(isTresNumeros).test(124));
        
    }
}