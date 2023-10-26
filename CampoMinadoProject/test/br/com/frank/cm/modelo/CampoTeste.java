package br.com.frank.cm.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.frank.cm.excecoes.ExplosaoException;

public class CampoTeste {
    
    private Campo campo;
    //testes
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

    @Test
    void testeValorPadraoAtributoMarcado(){
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacao(){
        campo.alternarMarcacao();
        assertTrue(campo.isMarcado());
    }

    @Test
    void testeAlternarMarcacaoDuasChamadas(){
        campo.alternarMarcacao();
        campo.alternarMarcacao();
        assertFalse(campo.isMarcado());
    }

    @Test
    void testeAbirNaoMinadoNaoMarcado(){
        assertTrue(campo.abrir());
    }

    @Test
    void testeAbirNaoMinadoMarcado(){
        campo.alternarMarcacao();
        assertFalse(campo.abrir());
    }
    
    @Test
    void testeAbrirMinadoMarcado(){
        campo.alternarMarcacao();
        campo.minar();
        assertFalse(campo.abrir());
    }
    
    @Test
    void testeAbrirMinadoNaoMarcado(){
        campo.minar();

        assertThrows(ExplosaoException.class, () -> {
            campo.abrir();
        });

        assertFalse(campo.abrir());
    }

    @Test
    void testeAbrirComVizinhos(){

        Campo campo11 = new Campo(1, 1);
        Campo campo22 = new Campo(2, 2);

        campo22.adicionarVizinho(campo11);

        campo.adicionarVizinho(campo22);

        campo.abrir();

        assertTrue(campo22.isAberto() && campo11.isAberto());
    }

    @Test
    void testeAbrirComVizinhos2(){
    
        Campo campo11 = new Campo(1, 1);
        Campo campo12 = new Campo(1, 1);
        campo12.minar();
        
        Campo campo22 = new Campo(2, 2);
        campo22.adicionarVizinho(campo11);
        campo22.adicionarVizinho(campo12);
    
        campo.adicionarVizinho(campo22);
        campo.abrir();
    
        assertTrue(campo22.isAberto() && campo11.isFechado());
    }
}