package com.example;

import org.junit.jupiter.api.Test;

public class MeuPrimeiroTeste {

    @Test
    public void teste01(){
        System.out.println("Teste 01 executado!");
    }

    
    public void teste02(){
        System.out.println("Teste 02 não executado.");
    }

    @Test
    public void teste03(){
        System.out.println("Teste 03 executado!");
    }

}
