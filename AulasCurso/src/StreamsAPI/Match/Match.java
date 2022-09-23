package StreamsAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import StreamsAPI.Reduce.Aluno;

public class Match {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        System.out.println(alunos.stream().allMatch(aprovado));
    }
}