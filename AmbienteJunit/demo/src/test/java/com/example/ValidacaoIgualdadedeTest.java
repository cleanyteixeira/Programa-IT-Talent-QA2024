package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ValidacaoIgualdadedeTest {

    @Test
    public void sucesso (){
        String resutado = "Registro salvo com sucesso";
        assertEquals(resutado, resutado);
    } 

    @Test
    public void falha (){
        String resutado = "Registro salvo com sucesso";
        assertEquals("Registro excluido sucesso", resutado);
    } 


}
