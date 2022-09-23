package StreamsAPI.Min_Max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import StreamsAPI.Reduce.Aluno;

public class MinMax {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10.0);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Comparator<Aluno> melhorNota = (a , b) -> {
            if(a.nota > b.nota) return 1;
            if(a.nota < b.nota) return -1;
            return 0;
        };
            
        System.out.println(alunos.stream().max(melhorNota).get());
        System.out.println(alunos.stream().min(melhorNota).get());

    }
}