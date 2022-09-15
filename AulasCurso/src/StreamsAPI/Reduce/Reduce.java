package StreamsAPI.Reduce;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        /*
         * A interface funcional 'reduce' recebe um acumulador e outro valor como parâmetro. 
         */

        Integer total1 = nums.parallelStream()
            .reduce(soma).get();     
            System.out.println(total1);
            
        /*
         * Em uma parallelStream as iterações são feitas de forma paralela.
         * Caso se utilize o reduce passando um acumulador (accumulator, identity), o mesmo será implementado
         * em todas as iterações. Para ver este funcionamento, basta passar um valor de accumulator como parâmetro
         * na interface .reduce da linha 19. e.x: .reduce(100, soma) 
         * 
         * -> Nesse caso não precisamos do .get() pelo de existir um acumulador, com isso garantimos que sempre será
         * retornado algo <-
         */
        
        /*
         * como passamos somente uma função como parâmetro para reduce, estamos utilizando
         * o optional reduce, que pode ou não retornar algo. Para retornar utilizando um optional,
         * devemos utilizar a função .get()
         */
        

        Integer total2 = nums.stream().
            reduce(100, soma);
            System.out.println(total2);

        nums.stream()
            .filter(n -> n > 5) //filtrar os números maiores que 5
            .reduce(soma) //somar os valores
            .ifPresent(System.out::println); //se estiver presente, printar na tela por Method Reference

    }    
}