package br.com.frank.cm.visao;

import java.util.Scanner;

import br.com.frank.cm.excecoes.SairException;
import br.com.frank.cm.modelo.Tabuleiro;

public class TabuleiroConsole {
    
    private Tabuleiro tabuleiro;
    private Scanner entrada = new Scanner(System.in);

    public TabuleiroConsole(Tabuleiro tabuleiro){
        this.tabuleiro = tabuleiro;

        executarJogo();
    }

    private void executarJogo(){
        try {
            
        } catch (SairException e) {
            System.out.println("Bye!");
        } finally {
            entrada.close();
        }
    }

    
}