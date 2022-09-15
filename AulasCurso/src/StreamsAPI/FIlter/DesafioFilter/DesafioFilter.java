package StreamsAPI.FIlter.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class DesafioFilter {
    public static void main(String[] args) {

        /*
         * Utilizando Filter e Map para selecionar apenas os clientes que tenham uma quantidade total de compras
         * superior ou igual a '5' e tenham efetuado alguma compra no mes atual.
         */
        
        Cliente c1 = new Cliente("Julio", true, 5);
        Cliente c2 = new Cliente("Paulo", false, 7);
        Cliente c3 = new Cliente("Andre", false, 2);
        Cliente c4 = new Cliente("Antonio", true, 3);
        Cliente c5 = new Cliente("Ademar", true, 8);
        Cliente c6 = new Cliente("Aldemir", true, 4);
        Cliente c7 = new Cliente("Renato", false, 15);
        Cliente c8 = new Cliente("Paula", false, 6);
        Cliente c9 = new Cliente("Ana", true, 6);
        Cliente c10 = new Cliente("Julia", true, 1);

        List<Cliente> clientes = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8, c9, c10);

        Predicate<Cliente> comprouNoMes = c -> c.getComprouEsseMes();
        Predicate<Cliente> comprouMaisQueCinco = c -> c.getQntComprasTotal() >= 5;
        Function<Cliente, String> ganhadoresCupom = c -> c.getNome() + " recebeu o cupom do sorteio!!";

        clientes.stream()
            .filter(comprouNoMes)
            .filter(comprouMaisQueCinco)
            .map(ganhadoresCupom)
            .forEach(System.out::println);
    }
}