package Excecao;

import StreamsAPI.Reduce.Aluno;

public class Basico {
    public static void main(String[] args) {
        
        Aluno a1 = null;

        try {
            imprimirAluno(a1);
            } catch (Exception e) {
            System.out.println("Ocorreu um erro no momento de imprimir o nome de usuario");
        }

        try {
            System.out.println(7/0);
        } catch (ArithmeticException excecaoaritmetica) {
            System.out.println("Ocorreu o erro: " + excecaoaritmetica.getMessage());
        }

        System.out.println("Fim-se");

    }

    public static void imprimirAluno(Aluno aluno){
        System.out.println(aluno.nome);
    }
}