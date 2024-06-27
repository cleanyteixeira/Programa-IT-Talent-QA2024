package com.example;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class PreEPosComdicosDeTest {

    @BeforeEach   public void preCondicao(){
        System.out.println ("Pré Condição");
    }

    @Test
    public void metodo01(){
        System.out.println("Metoto 01");
    }

    @Test
    public void metodo02(){
        System.out.println("Metoto 02");
    }

    @AfterEach
    public void posCondicao(){
        System.out.println("Pós Condição");
    }

    

}
