package DesafioArray;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        int qntNotas;
        double somaNotas = 0;

        Scanner scan = new Scanner(System.in);

        System.out.println("Quantas notas serão inseridas? ");
        qntNotas = scan.nextInt();
        scan.nextLine();

        double notas[] = new double[qntNotas];

        for(int i = 0; i < qntNotas; i++){
            System.out.printf("Digite a nota [%d]: ", i + 1);
            notas[i] = scan.nextDouble();
        }
        scan.close();
        for(double nota: notas){
            somaNotas += nota;
        }

        System.out.println("Media do aluno: " + somaNotas/qntNotas);

    }
}
