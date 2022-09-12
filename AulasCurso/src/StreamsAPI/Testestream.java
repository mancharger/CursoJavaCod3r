package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Testestream {
    public static void main(String[] args) {
        
        List<String> listanomes = Arrays.asList("Franklin", "Eduardo", "Moreira", "Santos");
        
        Stream<String> streamNomes = listanomes.stream();
        streamNomes.forEach(System.out::println); 
    }
}
