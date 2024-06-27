package com.example;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class ValidacaoVerdadeiroFalsoTest {

    @Test
    public void verdadeiro(){
        boolean campoEstaPresente = true;
        assertTrue(campoEstaPresente);
    }


    @Test
    public void falso(){
        boolean campoEstaPresente = false;
        assertFalse(campoEstaPresente);
    }
    

}
