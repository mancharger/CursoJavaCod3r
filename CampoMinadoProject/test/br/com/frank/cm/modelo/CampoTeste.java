package br.com.frank.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CampoTeste {
    
    private Campo campo;

    @BeforeEach
    void iniciarCampo(){
        campo = new Campo(3, 3);
    }

    @Test
    public void testeVizinhoRealDistancia1Esquerda(){
        Campo vizinho = new Campo(3,2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia1Direita(){
        Campo vizinho = new Campo(3,4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia1Emcima(){
        Campo vizinho = new Campo(2, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia1Embaixo(){
        Campo vizinho = new Campo(4, 3);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia2EmcimaEsquerda(){
        Campo vizinho = new Campo(2, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia2EmcimaDireita(){
        Campo vizinho = new Campo(2, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia2EmbaixoEsquerda(){
        Campo vizinho = new Campo(4, 2);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeVizinhoRealDistancia2EmbaixoDireita(){
        Campo vizinho = new Campo(4, 4);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertTrue(resultado);
    }

    @Test
    public void testeNaoVizinho(){
        Campo vizinho = new Campo(1, 1);
        boolean resultado = campo.adicionarVizinho(vizinho);
        
        assertFalse(resultado);
    }
}