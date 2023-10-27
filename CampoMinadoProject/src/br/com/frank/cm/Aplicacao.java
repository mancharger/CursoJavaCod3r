package br.com.frank.cm;

import br.com.frank.cm.modelo.Tabuleiro;
import br.com.frank.cm.visao.TabuleiroConsole;

public class Aplicacao {
    public static void main(String[] args) {
        //Projeto aos moldes da organização MVC
        //Main - Iniciação projeto
        Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
        new TabuleiroConsole(tabuleiro);

    }
}