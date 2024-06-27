package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    Calculadora calculo = new Calculadora();

    @Test
    public void soma(){
        assertEquals(4, calculo.calc(2, 2));
    }

}
