package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ExercicoModulo12Test {

    ExercicioModulo12 calculo = new ExercicioModulo12();

    @Test
    public void multiplicacao(){
        assertEquals(4, calculo.calc(2, 2));
    }

}
