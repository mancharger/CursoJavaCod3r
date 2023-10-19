package br.com.frank.cm.modelo;

import java.util.ArrayList;
import java.util.List;

public class Tabuleiro {
    
    private int linhas;
    private int colunas;
    private int minas;

    private final List<Campo> campos = new ArrayList<>();

    public Tabuleiro(int linhas, int colunas, int minas){
        this.linhas = linhas;
        this.colunas = colunas;
        this.minas = minas;
    }


}