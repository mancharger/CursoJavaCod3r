package StreamsAPI.Map.DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class DesafioMap {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        // Function<Integer, String> paraBinario = m -> m.toBinaryString(m);
        Function<String, String> inverterBinario = m -> {
            String invertido = new StringBuilder(m).reverse().toString();
            return invertido;            
        };
        Function<String, Integer> paraDecimal = m -> {
            Integer numInteiro = Integer.parseUnsignedInt(m, 2);
            return numInteiro;
        };


        nums.stream()
            .map(Integer::toBinaryString)
            .map(inverterBinario)
            .map(paraDecimal)
            .forEach(System.out::println);
    }
}
