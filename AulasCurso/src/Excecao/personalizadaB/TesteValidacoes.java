package Excecao.personalizadaB;

import Excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try {
            Aluno aluno = new Aluno("Ana", (double) -7);
            Validar.aluno(aluno);
        } catch (StringVaziaException e) {
            System.out.println(e.getMessage());
        } catch (NumeroForaIntervaloException e){
            System.out.println(e.getMessage());
        }
        
        System.out.println("Fim");
    }
}