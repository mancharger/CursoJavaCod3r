package br.com.frank.cm;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class Teste {

    @Test
    public void testando(){
        int a = 1 + 1;

        assertEquals(2, a);
    }

    @Test
    public void testando2(){
        int x = 2 + 10 - 9;

        assertEquals(3, x);
    }

}