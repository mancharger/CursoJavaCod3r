package br.com.frank.cm;

import br.com.frank.cm.modelo.Tabuleiro;

public class Aplicacao {
    public static void main(String[] args) {
        
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);

        tabuleiro.abrir(3, 3);
        tabuleiro.alternarMarcacao(4, 4);
        tabuleiro.alternarMarcacao(4, 5);


        System.out.println(tabuleiro);
    }
}